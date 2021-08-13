package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1436
// time: 20m
// Create by haerin on 2021/08/13

public class week4_D20_7 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N= Integer.parseInt(br.readLine());
        int num = 666;

        while(--N >0){
            while(true){
                num += 1;
                if(Integer.toString(num).contains("666"))
                    break;
            }
        }
        System.out.println(num);
    }  
}


