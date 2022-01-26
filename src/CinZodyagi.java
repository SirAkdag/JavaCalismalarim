import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil, kalan;
        String burc = "";
        System.out.print("Lütfen Dogdugunuz Yili Giriniz: ");
        yil = input.nextInt();
        kalan = yil % 12;

        switch (kalan) {
            case 0:
                burc = "Maymun";
                break;
            case 1:
                burc = "Horoz";
                break;
            case 2:
                burc = "Köpek";
                break;
            case 3:
                burc = "Domuz";
                break;
            case 4:
                burc = "Fare";
                break;
            case 5:
                burc = "Öküz";
                break;
            case 6:
                burc = "Kaplan";
                break;
            case 7:
                burc = "Tavsan";
                break;
            case 8:
                burc = "Ejderha";
                break;
            case 9:
                burc = "Yilan";
                break;
            case 10:
                burc = "At";
                break;
            case 11:
                burc = "Koyun";
                break;
        }

        System.out.print("Cin Zodyagi Burcunuz: " + burc);

    }
}
