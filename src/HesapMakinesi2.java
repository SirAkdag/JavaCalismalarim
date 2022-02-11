import java.util.Scanner;
import java.util.logging.SocketHandler;

public class HesapMakinesi2 {
    static int toplama(int a, int b) {
        int result = a + b;
        System.out.println("Toplama Islemi Sonucu: " + result);
        System.out.println("-------------------------------");
        return result;
    }

    static int cikarma(int a, int b) {
        int result = a - b;
        System.out.println("Cikarma Isleminin Sonucu: " + result);
        System.out.println("-------------------------------");
        return result;
    }

    static int bolme(int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println("Hatali Giris Yaptiniz.");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölme Isleminin Sonucu: " + result);
        System.out.println("-------------------------------");
        return result;

    }

    static int carpma(int a, int b) {
        int result = a * b;
        System.out.println("Carpma Isleminin Sonucu: " + result);
        System.out.println("-------------------------------");
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int x = 1; x <= b; x++) {
            result *= a;
        }
        System.out.println("Üs Hesaplama Sonucu : " + result);
        System.out.println("-------------------------------");
        return result;
    }

    static int mod(int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println("Hatali Giris Yaptiniz.");
            return 0;
        }
        int result = a % b;
        System.out.println("Mod Islem Sonucu: " + result);
        System.out.println("-------------------------------");
        return result;
    }

    static int calc(int a, int b) {
        int result1 = 2 * (a + b);
        int result2 = a * b;
        System.out.println("Dikdörtgenin Alani: " + result2);
        System.out.println("Dikdörtgenin Cevresi: " + result1);
        System.out.println("-------------------------------");
        return result2 + result1;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = ("\n\n1 - Toplama\n" +
                "2 - Cikarma\n" +
                "3 - Bölme\n" +
                "4 - Carpma\n" +
                "5 - Üslü Sayi Hesaplama\n" +
                "6 - Mod Alma\n" +
                "7 - Dörtgen Alan ve Cevre Hesaplama\n" +
                "8 - Cikis Yap\n\n" +
                "Yapmak Istediginiz Islemi Belirtiniz: ");
        System.out.print(menu);
        while (true) {
            select = input.nextInt();
            System.out.print("Ilk Degeri Giriniz: ");
            int a = input.nextInt();
            System.out.print("Ikinci Degeri Giriniz: ");
            int b = input.nextInt();
            switch (select) {
                case 1:
                    toplama(a, b);
                    break;
                case 2:
                    cikarma(a, b);
                    break;
                case 3:
                    bolme(a, b);
                    break;
                case 4:
                    carpma(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    mod(a, b);
                    break;
                case 7:
                    calc(a, b);
                    break;
                case 8:
                    System.out.println("Güle güle...");
                    break;
                default:
                    System.out.println("Hatali Giris Yaptiniz.");
            }
        }
    }
}
