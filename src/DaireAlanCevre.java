import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {
        int r;
        double pi= 3.14, alan, cevre;

        Scanner input= new Scanner(System.in);

        System.out.print("Yari cap degerini giriniz: ");
        r= input.nextInt();
        alan= pi*r*r;
        cevre= 2*pi*r;
        System.out.println("Dairenin alani: " + alan);
        System.out.println("Dairenin cevresi: " + cevre);


    }
}
