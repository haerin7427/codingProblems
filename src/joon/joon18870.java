package joon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/18870
// time: 13m + ...
// Create by haerin on 2021/09/05

public class joon18870 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        

        for(int i=0; i<N; i++){
            int count = 0;
            for(int k=0; k<N; k++){
                if(i == k)
                    continue;
                
                if(arr[i] > arr[k])
                    count += 1;
            }
            sb.append(count+ " ");
        }

        System.out.println(sb);
        
        



        
    }
}
