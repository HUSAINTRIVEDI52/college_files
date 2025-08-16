using namespace std;
#include <iostream>
#define size 5
class demo
{
	int queue[size];
	int front, rear;

public:
	demo()
	{
		front = rear = -1;
	}
	int enqueue();	// INSERTION
	void dequeue(); // DELETION
	void peek();	// TO CHECK FIRST ELEMENT OF  QUEUE
	void display();
};

int demo::enqueue()
{
	int value;
	if ((front == 0 && rear == size - 1) || (front == rear + 1))
	{
		cout << "\n QUEUE iS FULL";
		return 0;
	}
	else if (front != 0 && rear == size - 1) // to insert again when there is empty space at f
	{
		rear = 0;
	}
	else if (front == -1 && rear == -1)
	{
		front = rear = 0;
	}
	else
	{
		rear = rear + 1;
	}
	cout << "\n enter value:";
	cin >> value;
	queue[rear] = value;
	return 0;
}
void demo::dequeue()
{
	if (front == -1 && rear == -1)
	{
		cout << "\n QUEUE iS EMPTY";
	}
	else
	{
		cout << "\n deleted element is:" << queue[front];
		if (front == rear)
		{
			front = rear = -1;
		}
		else if (front == size - 1 && rear != size - 1)
		{
			front = 0;
		}
		else
		{
			front = front + 1;
		}
	}
}
void demo::peek()
{
	if (front == -1 && rear == -1)
	{
		cout << "\n QUEUE iS EMPTY";
	}
	else
	{
		cout << "\n FIRST ELEMENT OF QUEUE IS " << queue[front];
	}
}
void demo::display()
{
	int i;
	cout << "\n QUEUE IS:\n";
	if (front <= rear)
	{
		for (i = front; i <= rear; i++)
		{
			cout << "|" << queue[i] << "|";
		}
	}
	else
	{
		for (i = front; i <= size - 1; i++)
		{
			cout << "|" << queue[i] << "|";
		}
		for (i = 0; i <= rear; i++)
		{
			cout << "|" << queue[i] << "|";
		}
	}
	cout << "\n FRONT IS AT:" << front;
	cout << "\n REAR IS AT:" << rear;
}

int main()
{
	int ch;
	demo d1;
	do
	{
		cout << "\n MENU";
		cout << "\n 1. INSERT";
		cout << "\n 2. DELETE";
		cout << "\n 3. PEEK";
		cout << "\n 4. DISPLAY";
		cout << "\n ENTER CHOICE:";
		cin >> ch;
		switch (ch)
		{
		case 1:
			d1.enqueue();
			break;
		case 2:
			d1.dequeue();
			break;
		case 3:
			d1.peek();
			break;
		case 4:
			d1.display();
			break;
		}

	} while (ch <= 4);
	return 0;
}
