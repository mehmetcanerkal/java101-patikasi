package Giris;

import java.util.Scanner;

public class DortveBesKuvvet {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        int n,i,j;

        System.out.print("Bir sayı giriniz : ");
        n = giris.nextInt();


        System.out.println("Girilen sayıya kadar olan 4'ün kuvvetleri : ");
        for (i=1; i<n; i*=4) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        System.out.println("Girilen sayıya kadar olan 5'in kuvvetleri : ");
        for (j=1; j<n; j*=5){
            System.out.print(j + " ");
        }
    }
}
