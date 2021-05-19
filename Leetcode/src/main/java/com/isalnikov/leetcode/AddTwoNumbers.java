package com.isalnikov.leetcode;

/**
 * https://leetcode.com/problems/add-two-numbers/
 * https://javarush.ru/groups/posts/2779-reverse-string-v-java-uchimsja-reversirovatjh-stroki-raznihmi-sposobami
 *
 * @author igor
 */
public class AddTwoNumbers {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return String.valueOf(val);
        }

        public static String print(ListNode head) {
            ListNode current = head;

            StringBuilder sb = new StringBuilder();
            while (current != null) {
                sb.append(String.valueOf(current.val));
                sb.append(",");
                current = current.next;
            }

            if (sb.lastIndexOf(",") > 0) {
                sb.deleteCharAt(sb.lastIndexOf(","));
            }

            return "[" + sb.reverse().toString() + "]";
        }

    }

    /**
     * 2 -> 4 -> 3 5 -> 6 -> 4 7 0 8
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
               ListNode dummy = new  ListNode(0);
       ListNode l3 = dummy;
       int carry = 0; 
        while(l1 != null || l2 != null){
            int l1Val = (l1 != null )? l1.val : 0;
            int l2Val = (l2 != null )? l2.val : 0;
            int current_sum = l1Val+ l2Val + carry;
            
            carry = current_sum / 10;
            int digit = current_sum % 10;
            ListNode newNode = new ListNode(digit) ;
            l3.next = newNode;
            
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            l3 = l3.next;
            
        }
        
        if(carry>0){
           ListNode newNode = new ListNode(carry);
           l3.next = newNode;
           l3 = l3.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4, l1);
        ListNode l3 = new ListNode(3, l2);

        System.out.println(ListNode.print(l3));
        //
        ListNode i1 = new ListNode(5);
        ListNode i2 = new ListNode(6, i1);
        ListNode i3 = new ListNode(4, i2);

        System.out.println(ListNode.print(i3));

        ListNode list = addTwoNumbers(l1, i1);

    }

}
