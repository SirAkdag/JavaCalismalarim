import java.util.Scanner;

public class KdvProje {
    public static void main(String[] args) {
        double tutar,kdv1=0.18,kdv2=0.08;

        Scanner input= new Scanner(System.in);
        System.out.print("Bir Tutar Giriniz :");
        tutar= input.nextInt();

        boolean sonuc1= !(tutar<1000);
        boolean sonuc2= tutar>=1000;

        double dFiyat= tutar*kdv2;
        double yFiyat= tutar*kdv1;
        boolean girilenTutar = sonuc2 || sonuc1;


        String str = girilenTutar ? ("Sonuc: " + dFiyat) : ("Sonuc: " + yFiyat);
        System.out.println(str);
    }
}
