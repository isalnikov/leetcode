/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isalnikov.leetcode.calendar.validparentheses;

import java.util.Stack;

/**
 *
 * @author Igor Salnikov <isalnikov1@gmail.com>
 */
public class Solution {

    public boolean isCharInArray(char[] arr, char c) {
        for (int i = 0; i < arr.length; i++) {
            char d = arr[i];
            if (d == c) {
                return true;
            }
        }
        return false;
    }

    public boolean isValid(String s) {
        char[] ch = s.toCharArray();
        int length = ch.length;

        if (length % 2 != 0) {
            return false;
        }

        boolean result = true;
        char[] arr = {'(', ')', '{', '}', '[', ']'};
        char[] open = {'(', '{', '['};
        char[] close = {')', '}', ']'};

        Stack stack = new Stack();

        for (int i = 0; i < length; i++) {
            char current = ch[i];

            if (isCharInArray(open, current)) {
                stack.push(ch[i]);
                result = false;
            } else {

                if (stack.empty() && isCharInArray(close, current)) {
                    return false;
                }

                if (!stack.empty()) {
                    char elem = (char) stack.peek();
                    if (elem == open[0] && current == close[0]
                            || elem == open[1] && current == close[1]
                            || elem == open[2] && current == close[2]) {
                        stack.pop();
                        result = true;
                    } else {
                        result = false;
                        return result;
                    }

                }
            }

            if (!stack.empty()) {
                result = false;
            }

        }

        return result;
    }
}
