package joon.Simulation;

// https://www.acmicpc.net/problem/1212
// time : 30m
// title : 8진수 2진수
// Create by haerin on 2022/04/28

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class joon1212 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input_num = br.readLine();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<input_num.length(); i++){
        
            String tmp =  Integer.toBinaryString(input_num.charAt(i)-'0');
            if(tmp.length()==2 && i>0) sb.append("0"+tmp);
			else if(tmp.length()==1 && i>0) sb.append("00"+tmp);
            else sb.append(tmp);
        }
        System.out.println(sb);
    }
    
}
