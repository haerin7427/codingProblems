package Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// https://www.acmicpc.net/problem/1181
// time: 30m
// Create by haerin on 2021/08/08

// 1. 길이가 짧은 것부터
// 2. 길이가 같으면 사전 순으로
// 중복된 문자열 없애기 > 중복된 단어 출력 안하는 방법도 있음!
// 중복 확률이 높지 않다면 성능 측면에서 더 좋은 방법이 될수있음!

public class week3_D14_7 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<String> list = new ArrayList<>();
        for(int i =0; i< N; i++){
            String temp = br.readLine();
            if(!list.contains(temp))
                list.add(temp);
        }

        Collections.sort(list, new Comparator<String>(){
            @Override
            public int compare(String f1, String f2) {
                if(f1.length() < f2.length())
                    return -1;
                else if (f1.length() > f2.length())
                    return 1;
                else
                    return f1.compareTo(f2);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(String str : list)
            sb.append(str+"\n");
        System.out.println(sb);
        
    }
}
