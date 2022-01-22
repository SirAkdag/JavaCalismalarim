import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        double a, b;
        int islem;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci degeri giriniz: ");
        a = input.nextDouble();
        System.out.print("Ikinci degeri giriniz: ");
        b = input.nextDouble();

        System.out.println("Yapmak istediginiz islemi belirtiniz: ");
        System.out.println("1-Toplama\n2-Cikarma\n3-Bölme\n4-Carpma");
        islem = input.nextInt();

        switch (islem) {
            case 1:
                System.out.println("Toplama Islemi Sonucu: " + (a + b));
                break;
            case 2:
                System.out.println("Cikarma Islemi Sonucu: " + (a - b));
                break;
            case 3:
                if (b != 0) {
                    System.out.println("Bölme Islemi Sonucu: " + (a / b));
                } else
                    System.out.println("Bir Sayi 0'a Bölünemez!");
                break;
            case 4:
                System.out.println("Carpma Islemi Sonucu: " + (a * b));
                break;
        }

    }
}
