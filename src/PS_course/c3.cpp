#include <iostream>
using namespace std;
int ad_matrix[40001][40001];

void search(int ad_matrix[][40001], int **info, int no, int idx, int head, int N, int root){

	for(int i=1; i<= N; i++){
		if(ad_matrix[idx][i] == 1 && i != head && i != root){

			if(info[i][no] == 0 || info[i][no] > info[idx][no]+1){
				info[i][no] = info[idx][no]+1;
				//printf("%dth : %d\n",i,info[i][no]);
				search(ad_matrix, info, no, i, idx, N, root);
			}
			// else if(info[i][no] != 0)
			// 	printf("--- %dth out\n",i);
			// else if (info[i][no] <= info[idx][no]+1)
			// 	printf("*** %dth out\n",i);
		}

	}
}

int main(void){
	int p,q,r,N,M;
	cin >> p >>q >>r>>N>>M;

	// int* mat_distance = new int[N+1][3]{};
	int **mat_distance = new int*[N+1];
	for(int i = 0 ; i < N+1; i++)
		mat_distance[i] = new int[3];
	
	for(int i=0; i<M; i++){
		int node1, node2;
		cin >> node1 >> node2;
		ad_matrix[node1][node2] = 1;
		ad_matrix[node2][node1] = 1;
	}

	// for(int i=1; i <=N;i++)
	// 	printf("%dth : %d\n",i,mat_distance[i][0]);
	// printf("--------------------------------\n");
	search(ad_matrix, mat_distance, 0, N, N, N, N);
	search(ad_matrix, mat_distance, 1, 1, 1, N, 1);
	search(ad_matrix, mat_distance, 2, 2, 2, N, 2);

	int ans = mat_distance[1][0]*r + mat_distance[1][1]*p + mat_distance[1][2]*q;
	for(int i=2; i<=N; i++){
		if(ans > mat_distance[i][0]*r + mat_distance[i][1]*p + mat_distance[i][2]*q)
			ans = mat_distance[i][0]*r + mat_distance[i][1]*p + mat_distance[i][2]*q;
	}

	cout << ans << endl;




	//printf("--------------------------------\n");
	// for(int i=1; i <=N;i++)
	// 	printf("%dth : %d\n",i,mat_distance[i][0]);
}
