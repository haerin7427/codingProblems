package joon.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// 11:10 ~ ing
public class joon1969 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int min_HD = M*(N-1), min_idx = -1;
        String[] DNA = new String[N];
        
        for(int i=0; i<DNA.length; i++)
            DNA[i] = br.readLine();

        char[] ans = new char[M];

        
        for(int i=0; i<M; i++){

            HashMap<Character, Integer> hashmap = new HashMap<>();

            for(int dna_idx=0; dna_idx<N; dna_idx++){
                hashmap.put(DNA[dna_idx].charAt(i), hashmap.getOrDefault(DNA[dna_idx].charAt(i), 0)+1);
            }

            int max = 0; char max_key;
            for(char key : hashmap.keySet()){
                if(max < hashmap.get(key)){
                    max = hashmap.get(key);
                    max_key = key;
                }else if()
            }


            
        }

        

        System.out.println(DNA[min_idx]);
        System.out.println(min_HD);
        


        
    }

    
}
