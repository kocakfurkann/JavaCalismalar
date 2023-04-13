package com.kocak.standartprogramlamayapilari;

import java.util.Scanner;

public class WhileVeriIsleme {

    public static void main (String args[]) {

        Scanner a = new Scanner(System.in);

        System.out.println("İşlenecek Veri Sayısını Giriniz:");
        int sayi = a.nextInt();

        while(sayi>0){
            System.out.println("İşlenen Veri : "+sayi);
            sayi--;
        }
    }
}
