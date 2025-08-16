#include <iostream>
using namespace std;
#define size 25
class fun
{
    int arr[size];
    int top = -1;

public:
    void push()
    {
        int value;
        if (top == size - 1)
        {
            cout << "The stack is full\n";
        }
        else
        {
            cout << "Enter a value";
            cin >> value;
            top+=1;
            arr[top] = value;
        }
    }
    void pop()
    {
        if (top == -1)
        {
            cout << "The stack is empty\n";
        }
        else
        {
            cout << "The deleted element is" << arr[top];
            top -= 1;
        }
    }

    void peep()
    {
        if (top == -1)
        {
            cout << "The stack is empty";
        }
        else
        {
            cout << "The top element is" << arr[top];
        }
    }

    void display()
    {
        for (int i = top; i > 0; i--)
        {
            cout << "|" << arr[i] << "|";
        }
    }
};
int main()
{
    int input;
    fun q1;
    do
    {
        cout << "Enter a value from given below:\n";
        cout << "1.push\n";
        cout << "2.pop\n";
        cout << "3.Peepṇ\n";
        cout << "4.Display\n";
        cin >> input;
        switch (input)
        {
        case 1:
            q1.push();
            break;

        case 2:
            q1.pop();
            break;

        case 3:
            q1.peep();
            break;

        case 4:
            q1.display();
            break;
        default:
            cout << "Invalid input entered";
        }
    } while (input <= 5);
    return 0;
    
    }
