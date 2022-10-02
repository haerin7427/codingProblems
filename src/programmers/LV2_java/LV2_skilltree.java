package programmers.LV2_java;
// https://school.programmers.co.kr/learn/courses/30/lessons/49993
// title : 스킬트리
// time : 10m
// Created by haerin on 2022/07/11

public class LV2_skilltree {
    class Solution {
        public int solution(String skill, String[] skill_trees) {
            int answer = 0;
            for(String s : skill_trees) {
                if(skill.startsWith(s.replaceAll("[^"+skill+"]",""))) {
                    answer+=1;
                }
            }
            return answer;
        }
    }
}