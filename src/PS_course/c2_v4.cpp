#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
#define MAX_VTXS 500  
int matrix[MAX_VTXS][MAX_VTXS];
bool check_board[MAX_VTXS][MAX_VTXS] ={false};

int search (int start_num, int row, int col, int n){

    bool last = true;
    int end[4];

    if(row>0 && matrix[row][col] > matrix[row-1][col] && check_board[row-1][col] == false){
        last = false;
        check_board[row-1][col] = true;
        end[0] = search (start_num, row-1,col,n);
    }else
        end[0] = matrix[row][col];

    if(row<n-1 && matrix[row][col] > matrix[row+1][col] && check_board[row+1][col] == false){
        last = false;
        check_board[row+1][col] = true;
        end[1] = search (start_num, row+1,col,n);
    }else
        end[1] = matrix[row][col];

    if(col>0 && matrix[row][col] > matrix[row][col-1] && check_board[row][col-1] == false){
        last = false;
        check_board[row][col-1] = true;
        end[2] = search (start_num, row,col-1,n);
    }else
        end[2] = matrix[row][col];

    if(col<n-1 && matrix[row][col] > matrix[row][col+1] && check_board[row][col+1] == false){
        last = false;
        check_board[row][col+1] = true;
        end[3] = search (start_num, row,col+1,n);
    }else 
        end[3] = matrix[row][col];

    if(last == true)
        return matrix[row][col];
    else{
        int min= end[0];
        for(int i=1; i<4; i++){
            if(min > end[i])
                min = end[i];
        }
        return min;
    }
}

void swap(int high_array[][3], int ptr, int min){
    for(int i=0; i<3; i++){
        int temp = high_array[ptr][i];
        high_array[ptr][i] = high_array[min][i];
        high_array[min][i] = temp;
    }
}

void insert_sort(int high_array[][3], int len){

    for(int i=1; i<len; i++){
        int key = high_array[i][0], j = i-1;
        while(j>=0&& key<high_array[j][0]){
           swap(high_array,j,j+1); 
           j-=1;
        }
    }
}


void select_sort(int high_array[][3], int len){

    for(int i=0; i<len-1; i++){
        int min = i;
        for(int k=i+1; k<len;k++){
            if(high_array[min][0] > high_array[k][0])
                min = k;
        }
        swap(high_array,i,min);
    }

}

void quickSort(int quick[][3], int i, int j)
{
	if(i>=j) return;
	int pivot = quick[(i+j)/2][0];
	int left = i;
	int right = j;
	
	while(left<=right)
	{
		while(quick[left][0]<pivot) left++;
		while(quick[right][0]>pivot) right--;
		if(left<=right)
		{
			swap(quick, left,right);
			left++; right--;
		}
	}
	quickSort(quick, i,right);
	quickSort(quick, left,j);
}

int main() {

    int n;
    scanf("%d",&n);

    int sort_high[n*n][3];
    int idx=0;
    for(int row=0; row<n; row++){
        for(int col=0; col<n; col++){
            cin >> matrix[row][col];
            sort_high[idx][0] = matrix[row][col];
            sort_high[idx][1] = row;
            sort_high[idx][2] = col;
            idx+=1;
        }
    }

    quickSort(sort_high,0,n*n-1);
 

    int max =0;
    for (int i = n*n-1; i > -1; i--) {
        if(check_board[sort_high[i][1]][sort_high[i][2]] == false){
            check_board[sort_high[i][1]][sort_high[i][2]] = true;
            int min = search(matrix[sort_high[i][1]][sort_high[i][2]],sort_high[i][1],sort_high[i][2],n);
            if(max < matrix[sort_high[i][1]][sort_high[i][2]] - min)
                max = matrix[sort_high[i][1]][sort_high[i][2]] - min;
        }
    } 

    printf("%d\n",max);
    return 0;
}