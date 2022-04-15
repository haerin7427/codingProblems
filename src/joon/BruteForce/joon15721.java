package joon.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/15721
// title : 번데기
// time : 45m
// Create by haerin on 2022/04/15

public class joon15721 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num_people = Integer.parseInt(br.readLine());
        int get_th = Integer.parseInt(br.readLine());
        int get_word = Integer.parseInt(br.readLine());

        // int ans = getPerson(num_people, get_th ,get_word);
        // System.out.println(ans);

        int th = 0;
        int sum = 0;
        while(sum < get_th * 2 ){
            th += 1;
            sum += 4 + 2*(th+1);
        }
        sum -= 4 + 2*(th+1);

        
        int[] rules = new int[4 + 2*(th+1)];
        rules[0] = 0; rules[1] = 1;
        rules[2] = 0; rules[3] = 1;
        for(int i=4; i<rules.length; i++){
            if(i-4 < th+1)
                rules[i] = 0;
            else
                rules[i] = 1;
        }

        int person = sum % num_people;
        int pre_th = sum/2;
        int ans = 0;
        for(int i=0; i<rules.length; i++){
            if(get_word == rules[i]){
                pre_th+=1;
                if(pre_th == get_th){
                    ans = person;
                    break;
                }
            }

            person += 1;
            if(person == num_people)
                person -= num_people;
        }
        System.out.println(ans);
    }

    public static int getPerson(int num_people, int get_th ,int get_word ){

        int cycle = 2;
        int cnt_0=0, cnt_1=0;
        while(true){

            for(int i=0; i<4; i++){
                if(i%2==0) cnt_0+=1;
                else cnt_1+=1;

                if(get_th == cnt_0 && get_word == 0) return (cnt_0+cnt_1-1)%num_people;
                if(get_th == cnt_1 && get_word == 1) return (cnt_0+cnt_1-1)%num_people;
            }

            for(int i=0; i<cycle; i++){
                cnt_0+=1;
                if(get_th == cnt_0 && get_word == 0) return (cnt_0+cnt_1-1)%num_people;
            }

            for(int i=0; i<cycle; i++){
                cnt_1+=1;
                if(get_th == cnt_1 && get_word == 1) return (cnt_0+cnt_1-1)%num_people;
            }
            cycle += 1;
        }

        

    }
    
}
