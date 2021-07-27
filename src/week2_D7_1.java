import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/10814
// time : 30m

public class week2_D7_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] str = new String[N][2];
        
        for(int i = 0 ; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            str[i][0] = st.nextToken();
            str[i][1] = st.nextToken();
        }
        br.close();


        Arrays.sort(str ,new Comparator<String[]>(){
            @Override
            public int compare(String[] s1, String[] s2){
                return Integer.parseInt(s1[0])-Integer.parseInt(s2[0]);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N ; i++)
            sb.append(str[i][0]).append(" ").append(str[i][1]).append("\n");
        System.out.println(sb);
    }
    
}
