  /*  */   // Write a program that will perform following operations on single dimension array:
// • Insert an element into an array •
// • Delete an element from an array •
// • Read an array elements •
// • Display the array elements •
// • Search an array element  /*

#include<iostream>
using namespace std;
int main(){
    //insertion;
int size=5;
int arr[size];
int position;
int insert;
cout<<"Enter the elements of the array: ";
for(int i=0;i<size;i++)
{
    cout<<"Enter the "<<i<<"ELements:";
    cin>>arr[i];
}
cout<<"enter the element you want to insert:";
cin>>insert;

cout<<"Enter the position you want to insert in the array:";
cin>>position;

if(position<size && position>=0)
{

for(int i=size;i>position;i--)
{
    arr[i]=arr[i-1];
}
arr[position]=insert;
 ++size;
}
else{
    cout<<"Invalid";
    
}
for(int i=0;i<size;i++)
{
    cout<<arr[i]<<" "<<endl;
}
//deletion
int search;
int dltpos;
cout<<"Enter the position you want to delete:";
cin>>dltpos;
if(dltpos<size & dltpos>=0)
{

for(int i=dltpos;i<size-1;++i)
{
    arr[i]=arr[i+1];
}
--size;
}
else
{
    cout<<"Invalid";
}
for(int i=0;i<size;i++)
{
    cout<<arr[i]<<endl;
}
arr[size]=arr[dltpos-1];
//search
cout<<"Enter the index nmber(starting from 0) for the searching of element 0 to"<<size<<endl;
cin>>search;
cout<<arr[search];
return 0;
}
