package joon.String;
// https://www.acmicpc.net/problem/16916
// title : 부분 문자열
// time : 3:41
// Created by haerin on 2022/06/07 + Google (https://devje8.tistory.com/24)
// 알고리즘 : KMP

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class joon16916 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        String P = br.readLine();

        System.out.println(KMP(S, P));
    }

    public static int KMP(String origin, String pattern) {
		int j = 0;
        int result = 0;
        int[] pi = getPi(pattern);
		for (int i = 0; i < origin.length(); i++) {
			// 맞는 위치가 나올 때까지 j - 1칸의 공통 부분 위치로 이동
			while(j > 0 && origin.charAt(i) != pattern.charAt(j)) {
				j = pi[j - 1];
			}
			// 맞는 경우
			if(origin.charAt(i) == pattern.charAt(j)) {
				if(j == pattern.length() - 1) {
					result = 1;
					break;
				}
				//맞았지만 패턴이 끝나지 않았다면 j를 하나 증가
				else
					++j;
			}
		}
        return result;
	}

    public static int[] getPi(String pattern) {
		int j = 0;
        int[] pi = new int[pattern.length()];
		for (int i = 1; i < pattern.length(); i++) {
			// 맞는 위치가 나올 때까지 j - 1칸의 공통 부분 위치로 이동
			while(j > 0 && pattern.charAt(i) != pattern.charAt(j)){
				j = pi[j - 1];
			}
			// 맞는 경우
			if(pattern.charAt(i) == pattern.charAt(j)) {
				//i길이 문자열의 공통 길이는 j의 위치 + 1
				pi[i] = ++j;
			}
		}
        return pi;
	}
}