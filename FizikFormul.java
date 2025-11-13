/*
Ad Soyad: asaf şahin
Öğrenci No: 250541049
Dosya: FizikFormul.java
Ders: Metot Tanımlama ve Kullanma
Açıklama: Görev 2 - Fizik formül asistanı (8 metot + GRAVITY sabiti).
*/

import java.util.Scanner;

public class FizikFormul {

    // Yer çekimi sabiti
    public final static double GRAVITY = 9.8;

    // Hız v = s / t
    public static double calculateSpeed(double distance, double time) {
        return distance / time;
    }

    // İvme a = deltaV / t
    public static double calculateAcceleration(double deltaV, double time) {
        return deltaV / time;
    }

    // Kuvvet F = m * a
    public static double calculateForce(double mass, double acceleration) {
        return mass * acceleration;
    }

    // İş W = F * d
    public static double calculateWork(double force, double distance) {
        return force * distance;
    }

    // Güç P = W / t
    public static double calculatePower(double work, double time) {
        return work / time;
    }

    // Kinetik Enerji KE = 0.5 * m * v^2
    public static double calculateKineticEnergy(double mass, double velocity) {
        return 0.5 * mass * Math.pow(velocity, 2);
    }

    // Potansiyel Enerji PE = m * g * h
    public static double calculatePotentialEnergy(double mass, double height) {
        return mass * GRAVITY * height;
    }

    // Momentum p = m * v
    public static double calculateMomentum(double mass, double velocity) {
        return mass * velocity;
    }

    // Main - minimum hesaplama: örnek değerlerle metotları çağırır ve printf ile çıktı verir.
    public static void main(String[] args) {
        // Örnek testler (sunumdaki öneriler)
        double distance = 100.0; // m
        double time = 5.0; // s
        double speed = calculateSpeed(distance, time);

        double deltaV = 20.0; // m/s difference
        double accelTime = 4.0;
        double acceleration = calculateAcceleration(deltaV, accelTime);

        double mass = 10.0; // kg
        double force = calculateForce(mass, acceleration);

        double work = calculateWork(force, 10.0); // force * distance
        double power = calculatePower(work, 2.0);

        double ke = calculateKineticEnergy(mass, 20.0); // m, v
        double pe = calculatePotentialEnergy(mass, 5.0); // m, h

        double momentum = calculateMomentum(mass, 20.0);

        System.out.printf("Hiz: %.2f m/s\n", speed);
        System.out.printf("Ivtme: %.2f m/s^2\n", acceleration);
        System.out.printf("Kuvvet: %.2f N\n", force);
        System.out.printf("Is: %.2f J, Guc: %.2f W\n", work, power);
        System.out.printf("Kinetik Enerji: %.2f J, Potansiyel Enerji: %.2f J\n", ke, pe);
        System.out.printf("Momentum: %.2f kg*m/s\n", momentum);
    }
}
