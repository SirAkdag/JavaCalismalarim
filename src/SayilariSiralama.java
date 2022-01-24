import java.util.Scanner;

public class SayilariSiralama {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayiyi Giriniz: ");
        a = input.nextInt();

        System.out.print("Ikinci Sayiyi Giriniz: ");
        b = input.nextInt();

        System.out.print("Ücüncü Sayiyi Giriniz: ");
        c = input.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.print("a<b<c");
            } else {
                System.out.println("a<c<b");
            }
        } else if ((b < a) && (b < c)) {
            if (c < a) {
                System.out.print("b<c<a");
            } else {
                System.out.print("b<a<c");
            }
        } else if ((c < a) && (c < b)) {
            if (a < b) {
                System.out.print("c<a<b");
            } else {
                System.out.print("c<b<a");
            }
        }


    }
}
