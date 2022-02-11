import java.util.Scanner;

public class UsHesabi2 {

    static void power(int a, int b) {
        int result = 1;
        for (int x = 1; x <= b; x++) {
            result *= a;
        }
        System.out.print(a + " üssü " + b + " isleminin sonucu: " + result);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban Sayisini giriniz: ");
        int a = input.nextInt();
        System.out.print("Üs Sayisini Giriniz: ");
        int b = input.nextInt();
        power(a, b);
    }
}
