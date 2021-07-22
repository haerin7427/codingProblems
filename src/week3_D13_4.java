import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/15729
// time : 30m
 
public class week3_D13_4{

    public static void main(String[] args) throws IOException{

        // 입력값 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        int [] arr2 = new int[N];
        br.close();

        // arr 기준으로 arr2 맞추기
        int count =0;
        for(int idx = 0 ; idx < N; idx++){
            if(arr[idx] != arr2[idx]){
                count++;
                arr2[idx] = checkNum(arr2[idx]);

                if(idx < (N -2)){
                    arr2[idx+1] = checkNum(arr2[idx+1]);
                    arr2[idx+2] = checkNum(arr2[idx+2]);
                }else if(idx < (N -1))
                    arr2[idx+1] = checkNum(arr2[idx+1]);
            }
        }
        System.out.println(count);
    }

    private static int checkNum (int num){
        if(num == 0)
            return 1;
        else
            return 0;
    }
}