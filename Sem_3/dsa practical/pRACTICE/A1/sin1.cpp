#include<iostream>
using namespace std;
int main(){
int size=5;
int arr[size];
int position;
int insert;
cout<<"Enter the elements of the array:";
for(int i=0;i<5;i++)
{
    cout<<"Enter the "<<i<<" Elements";
    cin>>arr[i];
}
cout<<"Enter the element you want to insert into the array:";
cin>>insert;

cout<<"Enter the position you want to insert into the array:";
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
//delete
int deletep;
cout<<"Enter the position you want to delete ";
cin>>deletep;
if(deletep<size && deletep>=0)
{
    for(int i=deletep;i<size-1;++i)
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
    cout<<arr[i]<<" "<<endl;
}
int search;

cout<<"Enter the index number you want to search in the array starting from zero to "<<size<<endl;
cin>>search;
cout<<arr[search];
return 0;
}
