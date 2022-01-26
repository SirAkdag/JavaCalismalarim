import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;
        double sonuc;
        System.out.print("Lütfen Bir Yil Giriniz: ");
        yil = input.nextInt();

        sonuc = yil%4;

        if (sonuc != 0){
            System.out.println(yil+ " artik bir yil degildir ");
        }else {
            System.out.println(yil + " artik bir yildir !");
        }

    }
}
