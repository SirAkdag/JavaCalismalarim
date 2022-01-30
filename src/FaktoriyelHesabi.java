import java.util.Scanner;

public class FaktoriyelHesabi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, toplam = 1;
        System.out.print("Bir Faktöriyel Giriniz: ");
        x = input.nextInt();
        for (int y = 1; y <= x; y++){
            toplam = toplam * y;
        }
        System.out.println(x + "'ün Faktöriyeli: " + toplam);
    }
}
