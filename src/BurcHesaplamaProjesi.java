import java.util.Scanner;

public class BurcHesaplamaProjesi {
    public static void main(String[] args) {
        int day, month;
        String burc = "";
        boolean isError = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Dogdugunuz Ayi Giriniz :");
        month = input.nextInt();
        System.out.print("Lütfen Dogdugunuz Günü Giriniz: ");
        day = input.nextInt();
        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Oglak";
                } else {
                    burc = "Kova";
                }
            } else {
                isError = true;
            }
        }
        if (month == 2) {
            if (day >= 1 && day <= 28) {
                if (day <= 19) {
                    burc = "Kova";
                } else {
                    burc = "Balik";
                }
            } else {
                isError = true;
            }
        }

        if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day <= 20) {
                    burc = "Balik";
                } else {
                    burc = "Koc";
                }
            } else {
                isError = true;
            }
        }
        if (month == 4) {
            if (day >= 1 && day <= 30) {
                if (day <= 20) {
                    burc = "Koc";
                } else {
                    burc = "Boga";
                }
            } else {
                isError = true;
            }
        }
        if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    burc = "Boga";
                } else {
                    burc = "Ikizler";
                }
            } else {
                isError = true;
            }
        }
        if (month == 6) {
            if (day >= 1 && day <= 30) {
                if (day <= 22) {
                    burc = "Ikizler";
                } else {
                    burc = "Yengec";
                }
            } else {
                isError = true;
            }
        }
        if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    burc = "Yengec";
                } else {
                    burc = "Aslan";
                }
            } else {
                isError = true;
            }
        }
        if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    burc = "Aslan";
                } else {
                    burc = "Basak";
                }
            } else {
                isError = true;
            }
        }
        if (month == 9) {
            if (day >= 1 && day <= 30) {
                if (day <= 22) {
                    burc = "Basak";
                } else {
                    burc = "Terazi";
                }
            } else {
                isError = true;
            }
        }
        if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
            } else {
                isError = true;
            }
        }
        if (month == 11) {
            if (day >= 1 && day <= 30) {
                if (day <= 21) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
            } else {
                isError = true;
            }
        }
        if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    burc = "Yay";
                } else {
                    burc = "Oglak";
                }
            } else {
                isError = true;
            }
        }


        if (isError) {
            System.out.println("Hatali Giris Yaptiniz, Lütfen Tekrar Deneyiniz !");
        } else {
            System.out.println("Burcunuz : " + burc);
        }
    }
}
