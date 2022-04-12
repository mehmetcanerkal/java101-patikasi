package Giris;

import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        int artikYil;
        Scanner giris = new Scanner(System.in);

        System.out.print("Bir yıl giriniz : ");
        artikYil = giris.nextInt();

        if (artikYil%400 == 0){
            System.out.println(artikYil + " Artık yıldır.");
        }else{
           if (artikYil %100 == 0 ){
               System.out.println(artikYil + " Artık yıl değildir.");
           }else if (artikYil %4 == 0){
               System.out.println("Artık yıl değildir");
           }
        }


    }
}
