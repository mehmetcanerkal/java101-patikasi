package Giris;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armut = 2.14,elma = 3.67,domates = 1.11,muz = 0.95,patlican = 5.00,toplam;
        int kacKg;
        Scanner giris = new Scanner(System.in);

        System.out.print("Armut Kaç kg : ");
        kacKg = giris.nextInt();
        armut *= kacKg;

        System.out.print("Elma Kaç kg : ");
        kacKg = giris.nextInt();
        elma *= kacKg;

        System.out.print("Domates Kaç Kg : ");
        kacKg = giris.nextInt();
        domates *= kacKg;

        System.out.print("Muz Kaç Kg : ");
        kacKg = giris.nextInt();
        muz *= kacKg;

        System.out.print("Patlıcan Kaç Kg : ");
        kacKg = giris.nextInt();
        patlican *= kacKg;

        toplam = (armut + elma + domates + muz + patlican);
        System.out.print("Toplam Fiyat : " + toplam);

    }
}
