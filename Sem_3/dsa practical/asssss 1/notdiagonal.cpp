#include<iostream>
using namespace std;
#define x 10
#define y 10
class fun{
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
 void diagonal()
 {
    int count=0;
    int sum=0;
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            if(i!=j)
            {
               cout<<arr[i][j]<<" ";
            }
            // cout<<endl;
        }
    }
    
 }
};
int main(){
fun f1;
f1.rc();
f1.input();
f1.diagonal();
return 0;
}
