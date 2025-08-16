#include<iostream>
using namespace std;
int main(){
int r,c;
cout<<"Enter the size of the row";
cin>>r;
cout<<"Enter the size of the column: ";
cin>>c;
cout<<"Enter the input of the array:";
int arr[r][c];

for(int i=0;i<r;i++)
{
    for(int j=0;j<c;j++)
    {
        cout<<"Enter the element";
        cout<<i<<j;
        cin>>arr[i][j];
    }
}

bool flag=true;

for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
    {
        if(j<i && arr[i][j]!=0)
        {
            flag=false;
            break;
        }
    }

if(flag==true)
{
    cout<<"This is a upper matrix\n";

}
else{
    cout<<"This is not a upper matrix\n";
}
return 0;
}
