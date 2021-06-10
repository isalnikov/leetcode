/*
 *https://massivealgorithms.blogspot.com/2018/04/leetcode-729-my-calendar-i.html
 */
package com.isalnikov.leetcode.calendar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author igor
 */
public class MyCalendar {
    public MyCalendar() {
    
}

public boolean book(int start, int end) {
    assert start < end;
    Interval interval = new Interval(start, end-1);
    int foundIndex = Collections.binarySearch(entries, interval);
    if (foundIndex >= 0) {
        return false;
    }
    // insert and merge
    int insertPos = -(foundIndex+1);//\\
    entries.add(insertPos, interval);
    // optionally merge
    return true;
}

private List<Interval> entries = new ArrayList<>();

class Interval implements Comparable<Interval> {
    public Interval(int start, int end) {
        this.start = start;
        this.end   = end;
    }
    public int compareTo(Interval anotherInterval) {
        if (this.end < anotherInterval.start) {
            return -1;
        } else if (this.start > anotherInterval.end) {
            return 1;
        } else {
            return 0;       // intervals are equal so long they overlap
        }
    }
    
    int start;  // inclusive
    int end;    // inclusive
}
}
//
//
//    TreeSet<int[]> books = new TreeSet<int[]>((int[] a, int[] b) -> a[0] - b[0]);
//
//    public boolean book(int s, int e) {
//        int[] book = new int[] { s, e }, floor = books.floor(book), ceiling = books.ceiling(book);
//        if (floor != null && s < floor[1]) return false; // (s, e) start within floor
//        if (ceiling != null && ceiling[0] < e) return false; // ceiling start within (s, e)
//        books.add(book);
//        return true;
//    
