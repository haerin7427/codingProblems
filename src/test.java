import java.io.IOException;
import java.util.Scanner;

// 지우지 말자
class PTable {
    int pay;
    int sv;
     
    public PTable(int pay, int sv) {
        this.pay = pay;
        this.sv = sv;
    }
}
 

public class test {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
        {
            int n = sc.nextInt(); // 직원수
             
            PTable[] pt = new PTable[n+1];
            pt[0] = new PTable(sc.nextInt(), 0); // 다슬이의 첫연봉
            int inc = 0;
            for (int i = 1; i <= n; i++) {
                pt[i] = new PTable(sc.nextInt(), sc.nextInt());
                int idx = i;
                while (idx > 0) {
                    if(pt[pt[idx].sv].pay <= pt[idx].pay) {
                        pt[pt[idx].sv].pay += pt[i].pay;  // 신입사원 연봉만큼 인상한다.
                        inc++;
                        idx = pt[idx].sv;
                    } else {
                        break;
                    }
                }
            }
             
            System.out.println("#" + test_case + " " + inc);// 연봉 인상을 받은 직원수의 합
 
        }
	}
}