import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/17214
// time : 20m + ...
// Create by 김해린 on 2021/07/30

public class week2_D10_9 {


    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"+");

        String[] str = new String[st.countTokens()];

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length; i++){
                
            String temp = st.nextToken();
            int count = 0;

            for(int k = 0; k < temp.length(); k++){
                if(temp.charAt(k) == 'x')
                    count++;
            }

            int num = Integer.parseInt(temp.substring(0, temp.length() - count));

            num = num / (count +1);


            sb.append(num);
            for(int h = 0; h < count+1; h++)
                sb.append("x");
                
            sb.append("+");
        }

        sb.append("W");

        System.out.println(sb);
    }
    
}
