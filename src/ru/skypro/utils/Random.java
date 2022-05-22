package ru.skypro.utils;

public class Random {

    public int getRandomValue() {
        java.util.Random r = new java.util.Random();
        int low = 0;
        int high = 100;
        int result = r.nextInt(high-low) + low;
        return result;
    }

}
