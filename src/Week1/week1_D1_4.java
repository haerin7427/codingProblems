package Week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/4344
// time: 10m
// Create by haerin on 2021/09/07

public class week1_D1_4 {

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i=0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int num = Integer.parseInt(st.nextToken());

            int[] arr = new int[num];
            int sum =0;
            for(int k=0; k < num; k++){
                arr[k] = Integer.parseInt(st.nextToken());
                sum += arr[k];
            }
            int avg = sum / num;
            int count =0;
            for(int k=0; k < num; k++)
                if(arr[k] > avg)
                    count+=1;
            
            double perc = 100.0 * count / num;

            sb.append(String.format("%.3f", perc)+"%\n");
                
        }

        System.out.println(sb);


    }

}