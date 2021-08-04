package Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2806
// time: 60m + ...
// Create by 김해린 on 2021/08/04
// DP로 풀어보기

public class week3_D13_5 {

    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char DNA[] = br.readLine().toCharArray();
		char last = DNA[0];
		int cnt = 0;

		for (int i = 1; i < n; i++) {
			if (last == DNA[i]) {
				continue;
			}
			if (i + 1 == n) {
				last = 'A';
			} else if (last != DNA[i + 1]) {
				last = DNA[i];
			}
			cnt++;
		}

		if (last != 'A') {
			cnt++;
		}
        
		System.out.print(cnt);
	}
    
}