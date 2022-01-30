import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, basValue, result = 0;
        System.out.print("Bir Sayi Giriniz: ");
        sayi = input.nextInt();

        while (sayi != 0) {
            basValue = sayi % 10;
            System.out.println(basValue);
            sayi = sayi / 10;
            result += basValue;
        }
        System.out.print("Basamaklarin Toplam Degeri: " + result);
    }
}
