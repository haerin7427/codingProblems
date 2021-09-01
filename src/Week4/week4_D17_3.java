package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/11052
// time: 85m
// Create by haerin on 2021/08/25

public class week4_D17_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int card = Integer.parseInt(br.readLine());
        int[] costs = new int[card+1];
        int[] d = new int[card+1];
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=1; i<=card; i++)
            costs[i] = Integer.parseInt(st.nextToken());

        // x: 필요한 카드 개수, y: 팩으로 사는 카드 수
        for(int x=1; x<=card; x++)
            for(int y=1; y<=x; y++)
                d[x] = Math.max(d[x], d[x - y] + costs[y]);

        System.out.println(d[card]);
    }
    
}
