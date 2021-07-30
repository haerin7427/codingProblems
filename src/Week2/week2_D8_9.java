package Week2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.LinkedHashMap;

// https://www.acmicpc.net/problem/3040
// time :  45m

// 1. hashMap 생성
// 2. 전체에서 - 100
// 3. 오버값 - 기준값 한 수가 존재하는 지 확인

public class week2_D8_9 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
        int sum = 0;

        for(int i = 0; i < 9; i++){
            String s = br.readLine();
            hm.put(s, 0);
            sum += Integer.parseInt(s);
        }

        Iterator<String> testS = hm.keySet().iterator();
        while(testS.hasNext()){
            String buf = testS.next();
            String temp = Integer.toString((sum -100) - Integer.parseInt(buf));
            if(hm.containsKey(temp) && temp.equals(buf) == false ){
                hm.remove(buf);
                hm.remove(temp);
                break;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Iterator<String> keys = hm.keySet().iterator();
        while(keys.hasNext()){
            bw.write(keys.next()+"\n");
        }

        bw.flush();
        bw.close();
    }
   
}
