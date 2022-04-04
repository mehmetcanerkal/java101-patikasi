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
        float kdv1;
        kdv1 = (fiyat*8)/100;

        float toplam;
        toplam = kdv + fiyat;

        float toplam1;
        toplam1 = kdv1 + fiyat;

        float str = (fiyat>1000) ? toplam1 : toplam;
        System.out.println("KDV'li Toplam Fiyat : " + str);



    }
}
