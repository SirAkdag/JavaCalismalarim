import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        int basamak;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayisini Giriniz: ");
        basamak = input.nextInt();

        for (int i = basamak; i>=1; i--){
            for (int k = 0; k<= (basamak-i); k++){
                System.out.print(" ");
            }
            for (int j = 1; j<= (2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
