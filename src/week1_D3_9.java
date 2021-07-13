import java.util.Scanner;

// https://www.acmicpc.net/problem/15947
// time : 35m

public class week1_D3_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String[] sing = {"baby", "sukhwan", "tururu", "turu", "very", "cute", "tururu", "turu", "in", "bed", "tururu", "turu", "baby", "sukhwan"};
        // String[] s = "baby sukhwan tururu turu very cute tururu turu in bed tururu turu baby sukhwan".split(" "); 간편하게!!
    
        int count = 0;

        // 반복문 필요없이 /, % 사용하면 편함
        while( (14 * count) > num || num > (14 * (count +1))){
            count++;
        }

        // ru가 몇번 등장하는 지, tu를 ""으로 대체하여 length로 구할 수 있음
        if(count == 0)
            System.out.println(sing[num-1]);
        else{
            int idx = num - (14 * count);

            if(sing[idx-1].contains("ru")){

                if(count < 3){
                    for(int i = 0 ; i < count; i++)
                        sing[idx-1] += "ru";
                }else if(count == 3){
                    if(idx %4 == 0){
                        sing[idx-1] = "tururururu";
                    }else
                        sing[idx-1] = "tu+ru*"+Integer.toString(count+2);
                }else{
                    if(idx %4 == 0)
                        sing[idx-1] = "tu+ru*"+Integer.toString(count+1);
                    else
                        sing[idx-1] = "tu+ru*"+Integer.toString(count+2);
                }
                   
       
                System.out.println(sing[idx-1]);

            }else
                System.out.println(sing[idx-1]);
            

        }
    }
}
