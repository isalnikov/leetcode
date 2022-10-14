package com.isalnikov.m256;

public class Probable256 {

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {

        int result = 0;
        for (int i = 0; i < 255; i++) {
            if (countSetBits(i) == 4) {
                result++;
            }
        }
        System.out.println(result);

        System.out.println(1.0 * result / 256);

    }

}
