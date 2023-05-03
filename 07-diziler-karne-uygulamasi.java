package com.kocak.standartprogramlamayapilari;

import android.icu.text.SymbolTable;

import java.util.Scanner;

public class DizilerKarne {

    public static void main (String args[]) {

        Scanner scanner = new Scanner(System.in);

        int [] notlar = new int[3];
        String [] dersler = new String[3];

        for (int i = 0 ; i < notlar.length ; i++) {
            System.out.println((i+1)+" . Dersin Adını Giriniz:");
            String dersAdi = scanner.next() ;
            dersler[i] = dersAdi;

            System.out.println((i+1)+" . Dersin Notunu Giriniz:");
            int dersNotu = scanner.nextInt();
            notlar[i] = dersNotu;
        }
        int toplam = 0 ;
        for (int k = 0 ; k< notlar.length ; k++) {
            System.out.println(dersler[k] + " : " + notlar[k]);
            toplam = toplam + notlar[k] ;
        }
        int ortalama = toplam/ dersler.length ;
        System.out.println("Ortalama : "+ortalama);

        if (ortalama >= 50) {
            System.out.println("Tebrikler Sınıf Geçtiniz...");
        }else {
            System.out.println("Sınıfta Kaldınız...");
        }


    }



}

