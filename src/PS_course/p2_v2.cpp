#include <iostream>
using namespace std;

int main (void){
	int n,k;
	cin >> n >> k;

	int info[n][2];
	long min=10000000000, max=0;

	for(int i=0; i<n; i++){
		cin >> info[i][0] >> info[i][1];
		if(min> info[i][1])
			min = info[i][1];
		if(max < info[i][1])
			max = info[i][1];
		};


	int max_p=0;

	for(int d=min+k; d<max; d+=1){

		int num_p = 0;
		for(int t=0; t<n; t++){
			if(d-k <= info[t][1] && info[t][1] <= d+k)
				num_p += info[t][0];
		}

		if(max_p < num_p)
			max_p = num_p;
	}

	cout << max_p << "\n";


	return 0;

}
