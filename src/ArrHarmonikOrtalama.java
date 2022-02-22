public class ArrHarmonikOrtalama {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        double result =0.0;
        double sum = 0.0;
        for (int i = 0; i < list.length; i++) {
            result += 1.0/ list[i];
            System.out.println(result);
            sum += result;
        }
        double avarage = sum / list.length;
        System.out.println("\nDizideki Sayilarin Harmonik Ortalamasi : " + avarage);

    }


}
