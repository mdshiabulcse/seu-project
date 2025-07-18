#include <iostream>
using namespace std;
void printArray(int arr[], int n){
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}
int main(){

    int A[]={1,2,3,4,5};
    int B[5];
    B[0]=1;
    B[1]=2;
    B[2]=3;
    B[3]=4;
    B[4]=5;

//    cout<<A[3]<<endl;
//    cout<<B[3]<<endl;
    printArray(A,5);
    printArray(B,5);

    return 0;
}
