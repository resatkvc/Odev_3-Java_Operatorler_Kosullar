package org.example.dersler;

import java.util.Scanner;

public class Odev_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Kullanıcıdan veri almak için kullanılan bir sınıftır
        System.out.print("Notunuzu girin (0-100 arasında): ");
        int not = scanner.nextInt();

         /*
            If-else if-else yapısı, okunabilirliği yüksek ve koşulları açıkça ifade eden bir yapıdır.

            Switch-case ve ternary operator da kullanılabilir,
            Ancak bu yapılar, yalnızca belirli eşitlik kontrolü yapılan durumlar için uygundur.
            Aralık kontrolü gerektiren durumlarda ise daha karmaşık hale gelir.
            Yani, sabit değerler üzerinden yapılan karşılaştırmalarda daha etkilidir.
            Ancak koşulların aralıklar üzerinden kontrol edilmesi gerektiğinde if-else if-else yapısı daha esnek ve anlaşılırdır.
         */


        // İf-Else if-Else Koşulu ile harf notlarını belirleme
        //  && ifadesi VE anlamında kullanılır ve şart kesinlikle sağlanmalıdır.
        if (not >= 90 && not <= 100) {
            // Eğer not 90 ile 100 arasında ise harf notu AA olacaktır.
            System.out.println("Harf Notu: AA - Mükemmel başarı.");

        } else if (not >= 85 && not < 90) {
            // Eğer not 85 ile 89 arasında ise harf notu BA olacaktır.
            System.out.println("Harf Notu: BA - Çok iyi başarı.");

        } else if (not >= 80 && not < 85) {
            // Eğer not 80 ile 84 arasında ise harf notu BB olacaktır.
            System.out.println("Harf Notu: BB - İyi başarı.");

        } else if (not >= 70 && not < 80) {
            // Eğer not 70 ile 79 arasında ise harf notu CC olacaktır.
            System.out.println("Harf Notu: CC - Başarılı.");

        } else if (not >= 60 && not < 70) {
            // Eğer not 60 ile 69 arasında ise harf notu CB olacaktır.
            System.out.println("Harf Notu: CB - Düşük başarılı.");

        } else if (not >= 50 && not < 60) {
            // Eğer not 50 ile 59 arasında ise harf notu DC olacaktır.
            System.out.println("Harf Notu: DC - Düşük alt başarılı.");

        } else if (not >= 40 && not < 50) {
            // Eğer not 40 ile 49 arasında ise harf notu DD olacaktır.
            System.out.println("Harf Notu: DD - Sorunlu olarak geçtiniz.");

        } else if (not >= 0 && not < 40) {
            // Eğer not 0 ile 39 arasında ise harf notu FF olacaktır.
            System.out.println("Harf Notu: FF - Başarısız, dersten kaldınız.");

        } else {
            // Eğer not 0 ile 100 arasında değilse, geçersiz bir not girildiği için hata mesajı veririz.
            System.out.println("Geçersiz not! Lütfen 0 ile 100 arasında bir değer girin.");
        }

        scanner.close(); // Scanner nesnesini kapatıyoruz
    }
}
