
package com.isalnikov.leetcode.removeelement;

/**
 * https://leetcode.com/problems/remove-element/submissions/
 * @author Igor Salnikov <isalnikov1@gmail.com>
 */
public class Solution {

public int removeElement(int[] nums, int val) {
   if (nums.length == 0) return 0;
        int k = 0;
        int i = 0;
      if (nums.length == 1){
          if(val == nums[0])  return 0;
          if(val != nums[0])  return 1;
      }
        
        
          for (i = 0; i < nums.length; i++){
              if(val == nums[i]){
                  k = i;
                  break;
              }
          }
          if( i == nums.length) return i;
        
        for (i = k + 1; i < nums.length; i++) {
            if (val != nums[i]) {
                nums[k]  = nums[i];
                k++;
            }
        }
        return k;
    }
}
//..
//
//public int removeElement(int[] nums, int val) {
//    int i = 0;
//    for (int j = 0; j < nums.length; j++) {
//        if (nums[j] != val) {
//            nums[i] = nums[j];
//            i++;
//        }
//    }
//    return i;
//}