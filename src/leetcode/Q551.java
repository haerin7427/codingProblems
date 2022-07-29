package leetcode;
// https://leetcode.com/problems/student-attendance-record-i/
// title : 551. Student Attendance Record I
// time : 5m
// Created by haerin on 2022/07/29

public class Q551 {
    class Solution {
        public boolean checkRecord(String s) {
            int count_absent = 0;
            int count_late = 0;
            for(char c : s.toCharArray()){
                if(c == 'L')
                    count_late += 1;
                else
                    count_late = 0;
                
                if(c == 'A')
                    count_absent += 1;
                
                if(count_late == 3)
                    break;
            }
            
            if(count_late < 3 && count_absent < 2) return true;
            else return false;
        }
    }
}
