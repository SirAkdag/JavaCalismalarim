import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        //Degiskenleri olustur
        int mat,fizik,kimya,turkce,tarih,muzik;
        // Scanner sinifini olustur
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz = ");
        mat= inp.nextInt();

        System.out.print("Fizik Notunuz = ");
        fizik= inp.nextInt();

        System.out.print("Kimya Notunuz = ");
        kimya= inp.nextInt();

        System.out.print("Turkce Notunuz = ");
        turkce= inp.nextInt();

        System.out.print("Tarih Notunuz = ");
        tarih= inp.nextInt();

        System.out.print("Muzik Notunuz = ");
        muzik= inp.nextInt();

        double ortalama= (mat+fizik+kimya+turkce+tarih+muzik)/6.0;
        System.out.println("Derslerinizin ortalamasi = " + ortalama);

        boolean kosul1= ortalama<60;
        boolean kosul2= ortalama>=60;
        boolean sonuc = kosul1 || kosul2;
        String cevap = sonuc ? "Gecti" : "Kaldi";
        System.out.println(cevap);



    }
}
