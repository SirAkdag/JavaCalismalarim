public class AsalSayi {
    public static void main(String[] args) {
        int num;
        boolean isTrue;

        for (num = 2; num <= 100; num++) {
            isTrue = false;
            for (int j = 2; j <= num / 2; j++) {
                if (num % j == 0) {
                    isTrue = true;
                    break;
                }
            }
            if (!isTrue)
                System.out.print(num + "  ");
        }


    }
}
