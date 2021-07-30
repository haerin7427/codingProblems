package Week1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// https://www.acmicpc.net/problem/2799
// 1. 층수 M 과 창문 수 N을 입력 받는다.
// 2. (5M+1) * (5N+1) 문자열에 아파트 정보 입력 받는다.
// 3. x,y index로 +5씩해서 창문 첫 줄의 위치를 잡고 타입을 검사한다.
// time : 50m

public class week1_D1_7  {
    public static void main(String[] args) throws IOException, NumberFormatException {

        // step 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);

        
        // step 2
        String[] info = new String[5*M+1];
        for(int i = 0; i < 5*M+1;i++)
            info[i] = br.readLine();

            
        // step 3
        int[] result = new int[5]; // 블라인드 타입 별 수 저장
        int count = 0; // 블라인드 얼마나 내렸는 지 확인

        for(int y = 1 ; y < 5*M+1; y +=5){
            for(int x = 1;x < 5*N+1; x+=5){
                count = 0; // 새 창문일 경우 초기화
                for(int num = 0; num < 4;num++){
                    if( info[y+num].substring(x, x+4).equals("****")) // 블라인드 상태인지 확인!
                        count++;
                    else
                        break; //블라인드 상태가 아닌 경우 바로 검사 종료
                }
                result[count]++;
            }

        }


        // step 4 : 출력
        for(int i=0;i <5;i++)
            System.out.print(result[i]+" ");

    }
}
