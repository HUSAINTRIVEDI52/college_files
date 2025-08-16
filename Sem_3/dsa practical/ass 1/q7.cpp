// Write a program to convert matrix into diagonal, lower tringular and upper tringular matri

#include<iostream>
using namespace std;
int main(){
    int ar[3][3],i,j,flag=0;
for(i=0;i<3;i++)
{
    for(j=0;j<3;j++)
    {
        cin>>ar[i][j];
    }
}

for(i=0;i<3;i++)
{
    for(j=0;j<3;j++)
    {
        cout<<ar[i][j]<<" ";
    }
}
for(i=0;i<3;i++)
for(j=0;j<3;j++)
{
    if(i==j)
    {
        i=0;j=0;
    }
}
return 0;
}
