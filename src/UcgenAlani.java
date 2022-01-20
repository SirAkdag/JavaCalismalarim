import java.util.Scanner;

public class UcgenAlani {
    public static void main(String[] args) {
        //degiskenlerimizi ekleyelim;
        int a,b,c;
        //kullanicidan veri alalim;
        Scanner girdi= new Scanner(System.in);

        System.out.print("a degerini giriniz: ");
        a= girdi.nextInt();

        System.out.print("b degerini giriniz: ");
        b=girdi.nextInt();

        System.out.print("c degerini giriniz: ");
        c=girdi.nextInt();

        int cevre= a+b+c;
        // aCevre, alani hesaplamak icin cevrenin yarisi alinmitir
        int aCevre= (a+b+c)/2;
        System.out.println("Ucgenin Cevresi: " + cevre);

        double alan= Math.sqrt(aCevre*(aCevre-a)*(aCevre-b)*(aCevre-c));
        System.out.println("Ucgenin Alani: " + alan);



    }
}
