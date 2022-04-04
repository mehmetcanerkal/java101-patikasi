package Giris;

import java.util.Scanner;

public class DaireDilim {
    public static void main(String[] args) {
        double pi = 3.14;
        int r,a;
        //a merkez açı ölçüsü
        Scanner input = new Scanner(System.in);


        System.out.print("Yarıçapı giriniz : ");
        r = input.nextInt();
        System.out.print("Merkez Açı Ölçüsünü Giriniz : ");
        a = input.nextInt();

        double daireDilim = (pi * (r * r) * a )/360;
        System.out.print("Daire diliminin alanı : " + daireDilim);


    }
}
