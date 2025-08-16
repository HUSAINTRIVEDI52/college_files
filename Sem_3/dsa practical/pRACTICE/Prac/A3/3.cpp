#include<iostream>
#define n 5
using namespace std;
class st{
    int top=-1;
    int arr[n];
    public:
    void push()
    {
        if(top==n-1)
        {
            cout<<"the stack is full";
        }
        else{

        int no;
        cout<<"Enter a number:";
        cin>>no;
        top+=1;
        arr[top]=no;
        }
    }
    void pop()
    {
        if(top==-1)
        {
            cout<<"The stack is empty";

        }
        else{
            cout<<"the deleted element is"<<arr[top];
            top-=1;
        }
    }
    void peep()
    {
        if(top==-1)
        {
            cout<<"The stack is empty";
        }
        else{
            cout<<"The front element is"<<arr[top];
        }
    }
    void display()
    {
        for(int i=top;i>0;i--)
        {
            cout<<"|"<<arr[i]<<" ";
        }
    }
};
int main(){
 st f1;
    int ch;
    do
    {
        
    cout<<"Enter 1 for push:\n";
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
