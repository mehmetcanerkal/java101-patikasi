package Giris;

import java.util.Scanner;

public class UcveDort {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int i,k,sayac = 0,toplam = 0;
        System.out.print("Bir sayı giriniz : ");
        k = giris.nextInt();

        System.out.println("3 ve 4'e tam bolunen sayilar: ");

        for (i = 0; i<k; i++){
            if ((i%3 == 0) && (i%4 == 0)){
                toplam += i;
                sayac++;
                System.out.println(" " + i);
            }
        }
        System.out.println(" ");
        System.out.println("\"Ortalama : " + (toplam/sayac));
    }
}
