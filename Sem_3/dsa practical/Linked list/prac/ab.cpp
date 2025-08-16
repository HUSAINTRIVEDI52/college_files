#include <iostream>
using namespace std;
class node
{
public:
    int value;
    node *next;
};
node *head = new node();
void insert_at_first()
{
    int val;
    node *temp = new node();
    cout << "\n Enter a value";
    cin >> val;
    temp->value = val;
    temp->next = NULL;
    if (head == NULL)
    {
     head=temp;
    }
    else
    {
        temp->next = head;
        head = temp;
    }
}
void insert_at_last()
{
    int val;
    node *temp = new node();
    cout << "Enter the value";
    cin >> val;
    temp->next = NULL;
    if (head == NULL)
    {
        temp=
        head;
    }
    else
    {
        node *p = head;
        if (p != NULL)
        {
            p = p->next;
        }
        p->next = temp;
    }
}
void insert_at_btw()
{
    int pos, val, i = 1;
    cout << "Enter the position you want to enter an element";
    cin >> pos;
    cout << "Enter the value you want to enter ";
    cin >> val;
    node *p = new node();
    node *temp = new node();
    while (i < pos - 1)
    {
        p = p->next;
        i++;
    }
    node *sv = p->next;
    p->next = temp;
    temp->next = sv;
}
void delete_at_first()
{

    if (head == NULL)
    {
        cout << "The linked list is empty";
    }
    else if (head->next == NULL)
    {
        node *p = head;
        cout << "The deleted element is" << head->value;
        head = NULL;
        delete p;
    }
    else
    {
        node *p = head;
        cout << "The deleted element is" << head->value;
        head=head->next;
        delete p;
    }
}
void delete_at_last()
{
    
    node *pr = NULL;
    if (head == NULL)
    {
        cout << "The linked list is empty";
    }
    else if (head->next == NULL)
    {
        node *p = head;
        cout << "The deleted element is" << head->value;
        head = NULL;
        delete p;
    }
    else
    {
        node *p = new node();
        node *pr = NULL;
        while (p->next != NULL)
        {
            pr = p;
            p = p->next;
        }
        cout << "The deleted element is" << p->value;
        pr->next = NULL;
        delete p;
    }
}
void delete_in_btw()
{
    int pos, i = 1;
    cout << "Enter the position to delete an element";
    cin >> pos;
    node *p = new node();
    node *pr = NULL;
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
    node *temp = head;
    while (temp != NULL)
    {
        cout << "|" << temp->value << "|";
        temp = temp->next;
    }
}

using namespace std;
int main()
{
    int ch;
    do
    {
        cout << "\n Menu:";
        cout << "\n 1.Insert First";
        cout << "\n 2. Insert Last";
        cout << "\n 3.Insert Between";
        cout << "\n4. Delete First";
        cout << "\n5. Delete Last";
        cout << "\n6. Delete Between";
        cout << "\n7.Display";
        cin >> ch;
        switch (ch)
        {
        case 1:
            insert_at_first();
            break;
        case 2:
            insert_at_last();
            break;
        case 3:
            insert_at_btw();
            break;
        case 4:
            delete_at_first();
            break;
        case 5:
            delete_at_last();
            break;
        case 6:
            delete_in_btw();
            break;
        case 7:
            display();
        }
    } while (ch <= 7);
}
