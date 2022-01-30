import java.util.Scanner;

public class TwoPower {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayi Giriniz: ");
        x = input.nextInt();
        for (int y = 1; y <= x; y*=4){
            System.out.println("Girilen Sayiya Kadar 4'ün Katlari: "+ y + ",");
        }
        System.out.println("----------------------------------");
        for (int z = 1; z <= x; z *= 5){
            System.out.println("Girilen Sayiya Kadar 5'in Katlari: " + z);
        }
    }
}
