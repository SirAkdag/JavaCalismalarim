import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, newPassword;
        int select;
        Scanner input = new Scanner(System.in);
        Scanner pw = new Scanner(System.in);

        System.out.print("Kullanici Adiniz: ");
        userName = input.nextLine();

        System.out.print("Sifreniz: ");
        password = input.nextLine();
        if (userName.equals("emreakdag") && password.equals("paticilli123")) {
            System.out.print("Giris Basarili !");
        } else {
            System.out.println("Giris Bilgilerinizi Kontrol Edip Tekrar Deneyiniz !");
            System.out.println("Sifrenizi Degistirmek Ister misiniz? \n1-Evet\n2-Hayir");
            select = input.nextInt();
            if (select == 1) {
                System.out.print("Yeni sifreni giriniz: ");
                newPassword = pw.nextLine();
                if (newPassword.equals("paticilli123")) {
                    System.out.println("Girdiginiz Sifre Bir Önceki Sifrenizle Ayni Olamaz !");
                } else {
                    System.out.println("Sifreniz Basarili Bir Sekilde Degistirildi !");
                }

            } else {
                System.out.println("Sifre Degistirme Talebi Reddedildi !");
            }


        }


    }
}