package joon.Simulation;

// https://www.acmicpc.net/problem/20053
// title : 최소, 최대 2
// time : 7m
// Create by haerin on 2022/04/28

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.*;
public class joon20053 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num_testcase = Integer.parseInt(br.readLine());
        int[][] answer = new int[num_testcase][2];
        for(int i=0; i<num_testcase; i++){
            int num_digit = Integer.parseInt(br.readLine());
            int[] arr = new int[num_digit];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int k=0; k<arr.length; k++)
                arr[k] = Integer.parseInt(st.nextToken());

            Arrays.sort(arr);
            answer[i][0] = arr[0];
            answer[i][1] = arr[num_digit-1];
        }

        for(int i=0; i<num_testcase; i++)
            System.out.println(answer[i][0]+" "+answer[i][1]);
        

    }
    
}