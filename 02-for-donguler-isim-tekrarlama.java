package com.kocak.standartprogramlamayapilari;

import java.util.Scanner;

public class DongulerleIsimTekrarlama {

    public static void main (String args[]){

        Scanner a = new Scanner(System.in);

        System.out.println("İSminizi Giriniz:");
        String isim = a.nextLine();
        System.out.println("Tekrarlama Sayısını Giriniz:");
        int sayi = a.nextInt();

        for (int i=0; i<sayi; i++){
            System.out.println(isim+"- "+(i+1));
        }
    }
}
