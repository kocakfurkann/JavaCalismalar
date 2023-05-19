import java.util.Scanner;

public class alistirma {
    public static void main (String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println ("1. sayıyı giriniz..");
        int sayi1 = scanner.nextInt();
        System.out.println("2. sayıyı giriniz...");
        int sayi2 = scanner.nextInt();



        if (sayi1 > sayi2) {
            System.out.println(sayi1+ " sayısı büyüktür " +sayi2+ " Sayısından");
        } else if (sayi2 > sayi1) {
            System.out.println(sayi2+ " Büyüktür " +sayi1+ " Sayısından");
        }
        else {
            System.out.println(sayi1 + " sayısı "  + sayi2  + " sayısına eşittir");

        }
    }
}

