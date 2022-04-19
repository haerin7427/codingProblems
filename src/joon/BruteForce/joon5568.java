package joon.BruteForce;

// https://www.acmicpc.net/problem/5568
// title : 카드 놓기
// time : 50m
// Create by haerin on 2022/04/19

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class joon5568 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        boolean[] isAdd = new boolean[n];
        for(int i=0; i<isAdd.length; i++)
            isAdd[i] = false;
        int[] nums = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = Integer.parseInt(br.readLine());
        
        
        HashSet<Integer> hs = new HashSet<>();
        int[] num = new int[k];
        findTheNumberOfCase(k, 1, hs, isAdd, nums, num);
        System.out.println(hs.size());

    }

    public static void findTheNumberOfCase(int k, int now_k, HashSet<Integer> hs, boolean[] isAdd, int[] nums, int[] num){
        
        for(int i=0; i<isAdd.length; i++){

            if(isAdd[i] == false){
                isAdd[i] = true;
                num[now_k-1] = nums[i];

                if(k > now_k){
                    findTheNumberOfCase(k, now_k+1, hs, isAdd, nums, num);

                }else if(k == now_k){
                    StringBuffer sb = new StringBuffer();
                    for(int num_i=0; num_i< num.length; num_i++){
                        sb.append(Integer.toString(num[num_i]));
                    }
                    String str = sb.toString();
                    
                    if(hs.contains(Integer.parseInt(str)) == false){
                        hs.add(Integer.parseInt(str));
                    }
                }

                isAdd[i] = false;
            }
        }
    }
    
}
