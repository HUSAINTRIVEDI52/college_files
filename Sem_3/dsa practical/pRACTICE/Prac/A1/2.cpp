#include<iostream>
using namespace std;
int main(){
cout<<"Enter the Array element:";
int arr[3][3];
for(int i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
    {
        cout<<"Enter the ["<<i<<"]["<<j<<"]"<<" element";
        cin>>arr[i][j];
    }
}
int zero=0,nonzero=0;
for(int i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
    {
       if(i==j)
       {
        zero++;
       }
       else{
        nonzero++;
       }
    }
}

if(zero>nonzero)
{
    cout<<"This is a sparsh matrix"<<endl;
    int k=1;
    int spar[nonzero+1][3];
    int spar[]






}
else{
    cout<<"This is not a sparsh matrix";
}


return 0;
}
