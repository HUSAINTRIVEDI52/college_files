#include<iostream>
using namespace std;
int main()
{
    int size1=3;
    int size2=3;
int* arr1=new int[size1];
cout<<"Enter the elmeents of the firsrt array:";
for(int i=0;i<size1;i++)
{
    cin>>arr1[i];
}
int* arr2=new int[size2];
cout<<"Enter the elements of the secondd array";
for(int i=0;i<size2;i++)
{
    cin>>arr2[i];
}
int size3=size1+size2;
int* arr3=new int[size3];

for(int i=0;i<size1;i++)
{
        arr3[i]=arr1[i];
}
for(int i=0;i<size2;i++)
{
    arr3[size1+i]=arr2[i];
}
cout<<"Tje ipdated array is::";
for(int i=0;i<size3;++i)
{
    cout<<arr3[i]<<" ";
}
delete[] arr1;
delete[] arr2;
delete[] arr3;
return 0;
}
