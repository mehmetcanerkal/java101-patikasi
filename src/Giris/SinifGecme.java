package Giris;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik,toplam = 0;
        double sayac = 0;
        double toplam1;
        Scanner giris = new Scanner(System.in);

        System.out.print("Matematik Notunu Giriniz : ");
        mat = giris.nextInt();
        if ((mat >= 0) && (mat <= 100)) {
            toplam += mat;
            sayac++;

        } else {
            System.out.println("Bu ders ortalamaya eklenmemiştir ! ");
        }


        System.out.print("Fizik Notunu Giriniz : ");
        fizik = giris.nextInt();
        if ((fizik >= 0) && (fizik <= 100)) {
            toplam += fizik;
            sayac++;

        } else {
            System.out.println("Bu ders ortalamaya eklenmemiştir ! ");
        }

        System.out.print("Türkçe Notunu Giriniz : ");
        turkce = giris.nextInt();
        if ((turkce >= 0) && (turkce <= 100)) {
            toplam += turkce;
            sayac++;

        } else {
            System.out.println("Bu ders ortalamaya eklenmemiştir ! ");
        }

        System.out.print("Kimya Notunu Giriniz : ");
        kimya = giris.nextInt();
        if ((kimya >= 0) && (kimya <= 100)) {
            toplam += kimya;
            sayac++;

        } else {
            System.out.println("Bu ders ortalamaya eklenmemiştir ! ");
        }

        System.out.print("Müzik Notunu Giriniz : ");
        muzik = giris.nextInt();
        if ((muzik >= 0) && (muzik <= 100)) {
            toplam += muzik;
            sayac++;

        } else {
            System.out.println("Bu ders ortalamaya eklenmemiştir ! ");
        }

        toplam1 = (toplam / sayac);

        System.out.println("Ortalamanız : " + toplam1);

        if(toplam1>=55){
            System.out.println("Sınıfı Geçtiniz :)");
        }else {
            System.out.println("Sınıfta Kaldınız :(");
        }

        }
    }
