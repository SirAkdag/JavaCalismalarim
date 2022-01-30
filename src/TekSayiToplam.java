import java.util.Scanner;

public class TekSayiToplam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, total = 0;

        do {
            System.out.print("Bir Sayi Giriniz: ");
            x = input.nextInt();
            // 4 e bölünen her sayi ayni zamanda cift oldugu icin x % 2 == 0 eklememize gerek yok.
            if (x % 4 == 0) {
                total += x;

            }

        } while (x % 2 == 0);
        System.out.print("Girilen cift ve 4'ün katlari olan sayilarin toplami: " + total);

    }
}
