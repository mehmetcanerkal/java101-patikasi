package Giris;

import java.util.Scanner;

public class VKI {
    public static void main(String[] args) {

        double boy,kg,vki;
        Scanner girdi = new Scanner(System.in);

        System.out.print("Boyunuzu giriniz : ");
        boy = girdi.nextDouble();

        System.out.print("Kilonuzu giriniz : ");
        kg = girdi.nextDouble();

        vki = (kg/(boy * boy));

        System.out.print("Vücut Kitle İndeksiniz : " + vki);

    }
}
