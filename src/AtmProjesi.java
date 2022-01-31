import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        String userName, password;
        int credit = 3, button;
        double giris, cikis, balance = 3700.0;

        Scanner input = new Scanner(System.in);
        while (credit > 0) {
            System.out.print("Lütfen Kullanici Adinizi Giriniz: ");
            userName = input.nextLine();
            System.out.print("Lütfen Sifrenizi Giriniz: ");
            password = input.nextLine();
            if (userName.equals("emreakdag") && (password.equals("patika123"))) {
                System.out.println("\nMerhaba Emre Bey, Pati Bankasina Hosgeldiniz !");
                do {
                    System.out.println("\n1 -Para Yatirma\n2 -Para Cekme\n3 -Bakiye Sorgulama\n4 -Cikis Yap");
                    System.out.print("\nLütfen Yapmak Istediginiz Islemi Belirtiniz: ");
                    button = input.nextInt();
                    switch (button) {
                        case 1:
                            System.out.print("\nLütfen Yatirmak Istediginiz Tutari: ");
                            giris = input.nextDouble();
                            balance += giris;
                            System.out.println("\nPara Yatirma Isleminiz Basariliyla Gerceklesmistir.\n");
                            break;
                        case 2:
                            System.out.print("\nLütfen Cekmek Istediginiz Tutari Giriniz: ");
                            cikis = input.nextDouble();
                            if (cikis<balance){
                                balance -= cikis;
                                System.out.println("\nLütfen Paranizi Sag Alttaki Hazneden Aliniz.");

                            }else {
                                System.out.print("\nYetersiz Bakiye. Lütfen Gecerli Bir Miktar Giriniz.\n");
                            }

                            break;


                        case 3:
                            System.out.println("\nGüncel Bakiyeniz : " + balance);
                            break;
                    }


                } while (button != 4);
                System.out.println("\nBizi Tercih Ettiginiz Icin Tesekkürler !\n\nIyi Günler Emre Bey.\n\n");
                break;

            } else {
                credit--;
                System.out.println("\nHatali Kullanici Adi veya Parola.\n\nLütfen Bilgilerinizi Kontrol Edip Tekrar Deneyiniz !");
                System.out.println("\n** Kalan Hakkiniz: " + credit + " **");
                if (credit <= 0) {
                    System.out.print("Hesabiniz Bloke Edilmistir. Lütfen Bankanizla Iletisime Geciniz !");
                }
            }


        }

    }
}
