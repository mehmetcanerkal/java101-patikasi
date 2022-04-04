package Giris;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int yolKm,min =20,acilis = 10;
        Scanner girdi = new Scanner(System.in);

        System.out.print("Mesafeyi Giriniz : ");
        yolKm = girdi.nextInt();

        double yolTutar;
        yolTutar = yolKm * 2.20;

        double total;
        total = yolTutar + acilis;
        total = (total < 20) ? min : total;
        System.out.print("Toplam ÜCretiniz : " + total);



    }
}
