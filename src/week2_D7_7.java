import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/11004
// time : 10m

public class week2_D7_7 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        int[] info = new int[2];
        info[0] = Integer.parseInt(st1.nextToken());
        info[1] = Integer.parseInt(st1.nextToken());

        int[] arr = new int[info[0]];
        for(int i = 0; i <info[0];i++)
            arr[i] = Integer.parseInt(st2.nextToken());

        Arrays.sort(arr);
        System.out.println(arr[info[1]-1]);
    }
    
}
