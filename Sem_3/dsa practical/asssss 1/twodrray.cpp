#include<iostream>
using namespace std;
#define x 30
#define y 20
class fun
{
    private:
    int arr[x][y];
    int arr2[x][y];
    
    int r,c,r1,c2;
    public:
 void rc1()
 {
    cout<<"Enter the number of rows for arr1:";
    cin>>r;

    cout<<"Enter the number of columns for arr1:";
    cin>>c;
 }
 void input1()
 {
    cout<<"Enter the  elements of the array for arr1:";
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
//  public:
 void rc2()
 {
    cout<<"Enter the number of rows for arr2:";
    cin>>r1;

    cout<<"Enter the number of columns for arr2";
    cin>>c2;
 }
 void input2()
 {
    cout<<"Enter the  elements of the array:";
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            cout<<"Enter the element:";
            cout<<"["<<i<<"]["<<j<<"]";
            cin>>arr2[i][j];
        }
    }
 }
 void addition()
 {
    int sum=0;
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            sum=arr[i][j]+arr2[i][j];
        }
    }
    cout<<"The addition of both the array is\n"<<sum;
 }
 
 
void subtraction()
 {
    int sub=0;
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            sub-=arr[i][j]+arr2[i][j];
        }
    }
    cout<<"The subtraction  of both the array is\n"<<sub;
 }
void multiply()
 {
    int mul=1;
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            mul=arr[i][j]*arr2[i][j];
        }
    }
    cout<<"The multiplication of both the array is\n"<<mul;
 }
 void t1()
 {
    cout<<"The transpose of first matrix is\n";
    int sum=0;
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            cout<<arr[j][i]<<" ";
        }
        cout<<endl;
    }
    
 }
 void t2()
 {
    cout<<"The transpose of second matrix is\n";
    int sum=0;
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            cout<<arr2[j][i]<<" ";
        }
        cout<<endl;
    }
    
 }
 void addition1()
 {
     int sum=0;
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            sum+=arr[i][j];
        }
    }
cout<<"\n The sum of first matrix is"<<sum;
 }
 void addition2()
 {
     int sum=0;
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            sum+=arr2[i][j];
        }
    }
    cout<<"\n The sum of second matrix is:\n"<<sum;
 }
};
int main(){
    fun f1;
    f1.rc1();
    f1.input1();
    f1.rc2();
    f1.input2();
    f1.addition();
    f1.subtraction();
    f1.multiply();
    f1.t1();
    f1.t2();
f1.addition1();
f1.addition2();

return 0;
}
