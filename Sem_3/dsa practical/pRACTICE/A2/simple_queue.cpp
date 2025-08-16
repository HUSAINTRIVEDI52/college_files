#include <iostream>
using namespace std;
#define x 5
class queues
{
    int rear, front;
    int arr[x];

public:
     queues()
    {
        front = rear = -1;
    }
    int enqueue();
    int dequeue();
    int peek();
    int display();
};

int queues::enqueue()
{
    if (rear == x - 1)
    {
        cout << "The queue is full";
    }
    else if (rear == -1 && front == -1)
    {
        front = rear = 0;
    }
    else
    {
        rear = rear + 1;
    }
    int value;
    cout << "Enter the value:" << endl;
    cin >> value;
    arr[rear] = value;
}
int queues::dequeue()
{
    if (rear == -1 && front == -1)
    {
        cout << "The Queue is empty";
    }
    else
    {
        cout << "The deleted element is" << arr[front];
    }
    if (front == x - 1 && rear == x - 1)
    {
        front = rear = -1;
    }
    else
    {
        front += 1;
    }
}
int queues::peek()
{
    if (rear == -1 && front == -1)
    {
        cout << "The queue is empty";
    }
    else
    {
        cout << "The front element is " << arr[front];
    }
}
int queues::display()
{
    for (int i = front; i < rear; i++)
    {
        cout << "|" << arr[i] << "|";
    }
}
int main()
{
    int input;
        queues q1;
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
}