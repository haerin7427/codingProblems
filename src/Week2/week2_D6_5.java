package Week2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;

// https://www.acmicpc.net/problem/10867
// time : 25m
public class week2_D6_5 {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] num = br.readLine().split(" ");
        br.close();
        ArrayList<Integer> arr = new ArrayList<>();

        for(String item : num){
            if(arr.contains(Integer.parseInt(item)) == false)
                arr.add(Integer.parseInt(item));
        }


        arr.sort(Comparator.naturalOrder());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 0; i < arr.size(); i++)
            bw.write(arr.get(i) + " ");
    
        bw.flush();
        bw.close();
        
    }
}
