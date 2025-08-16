#include<iostream>
using namespace std;
class fun
{
    private:
    int arr[3][3];
    int i,j,k=0;
    int ar[9];
public:
void input()
{
    cout<<"Enter the elements of the array:";
    
    for(  i=0;i<3;i++)
    {
        for( j=0;j<3;j++)
        {
            cin>>arr[i][j];
        }
        
    }

}
void out()
{
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            cout<<arr[i][j];
        }
        cout<<endl;
    
    for(  i=0;i<3;i++)
    {
        for( j=0;j<3;j++)
        {
          ar[k]=arr[i][j];
          k++;
        }
        
    }
    for( k=0;k<9;k++)
    {
        cout<<ar[k]<<" ";
    }
}
}

};
int main(){
fun f1;
f1.input();
f1.out();
return 0;
}
