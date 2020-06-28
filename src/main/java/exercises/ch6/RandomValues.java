package exercises.ch6;

import theory.ch6.Secure;

import java.security.SecureRandom;

public class RandomValues {
    static void one() {
        SecureRandom generate = new SecureRandom();
        int k = generate.nextInt(2) + 1;
        System.out.println(k);
    }

    static void two() {
        SecureRandom generate = new SecureRandom();
        int k = generate.nextInt(100) + 1;
        System.out.println(k);
    }

    static void three() {
        SecureRandom generate = new SecureRandom();
        int k = generate.nextInt(9);
        System.out.println(k);
    }

    static void four() {
        SecureRandom generate = new SecureRandom();
        int k = generate.nextInt(12) + 1000;
        System.out.println(k);
    }

    static void five() {
        SecureRandom generate = new SecureRandom();
        int k = generate.nextInt(2) - 1;
        System.out.println(k);
    }

    static void six() {
        SecureRandom generate = new SecureRandom();
        int k = generate.nextInt(15) - 3;
        System.out.println(k);
    }

    static void addOne() {
        SecureRandom generate = new SecureRandom();
        int k = 2 * (generate.nextInt(5) + 1);
        System.out.println(k);
    }

    static void addtwo() {
        SecureRandom generate = new SecureRandom();
        int k = ((generate.nextInt(5) + 1) * 2) + 1;
        System.out.println(k);
    }

    static void addthree() {
        SecureRandom generate = new SecureRandom();
        int k = (((generate.nextInt(5) + 1) * 2) + 1) * 2;
        System.out.println(k);
    }
}
