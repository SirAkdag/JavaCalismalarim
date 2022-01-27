import java.util.Scanner;

public class CiftSayiToplam {
    public static void main(String[] args) {
        int a, tekrar = 0, toplam = 0, ortalama;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayi Giriniz: ");
        a = input.nextInt();

        for (int b = 0; b <= a; b++) {
            if ((b % 3 == 0) && (b % 4 == 0)) {
                System.out.println(b);
                tekrar++;
                toplam += b;
            }
        }

        System.out.println("Sayilarin Toplami: " + toplam);
        ortalama = toplam/tekrar;
        System.out.println("Sayilarin Ortalamasi: " + ortalama);

    }
}
