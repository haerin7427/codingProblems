package Week1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/17211
// time : 40m

public class week1_D3_5 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] info1 = br.readLine().split(" ");
        String[] info2 = br.readLine().split(" ");

        int days = Integer.parseInt(info1[0]);
        int mood = Integer.parseInt(info1[1]);
        float goodP =1, badP=1;


        for(int i = 0; i < days; i++){
            if(i == 0){
                if(mood == 0){
                    goodP = Float.parseFloat(info2[0]);
                    badP = Float.parseFloat(info2[1]);
                }else{
                    goodP = Float.parseFloat(info2[2]);
                    badP = Float.parseFloat(info2[3]);
                }
            }else{
                float temp = goodP;
                goodP = goodP * Float.parseFloat(info2[0]) + badP * Float.parseFloat(info2[2]);
                badP = temp * Float.parseFloat(info2[1]) + badP * Float.parseFloat(info2[3]);
            }
        }

        
        goodP = goodP * 1000;
        badP = badP * 1000;

        bw.write(Math.round(goodP) + "\n" + Math.round(badP) );
        bw.flush();
        bw.close();

    }
    
}
