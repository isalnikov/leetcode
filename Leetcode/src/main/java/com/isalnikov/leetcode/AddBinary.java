/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isalnikov.leetcode;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;


/**
 *
 * @author Igor Salnikov <isalnikov1@gmail.com>
 */
public class AddBinary {
    public static void main(String[] args) {
        // System.out.println(Long.toBinaryString(Long.parseLong("111", 2) + Long.parseLong("1", 2)));
        //java.math.BigInteger bi1 = new java.math.BigInteger("111",2);
        //java.math.BigInteger bi2 = new java.math.BigInteger("1",2);
        
        //System.out.println((bi1.add(bi2)).toString(2));
         
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        
        
        for (int i = 0; i < 100; i++) {
            
        Long random = ThreadLocalRandom.current().nextLong();
             s1.append(Long.toBinaryString(random));
             random = ThreadLocalRandom.current().nextLong();
             s2.append(Long.toBinaryString(random));
        }
        
        System.out.println("s1.length() = "+s1.length());
        System.out.println("s2.length() = "+s2.length());
 
        
        System.out.println(Long.toBinaryString(Long.MAX_VALUE));
        System.out.println(Long.toBinaryString(Long.MAX_VALUE).length());
        System.out.println(Math.pow(10,4));
        System.out.println(Math.pow(10,4)/Long.toBinaryString(Long.MAX_VALUE).length());
        
        long[] arr = new long[159];
        
        int chunkSize = 50;
  

        
        String[] chunks = s1.toString().split("(?<=\\G.{" + chunkSize + "})");
        System.out.println(Arrays.toString(chunks));
        System.out.println(chunks.length);
        
        for (int i = 0; i < chunks.length; i++) {
            String chunk = chunks[i];
            System.out.println(chunk.length());
            
        }
        
        
    }
}
