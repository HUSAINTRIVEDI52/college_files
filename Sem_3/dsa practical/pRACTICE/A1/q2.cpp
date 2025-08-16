// Write a program that will perform all the following array operations:
// •Sort the array
// •Reverse the array
// •Allocate the memory using new operator

#include<iostream>
#include<algorithm>
using namespace std;
int main(){
    int size=20;
int* arr=new int[size];

cout<<"Enter the SIZE pf the array";
cin>>size;

cout<<"Enter the elements of the array: ";
for(int i=0;i<size;i++)
{
    cin>>arr[i];
}
cout<<"Array beforre sorting:";
for(int i=0;i<size;i++)
{
    cout<<arr[i]<<" "<<endl;
}
sort(arr,arr+size);
cout<<"Array after sorting:";
for(int i=0;i<size;i++)
{
    cout<<arr[i]<<" "<<endl;
}

reverse(arr,arr+size);
cout<<"Reversing the array:";
for(int i=0;i<size;i++)
{
    cout<<arr[i]<<" "<<endl;
}
return 0;
}
