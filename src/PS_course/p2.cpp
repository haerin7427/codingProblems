#include <iostream>
using namespace std;

int main (void){
	int n,k;
	cin >> n >> k;

	int info[n][2];
	
	for(int i=0; i<n; i++)
		cin >> info[i][0] >> info[i][1];


	int max_p=0;
	for(int d=0; d<n; d+=1){

		int num_p = 0;
		for(int t=0; t<n; t++){
			if(info[d][1]<= info[t][1] && info[t][1] <= info[d][1]+2*k)
				num_p += info[t][0];
		}

		if(max_p < num_p)
			max_p = num_p;
	}

	printf("%d\n",max_p);

	return 0;

}
