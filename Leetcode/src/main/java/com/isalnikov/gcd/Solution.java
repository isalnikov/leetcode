/**
 * https://habr.com/ru/company/cloud4y/blog/691602/
 */
package com.isalnikov.gcd;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.IntSummaryStatistics;

/**
 *
 * @author Igor Salnikov <isalnikov1@gmail.com>
 */
public class Solution {
    public static void main(String[] args) {
        int[] tab = {12, 8};
        IntSummaryStatistics stat = Arrays.stream(tab).summaryStatistics();
        int min = stat.getMin();
        int max = stat.getMax();

    
        BigInteger b1 = BigInteger.valueOf(min);
        BigInteger b2 = BigInteger.valueOf(max);
        BigInteger gcd = b1.gcd(b2);

        System.out.println(gcd);
    }
}
