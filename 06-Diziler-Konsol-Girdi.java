package com.kocak.standartprogramlamayapilari;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DizilerKonsolGirdi {

    public static void  main (String args[]) {

        Scanner scanner = new Scanner(System.in);

        int [] sayilar = new int[5];

        for (int i = 0 ; i< sayilar.length ; i++) {
            System.out.println( (i+1)+ " . Sayıyı Giriniz:");
            int sayi = scanner.nextInt();

            sayilar [i] = sayi;
        }

        for (int a=0; a<sayilar.length ; a++) {
            System.out.println((a+1) + ".Sayı = "+ sayilar[a]);


        }
    }
}
