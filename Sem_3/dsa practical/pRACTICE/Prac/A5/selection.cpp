#include<iostream>
using namespace std;
int main(){
int arr[10]={1,2,5,6,9,8,7,21,54,45};
int mini,temp;

for(int i=0;i<10;i++)
{
    mini=i;
    for(int j=i;j<10;j++)
    {
        if(arr[j]<arr[mini])
        {
            mini=j;
        }
    }
temp=arr[mini];
arr[mini]=arr[i];
arr[i]=temp;

}
cout<<"The sorted array is";
for(int i=0;i<10;i++)
{
    cout<<" "<<arr[i];
}
return 0;
}
