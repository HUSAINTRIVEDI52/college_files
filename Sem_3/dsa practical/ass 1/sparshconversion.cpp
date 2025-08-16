#include<iostream>
using namespace std;
#define x 10
#define y 10
class sparsh
{
 
 int r,c;
 int arr[x][y];
 public:
 void rows()
 {
    cout<<"Enter the number of the rows: ";
    cin>>r;
    cout<<"Enter the number of column: ";
    cin>>c;

 }
 int input()
{
    cout<<"Enter the input of the array:";
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            cout<<"Enter the srray of";
            cout<<arr[r][c];
            cin>>arr[i][j];
        }
    }
}
int sparshcheck()
{
    int zero=0;
    int nonzero=0;
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            if(arr[i][j]==0)
            {
                // cout<<"This is a sparsh matrix";
                zero++;
            }
            else
            {
                // cout<<"This is not a sparsh matrix";
                nonzero++;
            }
        }
    }

    if(zero>nonzero)
    {
        cout<<"This is a sparsh matrix"<<endl;
                sparshconversion(nonzero);
    }
    else{
        cout<<"This is not a sparsh matrix"<<endl;
    }
}
void sparshconversion(int n)
{
    int k=1;
    int spar[n+1][3];
     spar[0][0]=r;
     spar[0][1]=c;
     spar[0][2]=n;
for(int i=0;i<r;i++)
{
    for(int j=0;j<c;j++)
    {
        if(arr[i][j]!=0)
        {

        spar[k][0]=i;
        spar[k][1]=j;
        spar[k][2]=arr[i][j];
        k++;
        }
    }
}

cout<<"The converted matrix is :"<<endl;

for(int i=0;i<k;i++)
{
    for(int j=0;j<3;j++)
    {
        cout<<spar[i][j]<<" ";
    }
    cout<<endl;
}
}


};
int main()
{
sparsh s1;
s1.rows();
s1.input();
s1.sparshcheck();
// s1.sparshconversion();

}