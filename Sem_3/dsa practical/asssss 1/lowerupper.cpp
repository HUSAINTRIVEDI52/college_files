#include<iostream>
using namespace std;
#define x 10
#define y 10
class fun
{
 private:
 int arr[x][y];
 int r,c;
 public:
 void rc()
 {
    cout<<"Enter the number of rows:";
    cin>>r;

    cout<<"Enter the number of columns:";
    cin>>c;
 }
 void input()
 {
    cout<<"Enter the  elements of the array:";
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            cout<<"Enter the element:";
            cout<<"["<<i<<"]["<<j<<"]";
            cin>>arr[i][j];
        }
    }
 }
 void upper()
 {
    int flag=0;
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            if(i>j && arr[i][j]==0)
            {
                flag=1;
            }
        }
    }
    if(flag==0)
    {
        cout<<"This is not  a upper triangular matrix\n";
    }
    else if (flag=11){
        cout<<"This is a upper triangular matrix\n";
    }
 }
 void lower()
 {
    int flag=1;
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            if(i<j && arr[i][j]==0)
            {
                flag=0;
            }
        }
    }
    if(flag==1)
    {
        cout<<"This is not  a lower triangular matrix\n";
    }
    else if(flag==0){
        cout<<"This is a lower triangular matrix\n";
    }
 }
};
int main(){
fun f1;
f1.rc();
f1.input();
f1.lower();
f1.upper();
return 0;
}
