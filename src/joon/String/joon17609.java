package joon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class joon17609 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); 
        String[] str = new String[T];
        for(int i=0; i<str.length; i++)
            str[i] = br.readLine();

        for(int i=0; i<str.length; i++){
            int answer = 0;
            String word = str[i];

            int pre_idx = 0;
            int post_idx = word.length()-1;

            while(pre_idx < post_idx){
                if(word.charAt(pre_idx) == word.charAt(post_idx)){
                    pre_idx+=1;
                    post_idx-=1;
                }else if(answer == 0 && pre_idx+1<=post_idx && word.charAt(pre_idx+1) == word.charAt(post_idx)){
                    answer = 1;
                    pre_idx+=2;
                    post_idx-=1;

                }else if(answer == 0 && pre_idx<=post_idx-1 && word.charAt(pre_idx) == word.charAt(post_idx-1)){
                    answer = 1;
                    pre_idx+=1;
                    post_idx-=2;
                }else{
                    answer = 2;
                    break;
                }
            }
            System.out.println(answer);
        }

    }
    
}
