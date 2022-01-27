import java.util.Scanner;

public class calisma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        System.out.print(" sayi");
        N = input.nextInt();
        int result = N % 2;

        if (result != 0 ) {
            System.out.println("Weird");
        }
        if (result == 0) {
            if (N > 2 && N < 5) {
                System.out.println("Not Weird");
            }else if (N >6 && N <= 20){
                System.out.println("Weird");
            }else if (N > 20){
                System.out.println("Not Weird");
            }
        }
    }
}
