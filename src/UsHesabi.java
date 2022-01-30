import java.util.Scanner;

public class UsHesabi {
    public static void main(String[] args) {
        int n,k,toplam = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü Alinacak Sayi: ");
        n = input.nextInt();
        System.out.print("Üs Olacak Sayi: ");
        k= input.nextInt();


        for (int i = 1; i <= k ; i++){
            toplam *= n;
        }
        System.out.println(n+"^"+ k +": "+ toplam);

    }
}
