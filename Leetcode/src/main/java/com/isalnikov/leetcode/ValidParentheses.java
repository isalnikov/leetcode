
//https://leetcode.com/problems/valid-parentheses/

package com.isalnikov.leetcode;

import com.isalnikov.leetcode.calendar.validparentheses.Solution;
import com.isalnikov.leetcode.calendar.validparentheses.Solution2;

/**
 *
 * @author Igor Salnikov <isalnikov1@gmail.com>
 */
public class ValidParentheses {
    
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.isValid("()[]{}"));
    }
}
