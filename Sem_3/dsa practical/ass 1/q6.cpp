// 5. Write a program to find sum and average of diagonal elements.
#include<iostream>
using namespace std;
int main(){
    int arr[3][3],sum=0;
    cout<<"Enter the array elements";
for(int i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
    {
        cin>>arr[i][j];
    }
}

for(int i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
    {
        cout<<arr[i][j]<<" ";
    }
    cout<<endl;
}
for(int i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
    {
        if(i==j)
        {
            sum+=arr[i][j];
        }
    }
}
cout<<"The sum of diagonal elements is"<<sum;

return 0;
}
