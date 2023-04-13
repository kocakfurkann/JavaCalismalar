package com.kocak.standartprogramlamayapilari;

import java.util.Scanner;

public class ifElseDortIslem {
    public static void main (String args[]) {

        Scanner tarayici = new Scanner(System.in);

        System.out.println("(1)Toplama");
        System.out.println("(2)Çıkarma");
        System.out.println("(3)Çarpma");
        System.out.println("(4)Bölme");

        int tercih = tarayici.nextInt();

        System.out.println("1.Sayı Giriniz:");
        int sayi1 = tarayici.nextInt();
        System.out.println("2.Sayı Giriniz:");
        int sayi2 = tarayici.nextInt();

        if (tercih == 1) {
            System.out.println("Toplam :" +(sayi1+sayi2) );
        }
        else if (tercih == 2) {
            System.out.println("Çıkarma :"+(sayi1-sayi2));
        }
        else if (tercih == 3) {
            System.out.println("Çarpma :"+(sayi1*sayi2));
        }
        else if (tercih == 4) {
            System.out.println("Bölme :"+(sayi1/sayi2));
        }

    }
}
