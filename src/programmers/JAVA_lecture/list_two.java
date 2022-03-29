package programmers.JAVA_lecture;

public class list_two {

    class Solution {
        public boolean solution(int[] arr) {
            boolean answer = true;
            int[] check = new int[arr.length];
            
            for(int i=0; i<arr.length; i++){            
                if(arr[i] <= arr.length && check[arr[i]-1] == 0)
                    check[arr[i]-1] += 1;
                else{
                    answer = false;
                    break;
                }
            }
    
            return answer;
        }
    }

    
}
