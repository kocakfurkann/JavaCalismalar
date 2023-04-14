package com.kocak.standartprogramlamayapilari;

import java.util.Scanner;

public class swichDortIslem {
    public static void main (String args[]){
        Scanner tarayici = new Scanner(System.in);

        System.out.println("İşlem Seçiniz...");
        System.out.println("(1)Toplama");
        System.out.println("(2)Çıkarma");
        System.out.println("(3)Çarpma");
        System.out.println("(4)Bölme");

        int tercih = tarayici.nextInt();

        System.out.println("Birinici Sayıyı Giriniz:");
        int sayi1 = tarayici.nextInt();
        System.out.println("İkinci Sayıyı Giriniz:");
        int sayi2 = tarayici.nextInt();

        switch (tercih) {
            case 1 :
                System.out.println("Toplama Sonucu: "+(sayi1+sayi2));
                break;
            case 2 :
                System.out.println("Çıkarma Sonucu: "+(sayi1-sayi2));
                break;
            case 3 :
                System.out.println("Çarpma Sonucu: "+(sayi1*sayi2));
                break;
            case 4:
                System.out.println("Bölme Sonucu: "+(sayi1/sayi2));
                break;
            default:
               System.out.println("Böyle Bir İşlem Yok");
               break;
        }

    }
}
