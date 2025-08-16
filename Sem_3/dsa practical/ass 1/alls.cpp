/*  */   // Write a program that will perform following operations on single dimension array:
// • Insert an element into an array •

#include<iostream>
using namespace std;
// #define size 5
class fun
{
private:
int arr[10];
int size;
int r,c;
public:
void input()
{
    cout<<"Enter the size of the row:";
    cin>>size;
}

void input2()
{
    cout<<"Enter the elements of the array\n";
    for(int i=0;i<size;i++)
    {
        
        
            cout<<"Enter the Element number";
            cout<<"["<<i<<"]";
            cin>>arr[i];
        
    }
}
void insert()
{
    int insert;
    int inspos;
    cout<<"Enter the position you want to inset the element in the array:";
    cin>>inspos;

    cout<<"Enter the element you want to insert at the "<<inspos<<" Position";
    cin>>insert;

    if(inspos>=0 && inspos<=size)
    {
        for(int i=size;i>inspos-1;i--)
        {
            arr[i]=arr[i-1];
        }
    arr[inspos]=insert;
    ++size;
    }

    for(int i=0;i<size;i++)
    {
        cout<<arr[i]<<" ";
    }
}
void elete()
{
int delet;
cout<<"Enter the position you want to delete";
cin>>delet;

if(delet>0 && delet<=size)
{
    for(int i=delet;i<size-1;++i)
    {
        arr[i]=arr[i+1];
    }
    
    --size;
}
    for(int i=0;i<size;i++)
    {
        cout<<arr[i]<<" ";
    }
}
void search()
{
    int search;
    cout<<"Enter the element for the searching of the element:";
    cin>>search;

    cout<<"The searched element is "<<arr[search];
}
};


int main(){
fun f1;
f1.input();
f1.input2();
f1.insert();
f1.elete();
f1.search();
return 0;
}
