package Week2;
import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/1427
// time : 12m

public class week2_D7_5 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] num = new int[str.length()];

        for(int i = 0; i < str.length(); i++)
            num[i] = Integer.parseInt(str.substring(i, i+1));

        Arrays.sort(num);

        StringBuilder sb = new StringBuilder();

        for(int i = num.length; i > 0; i--)
            sb.append(num[i-1]);

        System.out.println(sb);
    }
    
}
