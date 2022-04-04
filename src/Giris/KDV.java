package Giris;
import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);

        float fiyat;
        System.out.println("Fiyatı Giriniz : ");
        fiyat = giris.nextFloat();

        float kdv;
        kdv = (fiyat*18)/100;

        float toplam;
        toplam = kdv + fiyat;

        System.out.println("KDV'li Toplam Fiyat : " + toplam);


    }
}
