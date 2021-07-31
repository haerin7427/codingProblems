package Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/10026
// time : 60m + help
// Create by 김해린 on 2021/07/29

public class week2_D9_5 {
    static int N;
    static char[][] map;
    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        boolean[][][] visit = new boolean[2][N][N];

        for(int i = 0; i < N; i++)
            map[i] = br.readLine().toCharArray();

        int[] ans = {0, 0};

        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visit[k][i][j]) {
                        dfs(i, j, visit[k], map[i][j]);
                        ans[k]++;
                    }
                    if (map[i][j] == 'G')
                        map[i][j] = 'R';
                }
            }
        }

        System.out.println(ans[0] + " " + ans[1]);
    }

    static void dfs(int y, int x, boolean[][] visit, char ch) {

        visit[y][x] = true;

        for(int i = 0 ; i < 4; i++){ //4방향 이동

            int newY = y + dy[i];
            int newX = x + dx[i];

            if(newX >= 0 && newX < N && newY >= 0 && newY < N && map[newY][newX] == ch && visit[newY][newX] == false)
                dfs(newY, newX, visit, ch);
        }
    }
    
}