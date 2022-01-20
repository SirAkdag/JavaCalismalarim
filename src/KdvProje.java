import java.util.Scanner;

public class KdvProje {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        double girilenTutar, kdvOrani= 0.18,kdvOrani2= 0.08;

        System.out.print("Lütfen bir tutar giriniz: ");
        girilenTutar= input.nextDouble();

        boolean kdvliTutar= girilenTutar>=1000;

        //durum1, girilen tutar 1000den fazla ise;
        double durum1= (girilenTutar*kdvOrani2);

        //durum2, girilen para 1000den az ise;
        double durum2= (girilenTutar*kdvOrani);

        double sonuc= (kdvliTutar) ? durum1:durum2;

        System.out.println("KDV tutari: " + sonuc);
        System.out.println("KDV dahil tutar: " +(girilenTutar+sonuc));
    }
}
