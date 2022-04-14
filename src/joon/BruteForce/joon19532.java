package joon.BruteForce;

// https://www.acmicpc.net/problem/19532
// title : 수학은 비대면강의입니다
// time : time + a
// Create by haerin on 2022/04/14 + help

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class joon19532 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        int X=0, Y=0;

        for(int x=-999; x<=999; x++)
            for(int y=-999; y<=999; y++)
                if(a*x+b*y==c && d*x+e*y==f){
                    X = x;
                    Y = y;
                    break;
                }
        
        System.out.println(X+ " " + Y);
    }
    
}
