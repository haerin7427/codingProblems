package joon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/3029
// title : 경고
// time : 25m
// Created by haerin on 2022/06/02

public class joon3029 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int[] present_time = new int[3];
        present_time[0] = Integer.parseInt(st.nextToken());
        present_time[1] = Integer.parseInt(st.nextToken());
        present_time[2] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), ":");
        int[] target_time = new int[3];
        target_time[0] = Integer.parseInt(st.nextToken());
        target_time[1] = Integer.parseInt(st.nextToken());
        target_time[2] = Integer.parseInt(st.nextToken());

        int[] waiting_time = new int[3];
        if(target_time[2]<present_time[2]){
            if(target_time[1]>0){
                target_time[1] -= 1;
            }else{
                target_time[1] = 59;
                target_time[0] -= 1;
            }
            waiting_time[2] = 60 + target_time[2] - present_time[2];
            
        }else{
            waiting_time[2] = target_time[2] - present_time[2];
        }

        if(target_time[1]<present_time[1]){
            waiting_time[1] = 60 + target_time[1] - present_time[1];
            target_time[0] -= 1;
        }else{
            waiting_time[1] = target_time[1] - present_time[1];
        }

        if(target_time[0]<present_time[0]){
            waiting_time[0] = 24 + target_time[0] - present_time[0];
        }else{
            waiting_time[0] = target_time[0] - present_time[0];
        }

        if(waiting_time[0]==0 && waiting_time[1]==0 && waiting_time[2]==0) {
            System.out.println("24:00:00");
        }else{
            StringBuffer sb = new StringBuffer();
            for(int time : waiting_time){
                if(sb.length() > 0)
                    sb.append(":");

                if(String.valueOf(time).length()<2)
                    sb.append("0");

                sb.append(time);
            }        

            System.out.println(sb.toString());
        }

        
    }
    
}
