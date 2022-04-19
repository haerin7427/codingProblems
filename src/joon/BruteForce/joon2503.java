package joon.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2503
// title : 숫자 야구
// time : 30m + ..
// Create by haerin on 2022/04/19

// 자료구조 : 배열
// 알고리즘 : 완전탐색(Brute-force)

public class joon2503 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int num_question = Integer.parseInt(br.readLine());

        int[][] QnA = new int[num_question][3];
        for(int i=0; i<num_question; i++){
            st = new StringTokenizer(br.readLine(), " ");
            QnA[i][0] = Integer.parseInt(st.nextToken());
            QnA[i][1] = Integer.parseInt(st.nextToken());
            QnA[i][2] = Integer.parseInt(st.nextToken());
        }

        int ans = 0;
        for(int num =123; num<=987; num++){
            String str_num = String.valueOf(num);
            int n1 = str_num.charAt(0) - '0';
            int n2 = str_num.charAt(1) - '0';
            int n3 = str_num.charAt(2) - '0';

            if(n1 == n2 || n2 == n3 || n1 == n3 || n1 ==0 || n2 == 0 || n3 == 0)
                continue;
            
            int isCorrect = 1;
            for(int q=0; q<num_question; q++){
                int countS = 0, countB = 0;
                String q_num = String.valueOf(QnA[q][0]);
                for(int s=0; s<3; s++){
                    if(str_num.charAt(s) == q_num.charAt(s))
                        countS+=1;
                    
                    for(int b=0; b<3; b++){
                        if(s == b)
                            continue;
                        if(str_num.charAt(s) == q_num.charAt(b))
                            countB+=1;
                    }
                }

                if(countS != QnA[q][1] || countB != QnA[q][2]){
                    isCorrect = 0;
                    break;
                }
            }

            if(isCorrect == 1)
                ans += 1;
        }

        System.out.println(ans);
        
    }
}
