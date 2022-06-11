package joon.Simulation;
// https://www.acmicpc.net/problem/5212
// title : 지구 온난화
// time : 30m
// Created by haerin on 2022/06/11

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class joon5212 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        char[][] map = new char[row][col];
        for(int i=0; i<row; i++)
            map[i] = br.readLine().toCharArray();

        after_50years_map(row, col, map);
    }

    public static void after_50years_map(int row, int col, char[][] map){
        char[][] new_map = new char[row][col];

        int[][] move = new int[][]{{0, 1}, {-1, 0}, {0, -1},{1, 0}};
        int count_X = 0;
        for(int r=0; r<row; r++){
            for(int c=0; c<col; c++){
                if(map[r][c] == '.') {
                    new_map[r][c] = '.';
                    continue;
                }

                int cnt_sea = 0;
                for(int m=0; m<move.length; m++){
                    if(r+move[m][0] < 0 || r+move[m][0] > row-1 || c+move[m][1] < 0 || c+move[m][1] > col-1){
                        cnt_sea+=1;
                    }else if(map[r+move[m][0]][c+move[m][1]] == '.') cnt_sea+=1;
                }

                if(cnt_sea > 2)
                    new_map[r][c] = '.';
                else{
                    count_X +=1;
                    new_map[r][c] = 'X';
                }
            }
        }

        if(count_X == 0) System.out.println('X');
        else print_map(new_map);
    }

    private static void print_map(char[][] new_map) {
        int min_row=new_map.length; int max_row=-1;
        int min_col=new_map[0].length; int max_col=-1;
        int count = 0;

        for(int r=0; r<new_map.length; r++){
            for(int c=0; c<new_map[0].length; c++){
                if(new_map[r][c] == 'X'){
                    count += 1;
                    if(min_row > r) min_row = r;
                    if(max_row < r) max_row = r;
                    if(min_col > c) min_col = c;
                    if(max_col < c) max_col = c;
                }
            }
        }

        if(count == 0) System.out.println('X');
        else{
            StringBuffer sb = new StringBuffer();
            for(int r=min_row; r<=max_row; r++){
                for(int c=min_col; c<=max_col; c++){
                    sb.append(new_map[r][c]);
                }
                sb.append("\n");
            }
            System.out.print(sb.toString());
        }

    }
}
