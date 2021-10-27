#include <iostream>
using namespace std;
#define MAX_VTXS 257400

int find (int num[MAX_VTXS], int m,  int size){
	int left=0, right= size-1;
	int count=0;
	while(left <= right){
		if(num[left]+num[right]>m){
			right--;
		}else{
			left++;
			right--;
		}
		count++;
	}
	return count;
	//
}

void quickSort(int quick[MAX_VTXS], int i, int j)
{
	if(i>=j) return;
	int pivot = quick[(i+j)/2];
	int left = i;
	int right = j;
	
	while(left<=right)
	{
		while(quick[left]<pivot) left++;
		while(quick[right]>pivot) right--;
		if(left<=right)
		{
			int temp = quick[left];
			quick[left] = quick[right];
			quick[right] = temp;
			left++; right--;
		}
	}
	quickSort(quick, i,right);
	quickSort(quick, left,j);
}

int main (void){
	int m;
	cin >> m;

	int n[MAX_VTXS];
	int count=0;

	while (cin >> n[count]) 
		count++;

	quickSort(n,0,count-1);
	cout << find(n, m, count) << endl;
}
