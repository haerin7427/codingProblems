package Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/3663
// time: 100m
// Create by haerin on 2021/08/23

public class week3_D15_9 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        for(int i=0; i < testCase; i++){
            String str = br.readLine();
            int count=0;
            int next = str.length()-1; // 최대이동횟수로 초기화. 

            for(int k=0; k<str.length(); k++){
                int N = str.charAt(k)-65;

                if(N > 13)
                    count += 26-N;
                else
                    count += N;

                int temp = k + 1;

                // 현재 지점에서 가장가까우면서 A가 아닌 알파벳 인덱스 탐색.
                while (temp < str.length() && str.charAt(temp) == 'A') {
                    temp++;
                }
                next = Math.min(next, k + str.length() - temp + Math.min(k, str.length() - temp));
            }


            sb.append(count+next+"\n");
        }
        System.out.println(sb);
    } 
}
