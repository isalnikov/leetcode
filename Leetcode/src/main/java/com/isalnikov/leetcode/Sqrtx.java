/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isalnikov.leetcode;

/**
 *
 * @author Igor Salnikov <isalnikov1@gmail.com>
 */
public class Sqrtx {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mySqrt(2147483647));
        
        System.out.println(Math.sqrt(2147483647));
        int i = 2147483647;
         i  = 0x5f3759df - ( i >> 1 );
        System.out.println(i);
        
        
        for (int j = 0; j < 100; j++) {
            System.out.println(j +" << "+ ( 2<<j)  + "  ==  " + (Integer.toBinaryString(2<<j)));
            System.out.println(j +" ^ "+ ( j*j) + "  ==  " + (Integer.toBinaryString(j*j)));
            
        }
        
    }

    public static class Solution {

        public int mySqrt(int x) {
            for (long i = 1; i <= x; i++) {
                if (i * i == x) {
                    return (int)i;
                }
                if (i * i > x) {
                    return (int)(i - 1);
                }

            }
            return x;
        }
    }
}
