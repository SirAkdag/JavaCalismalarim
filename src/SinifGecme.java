import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik,count=0,toplam=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = input.nextInt();
        if (mat <= 0 || mat >= 100) {

        }else {
            count++;
            toplam += mat;
        }



        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = input.nextInt();
        if (fizik <= 0 || fizik >= 100) {
        }else {
            count++;
            toplam += fizik;
        }

        System.out.print("Türkce Notunuzu Giriniz: ");
        turkce = input.nextInt();
        if (turkce <= 0 || turkce >= 100) {
        }else {
            count++;
            toplam+=turkce;
        }

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = input.nextInt();
        if (kimya <= 0 || kimya >= 100) {
        }else {
            count++;
            toplam += kimya;
        }

        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik = input.nextInt();
        if (muzik <= 0 || muzik >= 100) {
        }else {
            count++;
            toplam += muzik;
        }

        double average= (toplam / count);

        if (average >= 55) {
            System.out.println("Tebrikler Sinifi Gectiniz !");
        } else {
            System.out.println("Üzgünüz, Sinifta Kaldiniz !");
        }
        System.out.println("Ortalamaniz: " + average);


    }
}
