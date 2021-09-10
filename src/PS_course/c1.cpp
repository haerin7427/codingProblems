#include <iostream>
#include <vector>
using namespace std;
vector<int> g[2001];

void search(int n, bool check[],int k) {
    int count = 0;
    for (int i=0; (unsigned int)i< g[n].size(); i++) {
        if(check[g[n][i]] == true)
            count += 1;
    }

    if(count < k){
        check[n] = false;
        for (int i=0; (unsigned int)i< g[n].size(); i++) {
            if(check[g[n][i]] == true)
                search(g[n][i], check, k);
        }
    }
}

int main(){

    int n, k ,f;
    std::cin >> n >> k >> f;

    for(int i=0; i<f; i++){
        int temp1, temp2;
        std::cin >> temp1 >> temp2;

        g[temp1].push_back(temp2);
        g[temp2].push_back(temp1);
    }

    bool check[n+1];
    for(int i=1; i<=n; i++){
        if(g[i].size() >= (unsigned int)k)
            check[i] = true;
        else
            check[i] = false;
    }

    for(int x=1; x<=n; x++)
        if(check[x] == true)
            search(x, check, k);

    int ans =0;
    for(int x=1; x<=n; x++){
        if(check[x] == true)
            ans += 1;
    }

    cout << ans << "\n";
    return 0;
}

