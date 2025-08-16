#include<iostream>
using namespace std;
#define size 5
class fun
{
    
int arr[size];
int top=-1;
public:
void push()
{
    if(top==size-1)
    {
        cout<<"The stack is full\n";
    }
    else{
     int value;
     cout<<"Enter a value\n";
     cin>>value;   
     top=top+1;
     arr[top]=value;
    }
}
 
    void pop()
 {
    {
        if(top==-1)
        {
            cout<<"Stack is Empty\n";
        }
        else{
            cout<<"The deleted element is"<<arr[top];
           top=top-1;
        }
    }
}
void peep()
{
    if(top==-1)
    {
        cout<<"The stack is empty";

    }
    else{
        cout<<"The top element is"<<arr[top];
    }
}
void display()

{
    for(int i=top;i>=0;i--)
    {
        cout<<"|"<<arr[i]<<"|";
    }
}

};
int main(){
    fun f1;
    int ch;
    do
    {
        
    cout<<"Enter 1 for puch:\n";
    cout<<"Enter 2 for pop\n";
    cout<<"enter 3 delete\n";
    cout<<"Enter 4 for display:\n";
    cout<<"Enter a value:";
    cin>>ch;
    
    switch(ch)
    {
        case 1: f1.push();
        break;
        case 2: f1.pop();
        break;
        case 3: f1.peep();
        break;
        case 4:f1.display();
        break;
        case 5:exit(0);
        default:

        cout<<"Invalid";
    }
    } while (ch!=5);


return 0;
}
