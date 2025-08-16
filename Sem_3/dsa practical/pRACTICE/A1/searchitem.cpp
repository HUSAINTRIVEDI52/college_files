// Write an algorithm to search for given ITEM in a given array X[n] using linear search 
// technique. If the ITEM is found, move it at the top of the array. If the ITEM is not found, 
// insert it at the end of the array



#include<iostream>
using namespace std;
int main(){
int arr[3];
int n=3;
int search;
cout<<"Entetr the elements of the array:";
for(int i=0;i<3;i++)
{
    cout<<"Enter the ["<<i<<"] element";
    cin>>arr[i];
}
cout<<"Enter the element you want to search in the array:";
cin>>search;

int pos=-1;
for(int i=0;i<3;i++)
{
    if(arr[i]==search)
    {

    pos==i;
    break;  
    }
}
if(pos!=-1)
{
    for(int i=pos;i>0;i--)
    {arr[i]=arr[i-1];
    }
    arr[0]=search;
    cout<<"item found and moved to the top of the array";
}
else{
    if(n<3)
    {
        arr[n]=search;
        n++;
    }
    else{
        arr[n-1]=search;
    }
    cout<<"Item not found and moved on the top";
}
cout<<"Updated array:";
for(int i=0;i<3;i++)
{
    cout<<arr[i];
}

return 0;
}
