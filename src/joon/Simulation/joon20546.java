package joon.Simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/20546
// title : 기적의 매매법
// time : 25m
// Create by haerin on 2022/04/29


// 알고리즘 : 그리디
// 자료구조 : 배열

public class joon20546 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] asset_BNP = new int[2]; 
        int[] asset_TIMING = new int[2];
        //asset[0] = money, asset[1] = stock

        asset_BNP[0] = Integer.parseInt(br.readLine());
        asset_TIMING[0] = asset_BNP[0];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] chart = new int[st.countTokens()];
        for(int i=0; i<chart.length; i++)
            chart[i] = Integer.parseInt(st.nextToken());

        int[] checkDays = new int[2];

        for(int i=0; i<chart.length; i++){

            if(asset_BNP[0] >= chart[i]){
                asset_BNP[1] += asset_BNP[0] / chart[i];
                asset_BNP[0] = asset_BNP[0] % chart[i];
            }

            if(i>0 && chart[i] > chart[i-1])
                checkDays[0] += 1;
            else 
                checkDays[0] = 0;

            if(i>0 && chart[i] < chart[i-1])
                checkDays[1] += 1;
            else 
                checkDays[1] = 0;
            
            if(checkDays[0] >= 3 && asset_TIMING[1]>0){
                asset_TIMING[0] += asset_TIMING[1] * chart[i];
                asset_TIMING[1] = 0;
            }else if(checkDays[1] >= 3 && asset_TIMING[0] >= chart[i]){
                asset_TIMING[1] += asset_TIMING[0] / chart[i];
                asset_TIMING[0] = asset_TIMING[0] % chart[i];
            }

        }

        int money_BNP = asset_BNP[0] + asset_BNP[1] * chart[chart.length-1];
        int money_TIMING = asset_TIMING[0] + asset_TIMING[1] * chart[chart.length-1];
        
        if(money_BNP > money_TIMING)
            System.out.println("BNP");
        else if(money_BNP < money_TIMING)
            System.out.println("TIMING");
        else
            System.out.println("SAMESAME");

        
    }
    
}
