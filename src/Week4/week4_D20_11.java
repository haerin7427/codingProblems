package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWFUu2_aAg4DFAVB&categoryId=AWFUu2_aAg4DFAVB&categoryType=CODE&&&
// timeL 120m
// Create by haerin on 2021/08/13
public class week4_D20_11 {
 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
    
        for(int idx=1; idx <= testCase; idx+=1){
            int count =0;
            int N = Integer.parseInt(br.readLine()); 
            N+=1;
            info[] list = new info[N];
            list[0] = new info(Integer.parseInt(br.readLine()), -1);

    
            for(int i=1; i < N; i++){
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                list[i] = new info(Integer.parseInt(st.nextToken()),  Integer.parseInt(st.nextToken()));

                int bossNum = list[i].boss;

                while(bossNum != -1){
                    if(list[bossNum].price < list[i].price){
                        count++;
                        list[bossNum].price = list[i].price;
                        bossNum = list[bossNum].boss; 
                    }else
                        break;
                }
            }
    
            sb.append("#"+idx+" "+count+"\n");
    
        }
        System.out.println(sb);
    }

    static class info{
            
        int price;
        int boss;

        public info(int a, int b){
            price =a;
            boss =b;
        }
    }
    
   

}


