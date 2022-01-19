import java.util.Scanner;

public class KdvHesap {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        double kdvOran= 0.18,kdvTutari, kdvliTutar;
        System.out.print("Lütfen bir tutar giriniz : ");
        int fiyat= inp.nextInt();
        kdvTutari= fiyat*kdvOran;
        kdvliTutar = kdvTutari+ fiyat;
        System.out.println("KDV tutari : " + kdvTutari);
        System.out.print("KDV dahil tutar : "+ kdvliTutar);


    }
}
