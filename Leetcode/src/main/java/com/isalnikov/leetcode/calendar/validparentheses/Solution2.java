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
public class Solution2 {
 public boolean isValid(String s) {
        Stack<Character> left = new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c == '(' || c == '{' ||  c == '[' )
            {
                left.push(c);
            }else if (!left.isEmpty() && leftOf(c) == left.peek())
            {
                left.pop();
            }else
            {
                return false;
            }
            
        }
        
        return left.isEmpty();
    }
    
    char leftOf(char c)
    {
        if(c == ')')
        {
            return '(';
        }
        if(c == ']')
        {
            return '[';
        }

            return '{';
     
    }
}