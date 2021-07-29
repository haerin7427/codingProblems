import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/3000
// time : 30m + 시간초과 미해결 ... 자료없음 맞힌사람 1명
// Create by 김해린 on 2021/07/29

public class week2_D9_7 {

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String[][] arr = new String[N][2];

        for(int i = 0; i <N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        int ans = 0;
        for(int i = 0 ; i < N; i++){
            int countx = 0, county =0;

            for(int k =0; k < N ; k++){
                if(k == i) continue;
                else{
                    if(arr[i][0].equals(arr[k][0]))
                        countx +=1;
                    else if(arr[i][1].equals(arr[k][1]))
                        county +=1;
                }
            }
            ans += (countx * county);
        }
        System.out.println(ans);

    }
    
}
