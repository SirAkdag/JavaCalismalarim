import java.util.Scanner;

public class KdvProje {
    public static void main(String[] args) {
        double tutar, kdvOrani;
        Scanner input = new Scanner(System.in);

        System.out.print("Tutarı Girin: ");
        tutar = input.nextDouble();

        boolean kdv = tutar > 1000;
        kdvOrani = kdv ? 0.08 : 0.18 ;

        double kdvTutari = tutar * kdvOrani;

        System.out.println("KDV'li Fiyat: " + (tutar+ kdvTutari));
        System.out.println("KDV'siz Fiyat: " + tutar );
        System.out.println("KDV' Tutarı: " + kdvTutari);


    }
}
