package Giris;

import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        int day;
        int month;
        String burc = "" ;
        boolean isError = false;
        Scanner giris = new Scanner(System.in);


        System.out.print("Doğduğunuz günü giriniz : ");
        day = giris.nextInt();

        System.out.print("Doğduğunuz ayı giriniz : ");
        month = giris.nextInt();



        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day > 21) {
                    burc = " Kova";
                } else {
                    burc ="Oğlak";
                }
            }else{
                isError = true;
            }
        }

        if (month == 2) {
            if (day >= 1 && day <= 28) {
                if (day > 19) {
                    burc ="Balık";
                } else {
                    burc ="Kova";
                }
            }else{
                isError = true;
            }
        }

        if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day > 21) {
                    burc ="Koç";
                } else {
                    burc ="Balık";
                }
            }else{
                isError = true;
            }
        }
        if (month == 4) {
            if (day >= 1 && day <= 30) {
                if (day > 21) {
                    burc ="Boğa";
                } else {
                    burc ="Koç";
                }
            }else{
                isError = true;
            }
        }

        if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day > 21) {
                    burc ="İkizler";
                } else {
                    burc ="Boğa";
                }
            }else{
                isError = true;
            }
        }

        if (month == 6) {
            if (day >= 1 && day <= 30) {
                if (day > 22) {
                    burc ="Yengeç";
                } else {
                    burc ="İkizler";
                }
            }else{
                isError = true;
            }
        }

        if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day > 22) {
                    burc ="Aslan";
                } else {
                    burc ="Yengeç";
                }
            }else{
                isError = true;
            }
        }
        if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day > 22) {
                    burc ="Başak";
                } else {
                    burc ="Aslan";
                }
            }else{
                isError = true;
            }
        }

        if (month == 9) {
            if (day >= 1 && day <= 30) {
                if (day > 22) {
                    burc ="Terazi";
                } else {
                    burc ="Başak";
                }
            }else{
                isError = true;
            }
        }

        if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day > 22) {
                    burc ="Akrep";
                } else {
                    burc ="Terazi";
                }
            }else{
                isError = true;
            }
        }

        if (month == 11) {
            if (day >= 1 && day <= 30) {
                if (day > 21) {
                    burc ="Yay";
                } else {
                    burc ="Akrep";
                }
            }else{
                isError = true;
            }
        }
        if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day > 21) {
                    burc ="Oğlak";
                } else {
                    burc ="Yay";
                }
            }else{
                isError = true;
            }
        }

        if (isError){
            System.out.println("Hatalı giriş yaptınız.");
        }else{
            System.out.println("Burcunuz : " + burc);
        }
    }
}