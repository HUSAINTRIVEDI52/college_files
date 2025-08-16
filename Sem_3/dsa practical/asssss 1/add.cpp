#include<iostream>
using namespace std;
int main(){
int arr[5]={1,2,3,4,5};
int brr[5]={1,2,3,4,5};
int sum=0;
for(int i=0;i<5;i++)
{
    sum+=arr[i];
}
for(int i=0;i<5;i++)
{
    sum+=brr[i];
}
cout<<"The sum of both the array is"<<sum;
return 0;
}
