package leetcode;

// https://leetcode.com/problems/count-primes/
// title : 204. Count Primes
// time : 40m
// Created by haerin on 2022/07/15 + help

public class Q204 {
    class Solution {
        public int countPrimes(int n) {
            boolean[] isPrime = new boolean[n];
            int count = 0;
            for (int i = 2; i < n; i++) {
                if (isPrime[i] == false) {
                    count += 1;
                    for (int j = 2; i*j < n; j++) {
                        isPrime[i*j] = true;
                    }
                }
            }
            return count;
        }
    }
}
