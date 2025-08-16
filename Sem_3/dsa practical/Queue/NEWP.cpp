#include<iostream>
using namespace std;
// #DEFINE SIZE 5
#define size 5

class demo
{
    int rear,front;
    int arr[size];
    public:
    demo()
    {
        rear=front=-1;
    }
    int enqueue();
    int dequeue();
    int peek();
    int display();

};
int demo::enqueue()
{
    int value;
if(rear==size-1)
{
    cout<<"The queue is full";
}
else if(rear==-1 && front==-1)
{
    rear=front=0;
}
else{
rear=rear+1;
}
cout<<"Enter the value: ";
cin>>value;
arr[rear]=value;


}
int demo::dequeue()
{
    if(rear==1 && front==-1)
    {
        cout<<"The queue is empty";
    }
    else
    {
        cout<<"the deleted element is"<<arr[front];
    }
    if(front==-1 && rear==-1)
    {
        front=rear=-1;
    }
    else{
        front+=1;
    }

}
int demo::peek()
{
 if(rear==-1 && front==-1)
 {
    cout<<"The queue is empty";
     
     }
     else{
        cout<<"The front of the queue is"<<arr[front];
     }
}
int demo::display()
{
for(int i=front;i<rear;i++)
{
    cout<<"|"<<arr[i]<<"|";
}
}
int main(){
demo d1;
int value;
do{

cout<<"Menu\n";
cout<<"1.Insert\n";
cout<<"2.Delete\n";
cout<<"3.Peek\n";
cout<<"4.Display\n";
cin>>value;

switch (value)
{
    case 1:d1.enqueue();
    break;
    case 2:d1.dequeue();
    break;
    case 3:d1.peek();
    break;
    case 4:d1.display();
    break;
}

}while(value<=4);
return 0;
}
