package Week2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/17215
// time : ...

public class week2_D6_9 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int idx = 0, score =0;

        for(int frame = 0; frame < 10 && idx < str.length(); frame++){

            if('0' < str.charAt(idx) && str.charAt(idx)  <= '9'){
                idx+=1;

                if('0' < str.charAt(idx) && str.charAt(idx)  <= '9'){
                    score += Integer.parseInt(str.substring(idx-1, idx));
                    score += Integer.parseInt(str.substring(idx, idx+1));
                }else if(str.charAt(idx) == 'P' ){
                    score += 10;
                    if('0' < str.charAt(idx+1) && str.charAt(idx+1)  <= '9'){
                        score += Integer.parseInt(str.substring(idx+1, idx+2));
                    }else if(str.charAt(idx+1) == 'S'){
                        score += 10;
                    }
                    
                }else if(str.charAt(idx) == '-' ){
                    score += Integer.parseInt(str.substring(idx-1, idx));
                }
                idx+=1;
            }else if(str.charAt(idx) == '-'){
                idx+=1;
                if('0' < str.charAt(idx) && str.charAt(idx)  <= '9'){
                    score += Integer.parseInt(str.substring(idx, idx+1));
                }else if(str.charAt(idx) == 'P' ){
                    score += 10;
                    if('0' < str.charAt(idx+1) && str.charAt(idx+1)  <= '9'){
                        score += Integer.parseInt(str.substring(idx+1, idx+2));
                    }else if(str.charAt(idx+1) == 'S'){
                        score += 10;
                    }
                }
                idx+=1;

            }else if(str.charAt(idx) == 'S'){
                score += 10;

                if(str.charAt(idx+2) == 'P')
                    score += 10;
                else {
                    for(int i = 1; i < 3 ; i++){
                        if('0' < str.charAt(idx+i) && str.charAt(idx+i) <= '9')
                            score += Integer.parseInt(str.substring(idx+i, idx+i+1));
                        else if(str.charAt(idx+i) == 'S')
                            score += 10 ;
                    }

                }

                idx+=1;
            }
        }

        System.out.println(score);

    }
    
}
