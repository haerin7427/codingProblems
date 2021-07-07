// https://www.acmicpc.net/problem/2920

// 1. 8개의 음 입력받기
// 2-1. 첫글자가 1이면 ascending test
// 2-2. 첫글자가 8이면 descending test
// 2-3. 그외 mixed 판정
// 3. 결과 출력
// 45m

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class week1_D1_1 {
    public static void main(String[] args) throws IOException, NumberFormatException {


        //step 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        
        int[] sound = new int[8];

        for(int i =0; i < 8;i++)
            sound[i] = Integer.parseInt(input[i]);


        //step 2    
        int idx = 1;
        if(sound[0]==1){
            //step2-1
            while(idx <8){
                if(sound[idx] != idx +1)
                    break;
                else
                    idx++;
            }
            if(idx == 8)
                System.out.println("ascending");
            else
                System.out.println("mixed");


        }else if(sound[0] == 8){
            //step2-2
            while(idx <8){
                if(sound[idx] != 8 - idx)
                    break;
                else
                    idx++;
            }
            if(idx == 8)
                System.out.println("descending");
            else
                System.out.println("mixed");


        }else{
            //step2-3
            System.out.println("mixed");
        }
    
    }
}
