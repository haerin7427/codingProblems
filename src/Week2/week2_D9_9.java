package Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2292
// time : 60m
// Create by 김해린 on 2021/08/01

public class week2_D9_9 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if(N==1)
            System.out.println(1);
        else{
            int layer = 2;
            int max = 7;
            while(true){
                if(N <=max) 
                    break;
                layer += 1;
                max += 6 * (layer - 2) + 6;
            }
            System.out.println(layer);
        }
    }
}
