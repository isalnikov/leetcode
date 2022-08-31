//https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/
package com.isalnikov.leetcode;

import com.isalnikov.leetcode.removeduplicatesfromsortedarray.Solution;
import java.util.Arrays;

/**
 *
 * @author Igor Salnikov <isalnikov1@gmail.com>
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Solution s = new Solution();
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(Arrays.toString(nums));
        int k = s.removeDuplicates(nums);
        System.out.println(k);
        
    }
}
