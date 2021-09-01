package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/17216
// time: 20m + ...
// Create by haerin on 2021/08/11

public class week4_D18_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int[] arr = new int[N];
        int ans = 0;

        for(int i =0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        for(int i =0; i < N; i++){
            if( i != N-1 && arr[i] > arr[i+1] && arr[i]>0)
                ans += arr[i];
            else if(i == N-1 && arr[i-1] > arr[i] && arr[i]>0)
                ans += arr[i];
        }
        System.out.println(ans);
    }
    
}
