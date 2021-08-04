package Week3;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AW9j74FacD0DFAUY
// time: 120m
// Create by 김해린 on 2021/08/04

public class week3_D13_9 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int[] ans = new int[testCase];

        for(int t=0; t<testCase; t++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            

            int[] R_i = new int[n];
            for(int i=0; i<n; i++)
                R_i[i] = Integer.parseInt(br.readLine());

            int[] W_i = new int[m];
            for(int i=0; i<m; i++)
                W_i[i] = Integer.parseInt(br.readLine());

            
            Queue<Integer> waitingL = new LinkedList<>();

            int[] parking = new int[n]; 
            for(int i=0; i<m*2; i++){
                int action = Integer.parseInt(br.readLine());
                
                if(action > 0){
                    int park_idx=0;
                    while(park_idx < n && parking[park_idx] != 0 )
                        park_idx++;

                    if(park_idx != n){
                        parking[park_idx] = action;
                        ans[t] += W_i[action-1]*R_i[park_idx];
                    }else
                        waitingL.add(action);

                }else{
                    action = Math.abs(action);
                    int loc=0;
                    while(loc < n && parking[loc] != action )
                        loc++;
                    
                    if(loc != n)
                        if(waitingL.isEmpty())
                            parking[loc] = 0;
                        else{
                            int wait_car = waitingL.poll();
                            parking[loc] = wait_car;
                            ans[t] += W_i[wait_car-1]*R_i[loc];
                        }
                }
            }
            
            waitingL.clear();
        }
        br.close();
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<testCase+1; i++)
            sb.append("#"+i+" "+ans[i-1]+"\n");
        System.out.print(sb);
        

    }
    
}


// 제출한 코드는 BufferedReader 대신 Scanner를 사용해서 제출
// import java.util.Scanner;
// import java.io.FileInputStream;
// import java.io.BufferedReader;
// import java.io.IOException;
 
// import java.io.InputStreamReader;
// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.StringTokenizer;
// /
// class Solution
// {
//     public static void main(String args[]) throws IOException
//     {
   
 
        
//         Scanner sc = new Scanner(System.in);
//         int T;
//         T=sc.nextInt();
//         int[] ans = new int[T];
       
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         for(int test_case = 1; test_case <= T; test_case++)
//         {
//             int n = sc.nextInt();
//             int m = sc.nextInt();
             
//             int[] R_i = new int[n];
//             for(int i=0; i<n; i++)
//                 R_i[i] = sc.nextInt();
 
//             int[] W_i = new int[m];
//             for(int i=0; i<m; i++)
//                 W_i[i] = sc.nextInt();
             
 
//             Queue<Integer> waitingL = new LinkedList<>();
 
//             int[] parking = new int[n]; 
//             for(int i=0; i<m*2; i++){
//                 int action = sc.nextInt();
                 
//                 if(action > 0){
//                     int park_idx=0;
//                     while(park_idx < n && parking[park_idx] != 0 )
//                         park_idx++;
 
//                     if(park_idx != n){
//                         parking[park_idx] = action;
//                         ans[test_case-1] += W_i[action-1]*R_i[park_idx];
//                     }else
//                         waitingL.add(action);
 
//                 }else{
//                     action = Math.abs(action);
//                     int loc=0;
//                     while(loc < n && parking[loc] != action )
//                         loc++;
                     
//                     if(loc != n)
//                         if(waitingL.isEmpty())
//                             parking[loc] = 0;
//                         else{
//                             int wait_car = waitingL.poll();
//                             parking[loc] = wait_car;
//                             ans[test_case-1] += W_i[wait_car-1]*R_i[loc];
//                         }
//                 }
//             }
             
             
//             waitingL.clear();
//         }
//         br.close();
//         StringBuilder sb = new StringBuilder();
//         for(int i=1; i<T+1; i++)
//             sb.append("#"+i+" "+ans[i-1]+"\n");
//         System.out.print(sb);
//     }
// }