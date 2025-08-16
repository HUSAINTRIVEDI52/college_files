#include <iostream>
using namespace std;

class Node
{
public:
    int value;
    Node *next;
};
Node *Head = NULL;

void insert_at_last()
{
    Node *temp = new Node();
    int no;
    cout << "\n Enter a number:";
    cin >> no;
    temp->value = no;
    temp->next = NULL;
    if (Head == NULL)
    {
        Head = temp;
    }
    else
    {
        Node *p = Head;
        while (p->next != NULL)
        {
            p = p->next;
        }
        p->next = temp;
    }
}
void insert_at_first()
{
    Node *temp = new Node();
    int no;
    cout << "\n Enter a value:";
    cin >> no;
    temp->value = no;
    temp->next = NULL;
    if (Head == NULL)
    {
        Head = temp;
    }
    else
    {
        Head->next = Head;
        Head = temp;
    }
}

void delate_at_last()
{
    if (Head == NULL)
    {
        cout << "\nLinked lisst is empty";
    }
    else if (Head->next == NULL)
    {
        cout << "Deleted element is" << Head->value;
        Node *p = Head;
        Head = NULL;
        delete p;
    }
    else
    {
        Node *p = Head;
        Node *pr = NULL;
        while (p->next != NULL)
        {
            p = pr;
            p = p->next;
        }
        cout << "deleted element is" << p->value;
        pr->next = NULL;
        delete p;
    }
}
void delete_at_first()
{
    if (Head == NULL)
    {
        cout << "Linked list is empty";
    }
    else if (Head->next == NULL)
    {
        cout << "The deleted element is" << Head->value;
        Node *p = Head;
        Head = NULL;
        delete p;
    }
    else
    {
        cout << "Deleted element is " << Head->value;
        Node *p = Head;
        Head = Head->next;
        delete p;
    }
}
void insert_btw()
{
    Node *temp = new Node();
    int pos;
    cout << "Enter the position you want to enter a number:";
    cin >> pos;
    cout << "Enter the value you want to insert in btw: ";
    cin >> temp->value;
    int i = 1;
    temp->next = NULL;

    Node *p = Head;
    Node *SV;
    while (i < pos - 1)
    {
        p = p->next;
        i++;
    }
    SV = p->next;
    p->next = temp;
    temp->next = SV;
}
void delete_btw()
{
    int pos;
    cout << "Enter the position you want to delete:";
    cin >> pos;
    Node *p = Head;
    int i = 1;
    Node *pr;
    while (i < pos)
    {
        pr = p;
        p = p->next;
        i++;
    }
    pr->next = p->next;
    delete p;
}
void display()
{
    Node *temp = Head;
    while (temp != NULL)
    {
        cout << "|" << temp->value << "|";
        temp = temp->next;
    }
}

int main()
{
int ch;
	do
	{
	cout<<"\n1. INSERT AT LAST";
	cout<<"\n2. INSERT AT FIRST";
	cout<<"\n3. INSERT IN BETWEEN";
	cout<<"\n4. DELETE AT FIRST";
	cout<<"\n5. DELTE AT LAST";
	cout<<"\n6. DELETE IN BETWEEN";
	cout<<"\n7. DISPLAY";
	cout<<"\nENTER UR CHOICE:";	
	cin>>ch;
	switch(ch)
	{
	case 1: insert_at_last();
		break;
	case 2: insert_at_first();
		break;
	case 3: insert_btw();
		break;
	case 4: delete_at_first();
		break;
	case 5: delate_at_last();
		break;
	case 6: delete_btw();
		break;
	case 7: display();
		break;
	}
	}while(ch<=7);
    return 0;
}
