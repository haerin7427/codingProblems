package Week2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1920
// time : 30m


public class week2_D8_7 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < N ; i++) hm.put(st.nextToken(), 0);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        String[] str = new String[M];
        for(int i = 0; i < M; i++) str[i] = st.nextToken();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for( String s : str){
            if(hm.containsKey(s)) bw.write("1\n");
            else bw.write("0\n");
        }

        bw.flush();
        bw.close();
    }
}