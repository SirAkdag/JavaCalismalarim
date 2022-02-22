import java.util.Arrays;
import java.util.Scanner;

public class ArrMinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz: ");
        int number = input.nextInt();
        int[] list = {15, 12, 788, 1, -1, -788, 2, 0};
        int min, max;
        Arrays.sort(list);
        if (number < list[0] || number > (list.length) - 1) {
            System.out.println("Aralikta Olmayan Bir Deger Girdiniz !");
            System.out.println(Arrays.toString(list));
        } else {
            for (int x = 0; x < list.length; x++) {
                if (number < list[x]) {
                    min = list[x - 1];
                    max = list[x];
                    System.out.println(Arrays.toString(list) + "\n");
                    System.out.println("Girilen Sayidan Kucuk Deger: " + min);
                    System.out.println("Girilen Sayidan Büyük Deger: " + max);
                    System.out.println("===============");
                    break;
                }
            }
        }

    }
}
