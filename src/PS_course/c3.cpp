#include <iostream>
#include <queue>
using namespace std;
int mat_distance[40001][3];

void search(vector<int> ad_list[], int *isVisited, int N, int no, int root){
	queue<int> q;
	q.push(root);
	isVisited[root] = 1;

	while(!q.empty()){
		int key = q.front();

		for(int i=0; i< ad_list[key].size(); i++){
			if(isVisited[ad_list[key][i]] == 0){
				isVisited[ad_list[key][i]] = 1;
				mat_distance[ad_list[key][i]][no] = mat_distance[key][no]+1;
				q.push(ad_list[key][i]);
			}
		}
		q.pop();
	}
}

int main(void){
	int p,q,r,N,M;
	scanf("%d %d %d %d %d", &p, &q, &r, &N, &M);
	vector<int> ad_list[N+1];
	
	for(int i=0; i<M; i++){
		int node1, node2;
		scanf("%d %d", &node1, &node2);
		ad_list[node1].push_back(node2);
      	ad_list[node2].push_back(node1);
	}

	int roots[3] = {N,1,2};
	for(int i=0; i <3; i++){
		int *isVisited = new int[N+1];
		search(ad_list, isVisited, N, i, roots[i]);
		
	}
	
	int ans = mat_distance[1][0]*r + mat_distance[1][1]*p + mat_distance[1][2]*q;
	for(int i=2; i<=N; i++){
		if(ans > mat_distance[i][0]*r + mat_distance[i][1]*p + mat_distance[i][2]*q)
			ans = mat_distance[i][0]*r + mat_distance[i][1]*p + mat_distance[i][2]*q;
	}

	cout << ans << endl;
}