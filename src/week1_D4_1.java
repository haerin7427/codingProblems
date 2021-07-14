import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/2953
// 1. 점수 입력받기
// 2. 참가자별 점수 합계 계산하여 일등 구하기
// time : 20m

public class week1_D4_1 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] records = new int[2];
        for(int i = 0; i < 5; i++){
            String[] score = br.readLine().split(" ");
            int sum=0;
            for(int k = 0; k < 4; k++)
                sum += Integer.parseInt(score[k]);

            if(sum > records[0]){
                records[0] = sum;
                records[1] = i+1;
            }
        }


        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // bw.write(records[1]+ " "+ records[0]);
        // bw.flush();
        // bw.close();

        StringBuffer sb = new StringBuffer();
        sb.append(records[1]).append(" ").append(records[0]);
		System.out.println(sb.toString());



    }
}
