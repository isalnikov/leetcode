/**
 *
 * https://leetcode.com/problems/knight-dialer/
 *
 */
package com.isalnikov.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author igor
 */
public class KnightDialer935 {

    public static final List<List<Integer>> jump = new ArrayList<>() {
        {
            add(Arrays.asList(4, 6));//0
            add(Arrays.asList(6, 8));//1
            add(Arrays.asList(7, 9));//2
            add(Arrays.asList(4, 8));//3
            add(Arrays.asList(0, 3, 9));//4
            add(Arrays.asList());//5
            add(Arrays.asList(0, 1, 7));//6
            add(Arrays.asList(2, 6));//7
            add(Arrays.asList(1, 3));//8
            add(Arrays.asList(2, 4));//9

        }
    };

    public static final long MOD = 1000_000_1007L;

    public int knightDialer(int N) {
        long[] a = new long[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        for (int i = 0; i < N - 1; ++i) {
            long[] tmp = new long[10];

            // For each digit
            for (int j = 0; j < 10; j++) {
                // Which other digits can we reach?
                for (int k : jump.get(i)) {
                    tmp[j] = (tmp[j] + a[k]) % MOD;
                }
            }

            // Sanity checks based on symmetry of the keypad
            assert tmp[1] == tmp[3];
            assert tmp[4] == tmp[6];
            assert tmp[7] == tmp[9];

            a = tmp;
        }

        long ans = 0;
        for (long k : a) {
            ans = (ans + k) % MOD;
        }

        return (int) ans;
    }

    private static final int[][] whereFromHere = {
        {4, 6}, {6, 8}, {7, 9}, {4, 8}, // 0, 1, 2, 3
        {3, 9, 0}, {}, {1, 7, 0}, // 4, 5, 6
        {2, 6}, {1, 3}, {2, 4} // 7, 8, 9
    };

    public int knightDialer1(int N) {
        long[] a = new long[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        for (int i = 0; i < N - 1; ++i) {
            long[] tmp = new long[10];

            for (int j = 0; j < 10; j++) {
                for (int k : whereFromHere[j]) {
                    tmp[j] = (tmp[j] + a[k]) % MOD;
                }
            }

            assert tmp[1] == tmp[3];
            assert tmp[4] == tmp[6];
            assert tmp[7] == tmp[9];

            a = tmp;
        }

        long ans = 0;
        for (long k : a) {
            ans = (ans + k) % MOD;
        }

        return (int) ans;
    }
}
