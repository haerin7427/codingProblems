package programmers.JAVA_lecture;
import java.util.Hashtable;

public class map_one {
    class Solution {
        public int solution(int[] nums) {
            
            Hashtable<Integer, Integer> table = new Hashtable<>();
            for(int n : nums)
                table.put(n, 1);
            
            if(nums.length/ 2 > table.size())
                return table.size();
            else
                return nums.length / 2;

        }
    }
}
