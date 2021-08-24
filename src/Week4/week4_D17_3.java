package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/11052
// time: 35m +
// Create by haerin on 2021/08/24

public class week4_D17_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int card = Integer.parseInt(br.readLine());
            
        int[] costs = new int[card];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<card; i++)
            costs[i] = Integer.parseInt(st.nextToken());

        int total=0;

        while(card != 0){

            float max = (float)costs[0]; int idx=0;
            for(int i=1; i<card; i++){
                float value = (float)costs[i]/(i+1);
                if(max < value ){
                    max = value;
                    idx=i;
                }
            }

            //int num = card / (idx+1);
            if(card==1){
                total += costs[0];
                card = 0;
            }else{
                total += (card / (idx+1)) * costs[idx];
                card = card % (idx+1);
            } 
        }

        System.out.println(total);
    }
    
}
