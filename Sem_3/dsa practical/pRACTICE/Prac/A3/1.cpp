

// 1. Write a C++ data structure program that will perform following operations on simple queue.
// Enqueue
// Dequeue
// Peek
// Display

#include <iostream>
using namespace std;
#define size 5
class queue
{
    int rear, front;
    int arr[size];

public:
    queue()
    {
        rear = front = -1;
    }
    void enqueue()
    {
        int no;
        if (front == size - 1)
        {
            cout << "The queue is full";
        }
        else if (front == -1 && rear == -1)
        {
            front = rear = 0;
        }
        else
        {
            rear += 1;
        }
        cout << "\nEnter a number";
        cin >> no;
        arr[rear] = no;
    }
    void dequeue()
    {
        if (front == -1 && rear == -1)
        {
            cout << "The queue is empty";
        }
        else
        {
            cout << "The deleted element is" << arr[front];
        }

        if (front == size - 1 && rear == size - 1)
        {
            front = size - 1;
        }
        else
        {
            front += 1;
        }
    }
    void peek()
    {
        cout<<"The element at the front is"<<arr[front];
    }
    void display()
    {
            cout<<"the element are";

             for (int i = front; i < rear; i++)
    {
        cout << "|" << arr[i] << "|";
    }
    }
};
int main()
{
 int input;
        queue q1;
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
