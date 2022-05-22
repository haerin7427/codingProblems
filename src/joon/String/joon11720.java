package joon.String;

import java.util.Scanner;

// https://www.acmicpc.net/problem/11720
// title : 숫자의 합
// time : 8m
// Create by haerin on 2022/05/22
 
public class joon11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String num = sc.next();

        int count = 0;
        for(int i=0; i<num.length(); i++)
            count += num.charAt(i) - '0';
        
        System.out.println(count);
    }
    
}
