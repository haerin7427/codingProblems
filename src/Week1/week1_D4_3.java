package Week1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/3052
// time : 10m

public class week1_D4_3 {

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] checkBox = new int[42];
        int count = 0;

        for(int i = 0 ; i < 10;i++){
            String num = br.readLine();
            int value = (Integer.parseInt(num) %42);

            if(checkBox[value] == 0){
                checkBox[value] = 1;
                count++;
            }
        }

		System.out.println(count);
    }
    
}
