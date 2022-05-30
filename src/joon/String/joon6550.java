package joon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/6550
// title : 부분 문자열
// time : 20m
// Created by haerin on 2022/05/30

public class joon6550 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        String str;
        while((str = br.readLine()) != null){

            StringTokenizer st = new StringTokenizer(str);
            String s = st.nextToken();
            String t = st.nextToken();

            int s_idx =0;
			for (int i = 0; i < t.length(); i++) {
				if (s.charAt(s_idx) == t.charAt(i)) {
					s_idx++;
				}
				if (s_idx == s.length())
					break;
			}

            if(s_idx == s.length()) sb.append("Yes\n");
            else sb.append("No\n");
        }

        System.out.println(sb);
    }
    
}
