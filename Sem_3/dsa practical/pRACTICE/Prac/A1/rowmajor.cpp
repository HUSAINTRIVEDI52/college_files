#include<iostream>
using namespace std;
void row(int arr[4][4],int a[16])
{
    int l=0;
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<4;j++)
        {
            a[l]=arr[i][j];
            l++;
        }
    }

}
int main(){
int arr[4][4]={{1,2,3,4},
{5,6,9,8},
{2,6,9,8},
{6,5,8,9}};
int ab[16];
row(arr,ab);
cout<<"the row major is";
for(int i=0;i<16;i++)
{
    cout<<ab[i]<<" ";

}
return 0;
}
