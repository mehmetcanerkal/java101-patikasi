package Giris;

import java.util.Scanner;

public class HavaSicakligi {
    public static void main(String[] args) {
        int sicaklik;
        Scanner giris = new Scanner(System.in);

        System.out.print("Dışarıda hava kaç derece ? : ");
        sicaklik = giris.nextInt();

        if (sicaklik <= 5) {
            System.out.println("Kayak yapabilirsin");
        }else if ((sicaklik > 5) && (sicaklik < 10)){
            System.out.println("Sinemaya gidebilirsin");
        }else if ((sicaklik >= 10) && (sicaklik <= 15)){
            System.out.println("Hem sinemaya hemde pikniğe gidebilirsin");
        }else if ((sicaklik > 15) && (sicaklik <25)){
            System.out.println("Pikniğe gidebilirsin");
        } else if (sicaklik >25){
            System.out.println("Yüzmeye gidebilirsin");
        }
    }
}
