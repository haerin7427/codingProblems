package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/11399
// time: 15m
// Create by haerin on 2021/08/25

public class week4_D17_9 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);

        int sum=arr[0];
        for(int i=1; i<N; i++){
            arr[i] = arr[i-1]+ arr[i];
            sum += arr[i];
        }

        System.out.println(sum);
    }
    
}
