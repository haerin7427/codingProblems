#include <iostream>
#include <queue>
using namespace std;
int mat_distance[40001][3];

// void search(int **ad_matrix, int mat_distance[][3], int *isVisited, int N, int no, int root){
void search(int **ad_matrix, int *isVisited, int N, int no, int root){
	queue<int> q;
	q.push(root);
	isVisited[root] = 1;

	while(!q.empty()){
		int key = q.front();

		for(int i=1; i<= N; i++){
			if(ad_matrix[key][i] == 1 && isVisited[i] == 0){
				isVisited[i] = 1;
				mat_distance[i][no] = mat_distance[key][no]+1;
				q.push(i);
			}
		}
		q.pop();
	}
}

int main(void){
	int p,q,r,N,M;
	scanf("%d %d %d %d %d", &p, &q, &r, &N, &M);
	
	int **ad_matrix = new int*[N+1];
	for(int i = 0 ; i < N+1; i++)
		ad_matrix[i] = new int[N+1];

	// int **mat_distance = new int*[N+1];
	// for(int i = 0 ; i < N+1; i++)
	// 	mat_distance[i] = new int[3];
	
	for(int i=0; i<M; i++){
		int node1, node2;
		scanf("%d %d", &node1, &node2);
		ad_matrix[node1][node2] = 1;
		ad_matrix[node2][node1] = 1;
	}

	int roots[3] = {N,1,2};
	for(int i=0; i <3; i++){
		int *isVisited = new int[N+1];
		// search(ad_matrix, mat_distance, isVisited, N, i, roots[i]);
		search(ad_matrix, isVisited, N, i, roots[i]);
		
	}
	
	int ans = mat_distance[1][0]*r + mat_distance[1][1]*p + mat_distance[1][2]*q;
	for(int i=2; i<=N; i++){
		if(ans > mat_distance[i][0]*r + mat_distance[i][1]*p + mat_distance[i][2]*q)
			ans = mat_distance[i][0]*r + mat_distance[i][1]*p + mat_distance[i][2]*q;
	}

	for (int i = 0; i < N+1; i++) { 
		delete ad_matrix[i]; 
	} delete ad_matrix;


	cout << ans << endl;
}