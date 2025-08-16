// Write a program that will perform following operations on single dimension array:
// •Insert an element into an array•
//•Delete an element from an array•
//•Read an array elements•
///•Display the array elements••Search an array element

#include<iostream>
using namespace std;
int main(){
    int n=5;
int arr[n]={5,6,9,8,7};
cout<<"Enter the position to insert an element into the array:";
int ins,pos;
cin>>pos;
cout<<"Enter the value:";
cin>>ins;

for(int i=0;i<n;i++)
{
    arr[pos]=ins;
    n++;
}
// cout<<"Delete the element from the array:";
// int dlt;
// cin>>dlt;
// for(int i=dlt;i<n-1;++i)
// {
//     arr[i]=arr[i+1];
// }
// --n;    

// arr[n]=arr[dlt-1];

for(int i=0;i<n;i++)
{
    cout<<arr[i]<<" ";
}

cout<<"Enter the index you want to search:";
int ser;
cin>>ser;
cout<<"the search element is"<<arr[ser];

for(int i=0;i<n;i++)
{
    cout<<arr[i]<<" ";
}


return 0;
}
