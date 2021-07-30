package Week1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/4659
// 1.무한 반복 시작
// 2. 입력받은 문자열이 'end'인지 확인 > end면 break
// 3. 아닐경우 검사
// 4. 필터1
// 5. 필터2
// 6. 필터3
// 7. 결과 출력 > 2로 다시 이동
//30m

public class week1_D2_1{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String testCase = new String();
        String[] filter1 = {"a", "e", "i","o","u"};
        String[] filter3 = {"ee","oo"};
        int result = 0;
        // System.out.println("start");

        while( (testCase = br.readLine()).equals("end") == false ){

            // System.out.println("filter1");

            // filter1
            for(int i = 0; i < filter1.length; i++){
                if(testCase.contains(filter1[i])){
                    result = 1;
                    break;
                }else if(!testCase.contains(filter1[i]) && i == filter1.length-1){
                    //System.out.println("filter1 E");
                    result = 0;
                }
                    
            }

            // System.out.println("filter2");

            // filter2
            if(result == 1 && testCase.length() > 2){
               int[] check2 = new int[2];
               check2[0] = -1; check2[1] = 0;

               for(int i =0; i < testCase.length(); i++){

                    //모음인지 검사
                    int isCol = 0;
                    for(int a = 0; a < filter1.length; a++){

                        if(testCase.substring(i, i+1).equals(filter1[a])){
                            isCol = 1;
                            break;
                        }       
                    }


                    if(isCol == 1){ //모음일 때

                        if(check2[0] == 0) //전에도 모음
                            check2[1]++;
                        else if(check2[0] == -1){ // 첫글자
                            check2[0] = 0;
                            check2[1] = 1;
                        }
                        else{ //그전에는 자음
                            check2[0] = 0;
                            check2[1] = 1;
                        }

                    }else{ // 자음일때
                        if(check2[0] == 1) //전에도 자음
                            check2[1]++;
                        else if(check2[0] == -1){ // 첫글자 자음
                            check2[0] = 1;
                            check2[1] = 1;
                        }else{ //그전에는 모음
                            check2[0] = 1;
                            check2[1] = 1;
                        }

                    }

                    if(check2[1] == 3){
                        //System.out.println("filter2 E");
                        result = 0;
                        break;
                    }
                   
               }

            }

            // System.out.println("filter3a");

            // filter3
            if(result == 1 && testCase.length() > 1){

                for(int i = 0; i < testCase.length()-1;i++){
                    if(testCase.substring(i, i+1).equals(testCase.substring(i+1, i+2))){
                        if(testCase.substring(i, i+2).equals(filter3[0]) == false && testCase.substring(i, i+2).equals(filter3[1])==false){
                            result = 0;
                            //System.out.println("filter3 E");
                            break;
                        }
                    }
                }
               
            }




            //result             
            if(result == 0){
                // System.out.println("<"+testCase+"> is not acceptable.");
                bw.write("<"+testCase+"> is not acceptable."+"\n");
            }  
            else{
                // System.out.println("<"+testCase+"> is acceptable.");
                bw.write("<"+testCase+"> is acceptable."+"\n");
            }
                

        }
        bw.flush();
        bw.close();
        // System.out.println("finish");
        
    }
}