import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class week1_D5_7 {
    public static void main(String[] args) throws IOException{
        String[] croAlpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int idx = 0, count = 0;
        while(idx < str.length()){
            int isCheck = 0;

            for(int i = 0; isCheck ==0 && i < croAlpha.length ;i++){
                if(str.substring(idx).startsWith(croAlpha[i]) == true){
                    idx += croAlpha[i].length();
                    isCheck = 1;
                }
            }

            if(isCheck == 0)
                idx += 1;
            count++;
        }

        System.out.println(count);
    }
}
