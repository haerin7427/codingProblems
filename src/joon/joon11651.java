package joon;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/11651
// time: 10m (성능 향상 필요)
// Create by haerin on 2021/09/04

public class joon11651 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr ,new Comparator<int[]>(){
            @Override
            public int compare(int[] p1, int[] p2){
              if(p1[1] == p2[1] ) //y좌표가 동일하면
                return Integer.compare(p1[0],p2[0]); //x좌표 비교
              else  //y좌표가 다르면
                return Integer.compare(p1[1],p2[1]); //y좌표 비교
            }
          });

          StringBuilder sb = new StringBuilder();
    for(int i =0; i <N;i++){
      sb.append(arr[i][0]+ " "+ arr[i][1]).append('\n');
    }
   
    System.out.println(sb);
    }
}
