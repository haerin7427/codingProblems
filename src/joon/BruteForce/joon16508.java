package joon.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/16508
// title : 전공책
// time : 22m + ...
// Create by haerin on 2022/04/21

// algorithm: Brute force
// data structure: Array

public class joon16508 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int num_book = Integer.parseInt(br.readLine());
        int[] bookPrice = new int[num_book];
        String[] bookName = new String[num_book];

        for(int i=0; i<num_book; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            bookPrice[i] = Integer.parseInt(st.nextToken());
            bookName[i] = st.nextToken();
        }

        
    }
    
}
