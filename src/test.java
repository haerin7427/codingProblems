import java.util.StringTokenizer;

public class test {

    public static void main(String[] args) {
        String testStr = "Baaa";

        StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < 3; i++)
                sb.append('a');

        String str = testStr.substring(1,4);

        if(sb.equals(testStr.substring(1,4)))
            System.out.println("true");
        else
            System.out.println("false");
    }
    
}
