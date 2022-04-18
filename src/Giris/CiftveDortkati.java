package Giris;

import java.util.Scanner;

public class CiftveDortkati {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int k;
        int toplam = 0;

        do {
            System.out.print("Bir sayı giriniz : ");
            k = giris.nextInt();
            if (k%4 == 0){
                toplam += k;
            }

        }while (k %2 == 0);
        System.out.println("Çift ve 4'ün katı olan sayıların toplamı : " + toplam);
    }
}
