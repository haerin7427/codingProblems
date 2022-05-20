package joon.BruteForce;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1065
// title : 한수
// time : 10m
// Create by haerin on 2022/05/20

public class joon1650 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        for(int i=1; i<=num; i++){

            if(i < 100){
                count += 1;
                continue;
            }

            String str = String.valueOf(i);
            int gap = (str.charAt(0)-'0') - (str.charAt(1)-'0');
            int flag = 1;

            for(int j=1; j<str.length()-1; j++){

                if(gap != (str.charAt(j)-'0') - (str.charAt(j+1)-'0')){
                    flag = 0;
                    break;
                }
            }

            if(flag == 1)
                count += 1;

        }
        System.out.println(count);
    }
    
}
