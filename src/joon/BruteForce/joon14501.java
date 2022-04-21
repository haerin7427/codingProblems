package joon.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14501
// title : 퇴사
// time : 30m
// Create by haerin on 2022/04/21

// Algorithm : DFS or DP
// Data stucture : Array

public class joon14501 {
    private static int ans = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] plan = new int[N][2];

        for(int i=0; i<plan.length; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            plan[i][0] = Integer.parseInt(st.nextToken());
            plan[i][1] = Integer.parseInt(st.nextToken());
        }

        dfs(plan, N, 0, 1);
        System.out.println(ans);
        System.out.println(dynamicP(plan,N));
    }

    private static void dfs(int[][] plan, int N, int profit, int day){
        if(day == N+1){
            if(ans < profit)
                ans = profit;
        }else{
            if(day+plan[day-1][0]-1 <= N)
                dfs(plan, N, profit+plan[day-1][1], day+plan[day-1][0]); // 일을 하는 경우
            dfs(plan, N, profit, day+1); // 일을 하지 않는 경우
        }
    }
    private static int dynamicP (int[][] plan, int N){

        int[] dp = new int[N+1]; // idx번째 일을 할 경우, 최대 이익
        int profit = 0;
        for(int i=1; i<=N; i++){ 
            if(i+plan[i-1][0] <= N+1){ 
                // i날에 일을 할 수 있는 가?
                dp[i] = plan[i-1][1];
                for(int j=1; j<i; j++){
                    if(j+plan[j-1][0] <= i) // j날에 일을 해도 i날에 일을 할 수 있는가?
                        dp[i] = Math.max(dp[i], dp[j]+plan[i-1][1]); // j날에 일을 할경우, 그 전 경우 최대 이익 찾기
                }
                profit = Math.max(profit, dp[i]);
            }
        }
        return profit;
    }
}
