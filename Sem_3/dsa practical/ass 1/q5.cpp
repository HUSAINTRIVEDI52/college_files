// Write a program to check whether the matrix is Lower tringular matrix or Upper tringular
// matrix. 

#include<iostream>
using namespace std;
int main(){
int arr[3][3],i,j,flag=0;
cout<<"Enter the array elements:";
for( i=0;i<3;i++)
{
    for( j=0;j<3;j++)
    {

        cin>>arr[i][j];
    }
}
for( i=0;i<3;i++)
{
    for( j=0;j<3;j++)
    {

        cout<<arr[i][j];
    }
    cout<<endl;
for(i=0;i<3;i++)
for(j=0;j<3;j++)
{
    if(i>j && arr[i][j]!=0)
    {
        flag=1;
        break;
    }
}

if(flag==1) 
{
    cout<<"no";
}
else{
    cout<<"yes";
}

//  flag=1;?
// }
// if(flag=1)
// {
//  cout<<"This is a not a upper triangular matrix";
// }
// else{
//     cout<<"This is a upper triangular matrix";
// }
return 0;
}
}
