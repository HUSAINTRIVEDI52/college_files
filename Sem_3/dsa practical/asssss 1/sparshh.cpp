#include<iostream>
using namespace std;
#define x 10
#define y 10
class sp
{
 private:
 int arr[x][y];
 int r,c;
 public:
 int get()
 {
    cout<<"Enter the size of the row";
    cin>>r;

    cout<<"Enter the size of the column";
    cin>>c;
 }
 void input()
 {
    // int arr[r][c];

    cout<<"Enter the elements of the array: "<<endl;
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            cout<<"Enter the element";
            cout<<i<<j;
            cin>>arr[i][j];
        }
    }
 }
 void checksparsh()
 {
    int zeroes=0;int nonzeroes=0;
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
    {
        if(arr[i][j]==0)
        {
            zeroes++;
        }
        else{
            nonzeroes++;
            // convertmatrix(nonzeroes);
        }
    }
    }
    //    cout<<zeroes<<endl;
    //    cout<<nonzeroes<<endl;

    if(zeroes>nonzeroes)
    {
        cout<<"This is a sparsh matrix";
        convertmatrix(nonzeroes);
    }
    else{
        cout<<"This is not a sparsh matrix";
    }
    
 

 }
 void convertmatrix(int n)
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
            if (arr[i][j]!=0)
            {
               spar[k][0]=i;
               spar[k][1]=j;
               spar[k][2]=arr[i][j];
               k++;
            }
        }
    }
    cout<<"The converted matrix is";

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
int main(){

sp s1;
s1.get();
s1.input();
s1.checksparsh();
// s1.convertmatrix();
return 0;
}