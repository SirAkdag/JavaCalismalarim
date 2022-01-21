import java.util.Scanner;

public class VucutKitleIndeks {
    public static void main(String[] args) {
        double kg,boy,indeks;
        Scanner input= new Scanner(System.in);

        System.out.print("Lütfen boyunuzu belirtiniz: ");
        boy= input.nextDouble();

        System.out.print("Lütfen kilonuzu belirtiniz: ");
        kg= input.nextDouble();
        indeks=kg/(boy*boy);

        System.out.print("Vücut Kitle Endeksiniz: "+ indeks);

    }
}
