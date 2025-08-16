#include<iostream>
using namespace std;
int main(){
    
int arr[3][3];
cout<<"Enter the elements of the array:";
for(int i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
    {
        cin>>arr[i][j];
    }
}
for(int i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
    {
        cout<<arr[i][j]<<" "<<endl;
    }
}

cout<<"Results:";
int zeroes=0;
int nonzeroes=0;

for(int i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
    {
        if(arr[i][j]==0)
        {
            zeroes++;
        }
        else{
            nonzeroes++;
        }
    }
}
if(zeroes>nonzeroes)
{
    cout<<"This is a sparsh matrix";
    sparshconversion(nonzeroes);
}
else{
    cout<<"This is not  a sparsh matrix";
}

int sparshconversion(int n)
{
int k=1;
int spar[n+1][3];
spar[0][1]=r;
spar[0][2]=c;
spar[0][3]=n;

for(int i=0;i<r;i++)
{
    for(int j=0;j<c;j++)
    {
        if(arr[i][j]!=0)
        {
            spar[k][0]=r;
            spar[k][1]=c;
            spar[k][2]=arr[i][j];
            k++;
        }
    }
}

cout<<"The converrted matrix is: ";
for(int i=0;i<k;i++)
{
    for(int j=0;j<3;j++)
    {
        cout<<spar[i][j]<<" "<<endl;
    }
}

}

}
