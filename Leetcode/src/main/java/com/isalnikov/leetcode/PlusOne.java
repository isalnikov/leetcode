
package com.isalnikov.leetcode;

import com.isalnikov.leetcode.plusone.Solution;
import java.util.Arrays;

/** 
 * https://leetcode.com/problems/plus-one/submissions/
 * @author Igor Salnikov <isalnikov1@gmail.com>
 */
public class PlusOne {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        
        System.out.println(Arrays.toString(solution.plusOne(new int[]{9,9,9})));
        System.out.println(Arrays.toString(solution.plusOne(new int[]{9,8,9})));
    }
}
