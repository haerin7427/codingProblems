package Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/11047
// time: 30m
// Create by 김해린 on 2021/08/04

public class week3_D13_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int ans = 0;

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        for(int i=N-1; i>-1; i--){
            if(K >= arr[i]){
                ans += (K/arr[i]);
                K = K%arr[i];
            }
            if(K==0){
                System.out.println(ans);
                return;
            }
        }
        
 
    }
}
