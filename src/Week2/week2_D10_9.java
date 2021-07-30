package Week2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/17214
// time : 70m
// Create by 김해린 on 2021/07/30

public class week2_D10_9 {


    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        if(input.equals("0"))
          System.out.println("W");
        else{
          int start = 0;

          while(true){
              int idx = input.indexOf("-", start);
              if(idx == -1)
                  break;
              else{
                  input = input.substring(0, idx)+ "+" + input.substring(idx);
                  start = idx +2;
              }
          }

          //System.out.println(">> "+input);
          StringTokenizer st = new StringTokenizer(input,"+");

          String[] str = new String[st.countTokens()];

          StringBuilder sb = new StringBuilder();

          for(int i = 0; i < str.length; i++){
                  
              String temp = st.nextToken();
              int count = 0;

              for(int k = 0; k < temp.length(); k++){
                  if(temp.charAt(k) == 'x')
                      count++;
              }

              int num = Integer.parseInt(temp.substring(0, temp.length() - count));

              num = num / (count +1);

              if(num == -1)
                sb.append("-");
              else if( num != 1)
                sb.append(num);

              for(int h = 0; h < count+1; h++)
                  sb.append("x");
                  
              sb.append("+");
          }

          sb.append("W");

          String temp = sb.toString().replaceAll("\\+-","-");

          System.out.println(temp);


        }
    }
    
}
