// Write a program that will perform following operations on single dimension array:
// •Insert an element into an array•
//•Delete an element from an array•
//•Read an array elements•
//•Display the array elements•//
//•Search an array elemen

#include<iostream>
using namespace std;
int main(){
int size;
cout<<"Enter the size of the array:";
cin>>size;
int arr[size];


for(int i=0;i<size;i++)
{
    cin>>arr[i];
}

int insert;
int posin;
cout<<"Enter the position you want to insert the element";
cin>>posin;
cout<<"Enter the element you want to insert in the array";
cin>>insert;
if(posin>0 && posin<=size)
{

for(int i=posin;i>size;i--)
{

    arr[i]=arr[i-1];
}
arr[posin]=insert;
++size;

}
else{
    cout<<"You have entered an invalid statement";
}

// deletion;
cout<<"Enter the element you want to delete from the array:";
int dlt;
cin>>dlt;
if(dlt<=size && size>=0)
{

for(int i=dlt;i<size-1;i++)
{
    arr[i]=arr[i+1];
}
--size;   

}
else{
    cout<<"You have entered an invalid statement";
}
// search for the array;
int search;
cout<<"Enter the index number for the element you want to search in the array";
cin>>search;
if(search>0 && search<=size)
{
    cout<<"The searched element is";
   cout<<arr[search];
}
cout<<"The entered array is: ";
for(int i=0;i<size;i++)
{
    cout<<arr[i]<<" ";
}


return 0;
}
