import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter Fibonacci series of count: ");
        int count = scan.nextInt();
        System.out.println("Fibonacci Series of "+count+" numbers:");
        int i=1;
        while(i<=count)
        {
            System.out.println(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
    }
}
