#include<iostream>
#include<algorithm>
using namespace std;
int main(){
    int size=100;
int* arr=new int[size];

cout<<"Enter the size of the array:";
cin>>size;
// cout<<"Enter the size of the array";

for(int i=0;i<size;i++)
{
    cin>>arr[i];
}

cout<<"The array before the sorting is";
for(int i=0;i<size;i++)
{
    cout<<arr[i]<<" ";
}
sort(arr,arr+size);
cout<<"The array after sorting is:";
for(int i=0;i<size;i++)
{
    cout<<arr[i]<<" ";
}
cout<<"The array after reversing the element is:";
reverse(arr,arr+size);
for(int i=0;i<size;i++)
{
    cout<<arr[i]<<" ";
}

return 0;
}
