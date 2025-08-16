#include<iostream>
using namespace std;
#define size 5
class queue
{
    int arr[size];
    int front,rear;
    public:
    queue()
    {
        front=rear=-1;
    }
    int enqueue();
    int dequeue();
    int peek();
    int display();
};
int queue::enqueue()
{
    int value;
 if(rear==size-1)
 {
    cout<<"The queue is full";  
    return 0;
 }
 else if(front==-1 && rear==-1)
 {
    front=rear=0;
 }
 else{
    rear=rear+1;
 }
 cout<<"Enter the value";
 cin>>value;
 arr[rear]=value;
}
int queue::dequeue()
{
    if(rear==-1 && front==-1)
    {
         cout<<"\nThe Queue is empty\n";
    }
    else
    {
        cout<<"The deleted element is "<<arr[front];
    }
    if(front==size-1 && rear==size-1)
    {
        front=rear=-1;
    }
    else{
        front+=1;
    }
}
int queue::peek()
{
   if(rear==-1 && front==-1)
   {
    cout<<"The queue is empty";
   }
   else{
     cout<<"The front element is"<<arr[front];
   }
}
int queue::display()
{
    for(int i=front;i<rear;i++)
    {
        cout<<"|"<<arr[i]<<"|";
    }
}
int main(){
int input;
queue q1;

do
{
cout<<"\n Enter the proper input for the simple queue operations:";
cout<<"\n 1.Enqueue";
cout<<"\n2.Dequeue";
cout<<"\n 3.Peek";
cout<<"\n 4.Display";
cin>>input;

    switch(input)
    {
    case 1:q1.enqueue();
    break;
    case 2:q1.dequeue();
    break;
    case 3:q1.peek();
    break;
    case 4:q1.display();
    break;
    default:cout<<"Enter proper input";

    }

} while (input<=4);

return 0;
}
