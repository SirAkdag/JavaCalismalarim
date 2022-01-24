import java.util.Scanner;

public class CalismaSinifi {
    public static void main(String[] args) {
        int day, month;
        String burc = "";
        boolean isError = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Dogdugunuz Ayi Giriniz :");
        month = input.nextInt();
        System.out.print("Lütfen Dogdugunuz Günü Giriniz: ");
        day = input.nextInt();

        if (day >= 1 && day <= 31) {
            if (day < 22) {
                burc = "Oglak";
            } else {
                burc = "Kova";
            }
        } else {
            isError = true;
        }
        if (day >= 1 && day <= 28){
            if (day <=19) {

            }
        }


    }
}
