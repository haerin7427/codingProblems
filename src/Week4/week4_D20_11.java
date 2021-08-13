package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWFUu2_aAg4DFAVB&categoryId=AWFUu2_aAg4DFAVB&categoryType=CODE&&&
// timeL 1:55
// Create by haerin on 2021/08/13
public class week4_D20_11 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
    
        for(int idx=1; idx <= testCase; idx+=1){
            int count =0;
            int N = Integer.parseInt(br.readLine()); 
            N+=1;
            int[][] arr = new int[2][N];
            arr[0][0] = Integer.parseInt(br.readLine());
    
            for(int i=1; i < N; i++){
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                arr[0][i] = Integer.parseInt(st.nextToken());
                arr[1][i] = Integer.parseInt(st.nextToken());
                count += checkMoney(arr, i);
            }
    
            sb.append("#"+idx+" "+count+"\n");
    
        }
        System.out.println(sb);
    }
    
    private static int checkMoney (int[][] arr, int idx){
    
        int boss = arr[1][idx];
    
        if(arr[0][boss] < arr[0][idx]){
            arr[0][boss] = arr[0][idx];
    
            if(boss != 0)
                return 1 + checkMoney(arr, boss);
            else
                return 1;
        }else
            return 0;
    }
}


