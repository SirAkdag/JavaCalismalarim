import java.util.Scanner;

public class calisma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, temp =0;
        System.out.print("sayi: ");
        n = input.nextInt();

        for (int x = n; x >= -4; x -= 5) {
            temp=x;
            System.out.println(x);
        }
        for (int y = temp+5; y <= n; y += 5) {
            System.out.println(y);
        }

    }
}