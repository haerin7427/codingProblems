package joon.BruteForce;

// https://www.acmicpc.net/problem/2798
// title : 블랙잭
// time : 15m
// Create by haerin on 2022/04/14 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class joon2798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String temp = br.readLine();
        StringTokenizer st = new StringTokenizer(temp, " ");

        int card_num = Integer.parseInt(st.nextToken());
        int limit_num = Integer.parseInt(st.nextToken());

        temp = br.readLine();
        st = new StringTokenizer(temp, " ");
        int[] cards = new int[card_num];
        
        for(int i=0; i<cards.length; i++)
            cards[i] = Integer.parseInt(st.nextToken());
        
        Arrays.sort(cards);
        
        int max = 0;

        for(int x=0; x<cards.length-2; x++)
            for(int y=x+1; y<cards.length-1; y++)
                for(int z=y+1; z<cards.length; z++){
                    if(cards[x] + cards[y] + cards[z] > max && cards[x] + cards[y] + cards[z] <= limit_num)
                        max = cards[x] + cards[y] + cards[z];
                }

        System.out.println(max);
    }
    
}
