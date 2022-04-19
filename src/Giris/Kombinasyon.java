package Giris;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int n,r,t;
        int nf,rf,tf;
        int total1 =1,total2 = 1,total3 = 1;
        int komb;

        System.out.print("N sayısını giriniz : ");
        n = giris.nextInt();
        System.out.print("R sayısını giriniz : ");
        r = giris.nextInt();

        for (nf=1; nf<=n; nf++){
            total1 = total1 * nf;
        }
        System.out.println("N! : " + total1);

        for (rf=1; rf<=r; rf++){
            total2 = total2 * rf;
        }
        System.out.println("R! : " + total2);

        t = n-r;
        for (tf=1; tf<=t; tf++){
            total3 = total3 * tf;
        }

        komb = (total1 / (total2 * (total3)));
        System.out.println("C(" + n + "," + r +")"+ komb);
    }
}