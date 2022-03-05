import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        boolean isMistake = false;
        boolean isWin = false;
        int[] wrong = new int[5];
        int number = rand.nextInt(100);
        int right = 0;
        System.out.println(number);

        while (right < 5) {
            System.out.print("Tahmin ettiginiz sayiyi giriniz: ");
            int select = input.nextInt();
            if (select < 0 || select > 99) {
                if (isMistake) {
                    right++;
                    System.out.println("Cok fazla hatali giris yaptiniz. Kalan hakkiniz: " + (5 - right));

                } else {
                    isMistake = true;
                    System.out.println("Bir sonraki hatali girisinizde hakkiniz azalacaktir.");
                }
                continue;
            }
            if (select == number) {
                System.out.println("Tebrikler, dogru tahmin ! ");
                isWin = true;
                break;
            } else {
                wrong[right++] = select;
                if (select > number) {
                    System.out.println("Girdiginiz sayi, gizli sayidan büyüktür.");
                    System.out.println("Kalan hakkiniz: " + (5 - right));
                } else {
                    System.out.println("Girdiginiz sayi, gizli sayidan kücüktür.");
                    System.out.println("Kalan hakkiniz: " + (5 - right));
                }

            }
        }
        if (!isWin){
            System.out.println("Kaybettiniz!");
            if (!isMistake){
                System.out.println(Arrays.toString(wrong));


            }
        }
    }
}
