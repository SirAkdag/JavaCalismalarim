import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int number, counter = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz: ");
        number = input.nextInt();
        for (int x = 1; x < number; x++) {
            if (number % x == 0) {
                System.out.println(x);
                counter += x;
            }
        }
        System.out.println("------------------");
        if (counter == number) {
            System.out.println(number + " Mükemmel Sayidir.");
        } else {
            System.out.println(number + " Mükemmel Sayi Degildir.");
        }
    }
}
