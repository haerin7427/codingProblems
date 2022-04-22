package joon.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/9079
// title : 동전 게임
// time : 5:37
// Create by haerin on 2022/04/19

public class joon9079 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num_testcase = Integer.parseInt(br.readLine());

        for(int i=0; i<num_testcase; i++){
            int[][] board = new int[3][3];
            for(int y=0; y<3; y++){
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                for(int x=0; x<3; x++){
                    if(st.nextToken().equals("H"))
                        board[y][x] = 1;
                    else
                        board[y][x] = 0;
                }
            }


        }


        
    }
    
}
