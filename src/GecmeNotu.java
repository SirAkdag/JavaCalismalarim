import java.util.Scanner;

public class GecmeNotu {
    public static void main(String[] args) {
       int vize,Final;
       Scanner input= new Scanner (System.in);
        System.out.print("Lütfen vize notunuzu giriniz: ");
        vize= input.nextInt();

        System.out.print("Lütfen final notunuzu giriniz: ");
        Final=input.nextInt();
        boolean durum=(Final*0.60)+(vize*0.40)>=60;
        double gecmeNotu=(Final*0.60)+(vize*0.40);
        if(durum){
            System.out.println("Tebrikler Gectiniz");
            System.out.println("Not Ortalamaniz: " + gecmeNotu);
        }else {
            System.out.println("Kaldiniz");
            System.out.println("Not Ortalamaniz: " + gecmeNotu);
        }




    }
}
