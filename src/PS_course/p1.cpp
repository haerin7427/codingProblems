#include <iostream>
#include <cmath>
int main (void){
    int num=0;
    std::cin >> num;

    int count=0;
    for(int i=4; i <num; i *= 10)
        count+=1;

    int num_four =0; int temp = num;
    for(int i=0; i < count; i++){
        int max = temp;
        temp /= 10;

        if(temp*10 + 4  > max)
            num_four += (temp * pow(9,i));
        else
            num_four += ((temp+1)*pow(9,i));
    }

    std::cout << num - num_four << "\n";
    return 0;

}