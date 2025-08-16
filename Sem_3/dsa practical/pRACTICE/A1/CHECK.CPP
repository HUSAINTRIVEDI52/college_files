#include<iostream>
using namespace std;
int main(){
int arr[3][3];
cout<<"Enter the elements of the array:";
for(int i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
    {
        cout<<"Enter the "<<"["<<i<<"]["<<j<<"] element";
        cin>>arr[i][j];
    }
}
int flag=0;
for(int i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
    {
        if(i<j && arr[i][j]!=0)
        {
            flag=1;
            
        }
        if(i>j && arr[i][j]!=0)
        {
            flag=2;
            
        }
        
    }
}
if(flag==1)
{
    cout<<"this is upper triangular matrix";

}else if (flag==2){
    cout<<"This is a lower triangular matrix";
}
else{
    cout<<"Invalid";
}

return 0;
}