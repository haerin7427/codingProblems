package joon.Simulation;
// https://www.acmicpc.net/problem/20436
// title : ZOAC 3
// time : 30m
// Created by haerin on 2022/06/12

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class joon20436 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String location = br.readLine();
        String word = br.readLine();

        char left_hand = location.charAt(0);
        char right_hand = location.charAt(2);
        int time = 0;

        for(char c : word.toCharArray()){
            if(c=='y'||c=='u'||c=='i'||c=='o'||c=='p'||c=='h'||c=='j'||c=='k'||c=='l'||c=='b'||c=='n'||c=='m'){
                // 한글기준 모음일 경우, 오른손
                time += check_time(right_hand,c);
                right_hand = c;
            }else{
                time += check_time(left_hand,c);
                left_hand = c;
            }
        }
        System.out.println(time);
    }

    public static int check_time (char now, char next ){
        // 알파벳 순서로 키보드 상대 위치 (x,y) <기준 자판 : z = (0,0)>
        int[][] keyboard = new int[][]{{0,1},{4,0},{2,0},{2,1},{2,2},{3,1},{4,1},{5,1},{7,2},{6,1},{7,1},{8,1},{6,0},{5,0},{8,2},{9,2},{0,2},{3,2},{1,1},{4,2},{6,2},{3,0},{1,2},{1,0},{5,2},{0,0}};
        return 1 + Math.abs(keyboard[now-'a'][0]-keyboard[next-'a'][0]) + Math.abs(keyboard[now-'a'][1]-keyboard[next-'a'][1]);
    }
}