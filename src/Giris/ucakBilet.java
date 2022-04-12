package Giris;

import java.util.Scanner;

public class ucakBilet {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int km, yTipi, yas;
        double toplamTutar, yasInd, indTutar, yind, total;

        System.out.print("Mesafeyi giriniz(km) : ");
        km = giris.nextInt();
        toplamTutar = km * 0.1;


        System.out.print("Yaşınızı Giriniz : ");
        yas = giris.nextInt();

        System.out.print("Yolculuk Tipi Nedir ? \n1-Tek-Yön\n2-Gidiş-Dönüş : ");
        yTipi = giris.nextInt();

        if (yas < 12){
            yasInd = toplamTutar * 0.5;
            indTutar = toplamTutar - yasInd;
            if (yTipi == 2) {
                yind = indTutar * 0.2;
                total = indTutar - yind;
                System.out.println("Toplam ücret : " + total);
            }else {
                System.out.println("Toplam ücret : " + indTutar);
            }
        }

        if (yas < 25){
            yasInd = toplamTutar * 0.1;
            indTutar = toplamTutar - yasInd;
            if (yTipi == 2) {
                yind = indTutar * 0.2;
                total = indTutar - yind;
                System.out.println("Toplam ücret : " + total);
            }else {
                System.out.println("Toplam ücret : " + indTutar);
            }
        }

        if (yas > 65){
            yasInd = toplamTutar * 0.3;
            indTutar = toplamTutar - yasInd;
            if (yTipi == 2) {
                yind = indTutar * 0.2;
                total = indTutar - yind;
                System.out.println("Toplam ücret : " + total);
            }else {
                System.out.println("Toplam ücret : " + indTutar);
            }
        }

    }
}
