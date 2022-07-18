package leetcode;

// https://leetcode.com/problems/lemonade-change/
// title : 860. Lemonade Change
// time : 10m
// Created by haerin on 2022/07/18

public class Q860 {
    class Solution {
        public boolean lemonadeChange(int[] bills) {
            int[] wallet = new int[3];

            for(int bill : bills){
                if(bill == 5)
                    wallet[0] +=1;
                else if(bill == 10)
                    wallet[1] +=1;
                else if(bill == 20)
                    wallet[2] +=1;

                if(bill > 5){
                    bill -= 5;

                    while(bill >= 20 && wallet[2] > 0){
                        wallet[2] -= 1;
                        bill -= 20;
                    }

                    while(bill >= 10 && wallet[1] > 0){
                        wallet[1] -= 1;
                        bill -= 10;
                    }

                    while(bill >= 5 && wallet[0] > 0){
                        wallet[0] -= 1;
                        bill -= 5;
                    }

                    if(bill != 0)
                        return false;
                }
            }

            return true;
        }
    }
}
