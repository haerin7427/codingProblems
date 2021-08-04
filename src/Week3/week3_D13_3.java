package Week3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

// https://www.acmicpc.net/problem/16435
// time: 12m 
// Create by 김해린 on 2021/08/04
// 다음에는 다른 방법으로 풀어보기!

public class week3_D13_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int[] height = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i<N; i++)
            height[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(height);

        for(int i = 0; i < N; i++){
            if(L < height[i])
                break;
            else
                L += 1;
        }
        System.out.println(L);
    }
    
}
