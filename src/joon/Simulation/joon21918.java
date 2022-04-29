package joon.Simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/21918
// title : 전구
// time : 20m
// Create by haerin on 2022/04/29

// 자료구조 : 배열

public class joon21918 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] lights = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i< lights.length; i++)
            lights[i] = Integer.parseInt(st.nextToken());

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int option = Integer.parseInt(st.nextToken());
            int para1 = Integer.parseInt(st.nextToken());
            int para2 = Integer.parseInt(st.nextToken());

            if(option == 1)
                lights[para1-1] = para2;
            else if(option == 2)
                option2(lights, para1,para2);
            else if(option == 3)
                option3and4(lights, para1,para2, 0);
            else if(option == 4)
                option3and4(lights,para1,para2, 1);
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i< lights.length; i++)
            if(i == lights.length-1)
                sb.append(lights[i]);
            else
                sb.append(lights[i]+" ");

        System.out.println(sb);
    }

    public static void option2(int[] lights, int l, int r){
        for(int i=l-1; i<r; i++)
            if(lights[i] == 0)
                lights[i] = 1;
            else
                lights[i] = 0;
    }
    public static void option3and4(int[] lights, int l, int r, int state){
        for(int i=l-1; i<r; i++)
            lights[i] = state;
    }
    
}
