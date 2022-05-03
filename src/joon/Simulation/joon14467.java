package joon.Simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14467
// title : 소가 길을 건너간 이유 1
// time : 4m
// Create by haerin on 2022/05/03

// 자료구조 : HashMap

public class joon14467 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashMap<String, String> report = new HashMap<>();

        int count = 0;
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String cow_Number = st.nextToken();
            String cow_Location = st.nextToken();

            if(report.get(cow_Number) != null && report.get(cow_Number).equals(cow_Location) == false){
                    count += 1;
                    report.put(cow_Number, cow_Location);
            }else
                report.put(cow_Number, cow_Location);

        }

        System.out.println(count);
    }
    
}
