#include <iostream>
using namespace std;
#define MAX_VTXS 2001  
int matrix[MAX_VTXS][MAX_VTXS];

void search(int idx, int n, bool check[],int k) {
    int count = 0;
    for (int i=1; i<= n; i++) {
        if(matrix[idx][i] == 1 && check[i] == true)
            count += 1;
    }

    if(count < k){
        check[idx] = false;
        for (int i=1; i<= n; i++) {
            if(matrix[idx][i] == 1 && check[i] == true)
                search(i,n, check, k);
        }
    }
}

int main(){ 

    int n, k ,f;
    cin >> n >> k >> f;

    for(int i=0; i<f; i++){
        int temp1, temp2;
        std::cin >> temp1 >> temp2;

        matrix[temp1][temp2] = 1;
        matrix[temp2][temp1] = 1;
    }

    bool check[n+1];
    for(int x=1; x<=n; x++){
        int count=0;
        for(int y=1; y<=n; y++){
            if(matrix[x][y]==1)
                count+=1;
        }

        if(count >= k)
            check[x] = true;
        else
            check[x] = false;
    }

    for(int x=1; x<=n; x++)
        if(check[x] == true)
            search(x, n, check, k);

    int ans =0;
    for(int x=1; x<=n; x++){
        if(check[x] == true)
            ans += 1;
    }

    cout << ans << "\n";
    return 0;
}

