/*
Ad Soyad: asaf şahin
Öğrenci No: 250541049
Dosya: SepetHesap.java
Ders: Metot Tanımlama ve Kullanma
Açıklama: Görev 3 - E-Ticaret sepet hesaplayıcı (6 metot + VAT & SHIPPING sabitleri).
*/

import java.util.Scanner;

public class SepetHesap {

    public final static double VAT_RATE = 0.18;
    public final static double SHIPPING_FEE = 29.99;

    // Bir ürünün toplamı: price * quantity
    public static double itemTotal(double price, int quantity) {
        return price * quantity;
    }

    // Ara toplam: üç ürünün toplamı
    public static double subTotal(double t1, double t2, double t3) {
        return t1 + t2 + t3;
    }

    // Indirim tutarı: subtotal * (percent/100)
    public static double discountAmount(double subtotal, double percent) {
        return subtotal * (percent / 100.0);
    }

    // Indirimli toplam: subtotal - discount
    public static double discountedTotal(double subtotal, double discount) {
        return subtotal - discount;
    }

    // KDV tutarı: discountedTotal * VAT_RATE
    public static double vatAmount(double discountedTotal) {
        return discountedTotal * VAT_RATE;
    }

    // Genel toplam: discountedTotal + VAT + shipping
    public static double grandTotal(double discountedTotal, double vat, double shipping) {
        return discountedTotal + vat + shipping;
    }

    // Main - minimum hesaplama: örnek değerlerle çalışır ve printf ile gösterir.
    public static void main(String[] args) {
        // Örnek ürünler (README'deki örneğe benzer)
        double price1 = 150.0; int qty1 = 1;
        double price2 = 100.0; int qty2 = 2;
        double price3 = 100.0; int qty3 = 1;

        double t1 = itemTotal(price1, qty1);
        double t2 = itemTotal(price2, qty2);
        double t3 = itemTotal(price3, qty3);

        double subtotal = subTotal(t1, t2, t3);
        double discountPercent = 10.0;
        double discount = discountAmount(subtotal, discountPercent);
        double discounted = discountedTotal(subtotal, discount);
        double vat = vatAmount(discounted);
        double total = grandTotal(discounted, vat, SHIPPING_FEE);

        System.out.printf("Ara Toplam: %.2f TL\n", subtotal);
        System.out.printf("Indirim (%%%.2f): %.2f TL -> Indirimli Toplam: %.2f TL\n", discountPercent, discount, discounted);
        System.out.printf("KDV: %.2f TL, Kargo: %.2f TL\n", vat, SHIPPING_FEE);
        System.out.printf("Genel Toplam: %.2f TL\n", total);
    }
}
