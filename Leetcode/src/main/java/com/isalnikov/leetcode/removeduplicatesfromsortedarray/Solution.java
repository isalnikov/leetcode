/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isalnikov.leetcode.removeduplicatesfromsortedarray;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/
 *
 * @author Igor Salnikov <isalnikov1@gmail.com>
 */
public class Solution {
   public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[k] != nums[i]) {
                nums[++k] = nums[i];
            }
        }
        return k+1;
    }
}
//class Solution {
//public int removeDuplicates(int[] nums) {
//
//    int index =1 ;
//    for(int i=0;i<nums.length-1 ;i++){
//        if(nums[i]!=nums[i+1]){
//            nums[index++]=nums[i+1];
//        }    
//    }
//return index;
//}
//}