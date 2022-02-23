import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 1;
        System.out.print("Kac Elemanli Bir Dizi Istediginizi Belirtiniz: ");
        int select = input.nextInt();
        int[] list = new int[select];
        for (int i = 0; i < list.length; i++) {
            System.out.print(number + ". Eleman: ");
            int value = input.nextInt();
            list[i] = value;
            number++;
        }
        Arrays.sort(list);
        System.out.println("\nSiralama: " + Arrays.toString(list));

    }
}
