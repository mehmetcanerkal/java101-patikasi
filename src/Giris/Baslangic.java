package Giris;

import java.util.Scanner;


public class Baslangic {
    public static void main(String[] args) {

        // değişkenleri oluştur
        int mat,fizik,kimya,muzik,turkce,tarih;

        // kullanıcıdan değerleri al
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        mat = inp.nextInt();


        System.out.print("Kimya notunuzu giriniz : ");
        kimya = inp.nextInt();


        System.out.print("Fizik notunuzu giriniz : ");
        fizik = inp.nextInt();


        System.out.print("Müzik notunuzu giriniz : ");
        muzik = inp.nextInt();


        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = inp.nextInt();


        System.out.print("Tarih notunuzu giriniz : ");
        tarih = inp.nextInt();

        int Toplam = (mat + kimya + fizik + muzik + turkce + tarih);
        double ort = Toplam / 6.0;
        String sonuc = (ort >= 60) ? "Sınıfı Geçtiniz" : "Sınıfta kaldınız" ;
        System.out.println(sonuc);
        System.out.println("Ortalamanız : " + ort);

    }
}