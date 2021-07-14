import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1476
// time : 30m

public class week1_D4_9 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int E = Integer.parseInt(str[0]);
        int S = Integer.parseInt(str[1]);
        int M = Integer.parseInt(str[2]);
    

        int e =1, s=1, m=1;
        for(int year =1;;year++){

            if(e == E  && s == S && m == M ){
                System.out.println(year);
                break;
            }

            e+=1;s+=1;m+=1;

            if(e == 16)
                e=1;
            if(s == 29)
                s=1;
            if(m == 20)
                m=1;
            
        }

    }

    


    
}
