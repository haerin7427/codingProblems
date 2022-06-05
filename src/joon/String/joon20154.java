package joon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/20154
// title : 이 구역의 승자는 누구야?!
// time : 15m
// Create by haerin on 2022/06/06

public class joon20154 {

    public static void main(String[] args) throws IOException {

        int[] board = new int[]{3,2,1,2,3,3,3,3,1,1,3,1,3,3,1,2,2,2,1,2,1,1,2,2,2,1};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<input.length(); i+=2){
            int num = board[input.charAt(i)-'A'];
            if(i+1< input.length())
                num += board[input.charAt(i+1)-'A']; 
            sb.append(num);
        }

        while(sb.toString().length()>1){
            String str = sb.toString();
            sb = new StringBuilder();
            for(int i=0; i<str.length(); i+=2){
                int num = str.charAt(i)-'0';
                if(i+1< str.length())
                    num += (str.charAt(i+1)-'0'); 
                if(num>9) num%=10;
                sb.append(num);
            }
        }

        if(Integer.parseInt(sb.toString())%2==0)
            System.out.println("You're the winner?");
        else
            System.out.println("I'm a winner!");
    }
}
