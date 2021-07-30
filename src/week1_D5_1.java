import java.io.BufferedReader;
import java.io.IOException;

// https://www.acmicpc.net/problem/2163
// time : 10m

import java.io.InputStreamReader;

public class week1_D5_1 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        System.out.println(N-1+N*(M-1));

    }
    
}
