import java.util.Scanner;

public class AsalSayi2 {
    static int asal(int a) {
        int result = 0;
        for (int n = 2; n <= a; n++){
            if (a%n == 0){
                result += n;
            }
        }
        if (result==a){
            System.out.print(a + " Sayisi Asaldir");
        }else
            System.out.print(a + " Sayisi Asal Degildir");
        return 1;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("Bir Sayi Giriniz: ");
        a = input.nextInt();
        asal(a);
    }
}
