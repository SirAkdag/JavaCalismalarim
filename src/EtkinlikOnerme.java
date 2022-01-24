import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Hava Sicakligini Giriniz: ");
        sicaklik = input.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kaymaya Gidebilirsiniz !");
        } else if (sicaklik <= 25) {
            if (sicaklik <= 15) {
                System.out.println("Sinemaya Gidebilirsiniz !");
            }
            if (sicaklik >= 15) {
                System.out.println("Piknige Gidebilirsiniz !");
            }

        } else {
            System.out.println("Yüzmeye Gidebilirsiniz !");
        }


    }
}
