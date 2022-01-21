import java.util.Scanner;

public class ManavHesap {
    public static void main(String[] args) {
        //Degiskenleri tanitalim;
        double kg,elma=3.67,armut=2.14,muz=0.95,patlican=5.0,domates=1.11;
        Scanner input= new Scanner(System.in);

        System.out.print("Armutun kilosunu giriniz: ");
        kg=input.nextDouble();
        double tArmut= kg*armut;
        System.out.println("Armutun fiyati: "+tArmut);

        System.out.print("Elmanin kilosunu giriniz: ");
        kg=input.nextDouble();
        double tElma= kg*elma;
        System.out.println("Elmanin fiyati: "+tElma);

        System.out.print("Muzun kilosunu giriniz: ");
        kg=input.nextDouble();
        double tMuz= kg*muz;
        System.out.println("Muzun fiyati: "+tMuz);

        System.out.print("Patlicanin kilosunu giriniz: ");
        kg= input.nextDouble();
        double tPatlican=kg*patlican;
        System.out.println("Patlicanin fiyati: "+tPatlican);

        System.out.print("Domatesin kilosunu giriniz: ");
        kg=input.nextDouble();
        double tDomates= kg*domates;
        System.out.println("Domatesin fiyati: " + tDomates);

        System.out.println("Toplam ödenecek tutar : "+(tArmut+tDomates+tElma+tMuz+tPatlican));




    }
}
