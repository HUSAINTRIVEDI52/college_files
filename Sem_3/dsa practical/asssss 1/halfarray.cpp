// Take a two dimensional array A, with N rows and N columns as argument and point the 
// upper half of the arra

#include<iostream>
using namespace std;

int main(){
int arr[5][5];
for(int i=0;i<5;i++)
{
    for(int j=0;j<5;j++)
    {
        cin>>arr[i][j];
        cout<<"\t";
    }
    cout<<endl;
}
for(int i=0;i<5;i++)
{
    for(int j=0;j<5;j++)
    {
        cout<<arr[i][j]<<" ";
    }
    cout<<endl;
}
for(int i=0;i<5;i++)
{
    for(int j=0;j<5;j++){
        if(i==j||i<j){
            cout<<arr[i][j];
        }
        else{
            cout<<" ";
        }

    }
    cout<<endl;
}

return 0;
}
