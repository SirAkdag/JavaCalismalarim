import java.util.Scanner;

public class KdvProje {
    public static void main(String[] args) {
        double tutar,kdvTutari,kdvliTutar,kdvsizTutar,kdv1=0.18,kdv2=0.08;
        Scanner input= new Scanner(System.in);
        System.out.print("Bir Tutar Giriniz :");
        tutar= input.nextInt();

        boolean durum1= tutar <1000;
        boolean durum2= tutar >1000;
        double dFiyat= tutar*kdv2;
        double yFiyat= tutar*kdv1;
        boolean girilenTutar = durum1 || durum2;


        String str = girilenTutar ? "Kdv Tutari: "+dFiyat :"Kdv Tutari:"+yFiyat;
        System.out.println(str);
    }
}
