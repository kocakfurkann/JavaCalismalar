package com.kocak.standartprogramlamayapilari;

import java.util.Scanner;

public class TekCiftSonsuzDongü {

    public static void main (String args[]){
        Scanner tarayici = new Scanner(System.in);



        while (true){
            System.out.println("Bir Sayi Giriniz:");
            int sayi = tarayici.nextInt();

            int sonuc = sayi %2 ;

            switch (sonuc) {
                case 0 :
                    System.out.println("Sayınız Çİft Bir Sayıdır...");
                    break;
                case 1 :
                    System.out.println("Sayınız Tek Bİr Sayıdır...");
                    break;
            }
                System.out.println("Çıkış için (1) Devam etmek için diger rakamlar...");
                int secim = tarayici.nextInt();

                if (secim == 1){
                    System.out.println("Çıkış Yapıldı...");
                    break;
                }
        }
    }
}
