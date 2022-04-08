package Giris;
import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int s1,s2,islem;


        System.out.print("İlk Sayıyı Giriniz : ");
        s1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : " );
        s2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapmak İstediğiniz İşlemi Seçiniz : ");
        islem = input.nextInt();

        switch (islem){
            case 1:
                System.out.print("Sonuç : " + (s1 +s2));
                break;
            case 2:
                System.out.print("Sonuç : " + (s1 - s2));
                break;
            case 3:
                System.out.print("Sonuç : " + (s1 * s2));
                break;
            case 4:
                if(s2==0)
                    System.out.print("Bir sayı 0'a bölünemez.");
                else if (s1==0)
                    System.out.print("Tanımsız");
                else
                    System.out.print("Sonuç : " + (s1/s2));
                break;

            default:
                System.out.print("Hatalı İşlem Yaptınız.");
        }
    }
}
