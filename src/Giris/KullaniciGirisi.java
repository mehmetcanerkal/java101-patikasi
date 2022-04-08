package Giris;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String kullaniciAdi,sifre;
        String yeniSifre;
        String sifreSifirlama;

        System.out.print("Kullanıcı Adınızı Giriniz : ");
        kullaniciAdi = input.nextLine();
        System.out.print("Şifrenizi Giriniz : ");
        sifre = input.nextLine();

        if (kullaniciAdi.equals("mehmetcanerkal") && sifre.equals("25632563")){
            System.out.print("Giriş Yaptınız");
        }else{
            System.out.println("Bilgileriniz Yanlış");
            System.out.println("Şifrenizi değiştirmek ister misiniz ? ");
            System.out.println("1-Evet\n2-Hayır");
            sifreSifirlama = input.nextLine();
                if (sifreSifirlama.equals("Evet")){
                    System.out.println("Yeni Şifrenizi Giriniz : ");
                    yeniSifre = input.nextLine();
                        if(yeniSifre.equals("25632563")) {
                            System.out.println("Yeni şifre eskisisyle aynı olamaz !");
                        }
                        else{
                            System.out.println("Başarıyla değiştirildi.");
                        }
                    }
                else{
                    System.out.println("Şifre sıfırlama başarısız oldu");
                }
                }
            }
        }