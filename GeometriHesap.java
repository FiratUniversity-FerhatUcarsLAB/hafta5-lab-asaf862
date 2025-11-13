/*
Ad Soyad: asaf şahin
Öğrenci No: 250541049
Dosya: GeometriHesap.java
Ders: Metot Tanımlama ve Kullanma
Açıklama: Görev 1 - Geometrik şekil hesaplayıcı (8 metot).
*/

import java.util.Scanner;

public class GeometriHesap {

    // Kare
    public static double calculateSquareArea(double side) {
        return side * side;
    }
    public static double calculateSquarePerimeter(double side) {
        return 4 * side;
    }

    // Dikdörtgen
    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }
    public static double calculateRectanglePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    // Daire
    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
    public static double calculateCircleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    // Üçgen (alan için taban ve yükseklik; çevre için kenarlar a,b,c)
    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2.0;
    }
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    // Main - minimum hesaplama: örnek test değerleriyle metotları çağırır ve çıktılar printf ile gösterilir.
    public static void main(String[] args) {
        // Örnek test değerleri (öğretmen talimatlarındaki önerilerden)
        double squareSide = 5.0;
        double rectW = 3.0, rectH = 7.0;
        double circleR = 4.0;
        double triBase = 6.0, triHeight = 4.0;
        double a = 3.0, b = 4.0, c = 5.0;

        double squareArea = calculateSquareArea(squareSide);
        double squarePer = calculateSquarePerimeter(squareSide);

        double rectArea = calculateRectangleArea(rectW, rectH);
        double rectPer = calculateRectanglePerimeter(rectW, rectH);

        double circleArea = calculateCircleArea(circleR);
        double circleCirc = calculateCircleCircumference(circleR);

        double triArea = calculateTriangleArea(triBase, triHeight);
        double triPer = calculateTrianglePerimeter(a, b, c);

        System.out.printf("Kare (kenar=%.2f): Alan=%.2f, Cevre=%.2f\n", squareSide, squareArea, squarePer);
        System.out.printf("Dikdortgen (%.2fx%.2f): Alan=%.2f, Cevre=%.2f\n", rectW, rectH, rectArea, rectPer);
        System.out.printf("Daire (r=%.2f): Alan=%.2f, Cevre=%.2f\n", circleR, circleArea, circleCirc);
        System.out.printf("Ucgen (taban=%.2f,yukseklik=%.2f): Alan=%.2f, Cevre(3 kenar)=%.2f\n", triBase, triHeight, triArea, triPer);
    }
}
