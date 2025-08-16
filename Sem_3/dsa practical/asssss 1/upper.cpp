#include<iostream>
using namespace std;
int main(){
int r,c;
cout<<"Enter the size of the row:";
cin>>r;

cout<<"Enter the size of the column: ";
cin>>c;

int arr[r][c];
cout<<"Enter the size of the array: ";

for(int i=0;i<r;i++)
{
    for(int j=0;j<c;j++)
    {
        cin>>arr[i][j];
    }
}
int mat=true;

for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
    {
        if(j>i && arr[i][j]!=0)
        {
            mat=false;
            break;
        }

    }
    if(mat=true)
    {
        cout<<"This is a upper trianglar matrix";
    }
    else{
        cout<<"This is  not a upper triangular matrix";
    }



return 0;
}
