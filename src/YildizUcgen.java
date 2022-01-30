import java.util.Scanner;

public class YildizUcgen {
    public static void main(String[] args) {
        int basSayisi;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayisini Giriniz: ");
        basSayisi = input.nextInt();
        for (int a = 1; a <= basSayisi; a++) {
            for (int b = 1; b <= (basSayisi - a); b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= (2 * a) - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }for (int a = basSayisi; a >= 1; a--) {
            for (int b = 1; b <= (basSayisi - a); b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= (2 * a) - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
