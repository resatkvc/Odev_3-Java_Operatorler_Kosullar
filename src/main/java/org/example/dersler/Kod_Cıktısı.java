package org.example.dersler;

public class Kod_Cıktısı {
    public static void main(String[] args) {

        int e = 12;
        boolean sonuc5 = (e > 10) && (e++ < 15);                // && (ve) operatörü: her iki şart doğru olmalı
                                                                // e > 10 → true çünkü e = 12
        System.out.println("sonuc5: " + sonuc5);                // true
        System.out.println("e'nin yeni değeri: " + e);          // e++ < 15 → true çünkü 12 < 15; yani , e'nin yeni değeri: 13

    }
}
