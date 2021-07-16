import java.util.*;

// https://www.acmicpc.net/problem/2164
// time : 15m

public class week2_D6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue queue = new LinkedList();

        for(int i = 0 ; i < N; i++)
            queue.offer(i+1);

        int isDelete = 1;
        while(queue.size() != 1){

            int temp = (int)queue.poll();
            if(isDelete == 0){
                queue.offer(temp);
                isDelete = 1;
            }else
                isDelete = 0;

        }

        System.out.println(queue.poll());
        
    }
}
