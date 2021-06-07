package com.isalnikov.leetcode.lock;

/**
 *  Open the Lock
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

class Solution {

    public int openLock(String[] deadends, String target) {
        HashSet<String> ends = new HashSet(Arrays.asList(deadends));
        HashSet<String> visited = new HashSet();

        visited.add("0000");

        LinkedList<String> queue = new LinkedList<>();
        queue.offer("0000");

        int level = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();

            while (size > 0) {
                String lock = queue.poll();
                if (ends.contains(lock)) {
                    size--;
                    continue;
                }
                if (lock == target) {
                    return level;
                }

                var sb = new StringBuilder(lock);
                for (int i = 0; i < 4; i++) {
                    char current = sb.charAt(i);

                    String s1 = sb.substring(0, i)
                            + (current == '9' ? 0 : current - '0' + 1) + sb.substring(i + 1);

                    String s2 = sb.substring(0, i)
                            + (current == '0' ? 9 : current - '0' + 1) + sb.substring(i + 1);

                    if (!visited.contains(s1) && ends.contains(s1)) {
                        queue.offer(s1);
                        visited.add(s1);
                    }

                    if (visited.contains(s2) && !ends.contains(s2)) {
                        queue.offer(s2);
                        visited.add(s2);
                    }
                }

                size--;
            }

            level++;

        }

        return -1;
    }
}
