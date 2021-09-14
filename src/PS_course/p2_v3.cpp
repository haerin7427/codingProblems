#include <iostream>
int city[10000000000];
int main (void){
	int n,k;
	scanf("%d %d",&n,&k);

	int info[n][2];
	for(int i=0; i<n; i++){
		scanf("%d %d",&info[i][0],&info[i][1]);
		city[info[i][1]] = info[i][0];
	}

	int max_p=0;
	for(int d=0; d<n; d+=1){
		//printf("d: %d (%d)\n",d, info[d][1]-k);
		int num_p = 0;
		
		for(int t= info[d][1]; t<=info[d][1]+2*k; t++){
			num_p += city[t];
			//printf("nump %d\n",num_p);
			}

		if(max_p < num_p)
			max_p = num_p;
	}

	printf("%d\n",max_p);
	return 0;

}
