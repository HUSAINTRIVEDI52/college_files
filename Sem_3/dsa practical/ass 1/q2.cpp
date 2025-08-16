// Write a program that will perform all the following array operations:
// • Sort the array
// • Reverse the array
// • Allocate the memory using new operator
#include<iostream>
#include<algorithm>
using namespace std;
int main(){
int SIZE=5;
int* arr=new int[SIZE];
for(int i=0;i<SIZE;i++)
{
    arr[i]=i+1;
}
// arr[SIZE]=new int;
// int arr[SIZE]={1,2,3,4,5};
// int n=sizeof(arr)/sizeof(arr[0]);
std::cout<<"Array before sorting:";
for(int i=0;i<SIZE;i++)
{
    std::cout<<arr[i]<<" ";
}
sort(arr,arr+SIZE);
 std::cout<<"Array after sorting: ";
for(int i=0;i<SIZE;i++)
{
  std::cout<<arr[i]<<" ";
}
 std::cout<<"aRRAY REVERSE";
 reverse(arr,arr+SIZE);
for(int i=0;i<SIZE;++i)
{
     std::cout<<arr[i]<<" ";
}
return 0;
}
