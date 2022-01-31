import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1.sayıyı giriniz : ");
        int number1 = scanner.nextInt();

        System.out.print("2.sayıyı giriniz : ");
        int number2 = scanner.nextInt();
        int ebob = 1;
        int i = 2;
        while (i <= number1 && i <= number2) {
            if (number1 % i == 0 && number2 % i == 0)
                ebob = i;
            i++;
        }
        int ekok = (number1 * number2) / ebob;
        System.out.println("Ebob :" + ebob);
        System.out.println("Ekok :" + ekok);
    }
}
