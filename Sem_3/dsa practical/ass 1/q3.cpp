//Write a program to check matrix is a sparse matrix or not.

#include<iostream>
using namespace std;
int main(){
int arr[3][3];
int c=0;
cout<<"Enter the element of the array";
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
cout<<"Results:";
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            if(arr[i][j]==0)
            {
                c++;
            }
        }
    }
    if(c>=3*3/2)
    {
        cout<<"This is a sparsh matrix";
    }
    else{
        cout<<"this is not a sparsh matrix";
    }


return 0;
}
