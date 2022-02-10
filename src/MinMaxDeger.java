import java.util.Scanner;

public class MinMaxDeger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, numberCount = 1, tempNumber, kucuk = 0, buyuk = 0;
        System.out.print("Kac Adet Sayi Girmek Istiyorsunuz: ");
        x = input.nextInt();

        for (int i = 1; i <= x; i++) {
            System.out.print(numberCount + ". Sayiyi Giriniz: ");
            tempNumber = input.nextInt();
            numberCount++;

            if (tempNumber > buyuk) {
                if (kucuk == 0) {
                    kucuk = tempNumber;
                }
                buyuk = tempNumber;
<<<<<<< HEAD

            }else if (tempNumber < kucuk ) {
=======
            }
            if (tempNumber < kucuk) {
                if (buyuk == 0){
                    buyuk = tempNumber;
                }
>>>>>>> refs/remotes/origin/master
                kucuk = tempNumber;
            }
        }
        System.out.println("\nEn Büyük: " + buyuk);
        System.out.println("En Kücük: " + kucuk);
    }
}
