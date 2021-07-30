package Week1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/5598
// time : 20m
// 1. 문장읽기
// 2. 문자 -3 하기
// 3. 출력
public class week1_D3_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String text = br.readLine();
        String result = new String();

        for(int i = 0; i < text.length(); i++){
            // System.out.println("check: "+ (char)(text.charAt(i)-3));
            if(text.charAt(i) < 68){
                result = result + (char)(text.charAt(i)-3 + 26);
            }else
                result = result + (char)(text.charAt(i)-3);

        }

        bw.write(result);
        bw.flush();
        bw.close();

    }

    

    
}
