#include<iostream>
using namespace std;
#define size 25
class demo
{
    int front,rear;
    int queue[size];
    public:
    demo()
    {
        front=rear=-1;
    }
    int enqueue();
    int dequeue();
    int peek();
    int display();
};
int demo::enqueue()
{
    if((front==0 && rear==size-1) ||(front==rear+1))
    {
        cout<<"Queue is full";
    }
    else if(front !=0 && rear==size-1)
    {
        rear=0;
    }
    else if(front==-1 && rear==-1)
    {
        front=rear=0;
    }
    else{
        rear+=1;
    }
    int value;
    cout<<"Enter a value";
    cin>>value;
    queue[rear]=value;
    return 0;
}
int demo::dequeue()
{
    if(front==-1 && rear==-1)
    {
        cout<<"Queue is empty";
    }
    else{
        cout<<"Deleted element is "<<queue[front];
        if(front==rear)
        {
            front=rear=-1;
        }
        else if(front==size-1 && rear!=size-1){
            front=0;

        }
        else{
            front+=1;
        }
    }
}
int demo::peek()
{
    if(front==-1 && rear==-1)
    {
        cout<<"Queue is empty ";
    }
    else{
        cout<<"First element is "<<queue[front];
}
}
int demo::display()
{ 
    cout<<"Queue is";
    if(front<=rear)
    {
        for(int i=front;i<rear;i++)
        {
            cout<<"|"<<queue[i]<<"|";
        }
    }
    else{
        for(int i=front;i<size-1;i++)
        {
            cout<<"|"<<queue[i]<<"|";
        }
        for(int i=0;i<rear;i++)
        {
            cout<<"|"<<queue[i]<<"|";
        }
    }
    cout<<"\n Front is at "<<front;
    cout<<"\n Rear is at "<<rear;

}
int main(){
int input;
        demo q1;
    do
    {
        cout << "Enter a value from given below:\n";
        cout << "1.Enqueue\n";
        cout << "2.Dequeue\n";
        cout << "3.Peek\n";
        cout << "4.Display\n";
        cin >> input;
        switch (input)
        {
        case 1:
            q1.enqueue();
            break;

        case 2:
            q1.dequeue();
            break;

        case 3:
            q1.peek();
            break;

        case 4:
            q1.display();
            break;
            ;

        default:
            cout << "Invalid input entered";
        }
    } while (input <= 5);
    return 0;
return 0;
}
