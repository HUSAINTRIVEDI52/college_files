#include<iostream>
using namespace std;
#define n 5
class cqueue{
    int ar[n];
    int front,rear;
    public:
    cqueue()
    {
        front=rear=-1;
    }

    void enqueue()
    {
        if(front=n-1 && rear==n-1)
        {
            cout<<"The queue is full";
        }
        else if(front==-1 && rear==-1)
        {
            front=rear=0;
        }
        else{
            rear+=1;
        }
        cout<<"Enter a value";
        int val;
        cin>>val;
        ar[rear]=val;
    }
    void dequeue()
    {
        if(rear==-1 && front==-1)
        {
            cout<<"The queue is empty";
        }
        else{
            cout<<"The deleted element is"<<ar[front];
            if(front==rear)
            {
                front=rear=0;
            }
            else if(front==n-1 && rear!=n-1){
                front=0;
            }
            else{
                front+=1;
            }
        }
        
    }
        void peek()
        {
            if(front==n-1 && rear==n-1)
            {
                cout<<"The queue is empty";
            }
            else{
                cout<<"The front element is"<<ar[front];
            }
        }
        void display()
        {
            if(front<=rear)
            {
                for(int i=front;i<rear;i++)
                {
                    cout<<"|"<<ar[i]<<"|";
                }
                
                
            }else{
                    for(int i=front;i<n-1;i++)
                    {
                        cout<<"|"<<ar[i]<<"|";
                    }
                    for(int i=0;i<rear;i++)
                    {
                        cout<<"|"<<ar[i]<<"|";
                    }
        }
}
};
int main(){

 int input;
        cqueue q1;
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


}
