package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/* Source: https://www.hackerrank.com/challenges/ctci-find-the-running-median  */

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        PriorityQueue<Integer> higher = new PriorityQueue<>(100000);
        PriorityQueue<Integer> lower = new PriorityQueue<>(100000, Comparator.reverseOrder());
        float median;
        for (int i = 0; i < a.length; i++) {
            PriorityQueue<Integer> target = lower.size() <= higher.size() ? lower : higher;
            target.add(a[i]);
            if (!lower.isEmpty() && !higher.isEmpty() && lower.peek() > higher.peek()){
                int lowerValue = lower.poll();
                int higherValue = higher.poll();
                higher.add(lowerValue);
                lower.add(higherValue);
            }
            median = (lower.size() == higher.size()) ? (lower.peek() + higher.peek()) / 2.0f : (float)lower.peek();
            System.out.println(median);
        }
    }
}
