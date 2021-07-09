import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1157
// 1. 단어 입력받기
// 2. 소문자로 통일
// 3. 알파벳 별로 카운트 
// 3-1 최대 수보다 크면 갱신
// 3-2 최대 수랑 같으면 해당 부분 변수에 확인
// 30m

public class week1_D2_5{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String testWord = br.readLine();
        testWord = testWord.toUpperCase();

        int[] alphaCount = new int[26];
        int max = 0; //같은 알파벳이 등장한 최대 수 
        int isEqual = 0; //같은 경우가 있는 지 검사
        char maxValue = '?'; //가장 많이 나왔던 단어 저장

        for(int i =0; i< testWord.length(); i++){
            alphaCount[(int)testWord.charAt(i)-65] += 1;

            if(alphaCount[(int)testWord.charAt(i)-65] > max){
                max = alphaCount[(int)testWord.charAt(i)-65];
                maxValue = testWord.charAt(i);
                isEqual = 0;
            }else if (alphaCount[(int)testWord.charAt(i)-65] == max)
                isEqual = 1;
        }

        if(isEqual == 1)
            System.out.println('?');
        else{
            System.out.println(maxValue);
        }

     
    }
}