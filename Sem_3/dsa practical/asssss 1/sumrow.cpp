#include<iostream>
using namespace std;
int main(){
int arr[3][3];
int n[3][4];
int i,j,sum=0;

for(i=0;i<3;i++)
{
    for(j=0;j<3;j++)
    {
        cin>>arr[i][j];
    }
}
for(i=0;i<3;i++)
{
    for(j=0;j<3;j++)
    {
        cout<<arr[i][j]<<" ";
    }
    cout<<endl;
}
for( i=0;i<3;i++)
{
    int sum=0;
    for(j=0;j<3;j++)
    {
         n[i][j]=arr[i][j];
         sum=sum+arr[i][j];
    }
n[i][j]=sum;
}
for(int i=0;i<3;i++)
{
    for(int j=0;j<4;j++)
    {
        cout<<n[i][j]<<" ";
    }
    cout<<endl;
}
return 0;
}
