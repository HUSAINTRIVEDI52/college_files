#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
    int size;
    cout<<"Enter the size of the array";
    cin>>size;

    int* arr=new int[size];
    cout<<"Enter the elements of the array:";

    for(int i=0;i<size;i++)
    {
        cin>>arr[i];
    }
    reverse(arr,arr+size);
    cout<<"Array after reversing the element";
    for(int i=0;i<size;i++)
    {
          cout<<arr[i]<<" ";
    }
    sort(arr,arr+size);
    cout<<"Array after sorting the element";
    for(int i=0;i<size;i++)
    {
       cout<< arr[i]<<" ";
    }




}