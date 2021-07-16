
// https://leetcode.com/problems/fizz-buzz/
// time : 10m

public class week1_D5_5 {

    class Solution {
        public List<String> fizzBuzz(int n) {
            
            String[] arr = new String[n];
            
            for(int i=0;i < n; i++){
                
                int num = i +1;
                arr[i]="";
    
                
                if(num % 3 == 0){
                    arr[i] = "Fizz";
                }
                    
                if(num % 5 == 0)
                    arr[i] += "Buzz";
                
                if(arr[i] == "")
                    arr[i] = Integer.toString(num);
                
            }
                        
            
            return Arrays.asList(arr);
        }
    }
    
}
