import java.util.Scanner;

public class RecursivePattern {
    static void value(int n) {
        int temp = 0;
        for (int x = n; x >= -4; x -= 5) {
            temp = x;
            System.out.print(x + "  ");
        }
        for (int y = temp + 5; y <= n; y += 5) {
            System.out.print(y+"  ");
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayi Giriniz: ");
        int n = input.nextInt();
        value(n);
    }
}
