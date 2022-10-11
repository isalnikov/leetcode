package com.isalnikov.m256;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * монету бросилил 8 раз , какова вкроятность что выпало ровно 4 герба 
 * @author Igor Salnikov <isalnikov1@gmail.com>
 */
public class Probable {

    public static void main(String[] args) {

        int n = 1_000_000;
        int k = 0;
        for (int i = 0; i < n; i++) {

            int p = 0;
            for (int j = 0; j < 8; j++) {

                int m = ThreadLocalRandom.current().nextInt(0, 2);
                if (m == 1) {
                    p++;
                }
            }

            if (p == 4) {
                k++;
            }
            p = 0;
        }

        System.out.println(1.0 * k / n);

    }

}
