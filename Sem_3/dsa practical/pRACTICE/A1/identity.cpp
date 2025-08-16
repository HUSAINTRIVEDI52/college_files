#include<iostream>
using namespace std;
int main(){
int arr[3][3];
cout<<"Enter the elements of the qarray:";
for(int i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
    {
        cout<<"Enter the element"<<"["<<i<<"]["<<j<<"]";
        cin>>arr[i][j];
    }
}
cout<<"The elements of the array are:";
for(int i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
    {
        cout<<arr[i][j]<<" ";
    }
    cout<<endl;
}
int flag=0;
for(int i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
    {
     if(i==j)
     {
        if(arr[i][j]==1)
        {
            flag=1;
        }
        else if(arr[i][j]==0)
        {
            flag=2;

        }
        else{
            flag=3;
        }
     }

}
}
if(flag==1)
{
    cout<<"This is an identity matrix"<<endl;
}
else if(flag==2 || flag==3)
{
    cout<<"This is not a identity matrix";
}

return 0;
}
