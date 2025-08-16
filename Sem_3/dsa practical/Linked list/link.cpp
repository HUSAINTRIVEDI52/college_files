#include <iostream>
using namespace std;
class node
{
public:
    int value;
    node *next;
};
node *head = new node();
int insert_at_first()
{
    int no;
    node *temp = new node();
    cout << "\nEnter a value:";
    cin >> no;
    temp->value = no;
    
    temp->next == NULL;
    if (head == NULL)
    {
        temp = head;
    }
    else
    {
        temp->next = head;
        head = temp;
    }
}
void insert_at_last()
{
    node *temp = new node();
    int no;
    cout << "Enter a number:";
    cin >> no;
    temp->next = NULL;
    if (head == NULL)
    {
        head = temp;
    }
    else
    {
        node *p = head;

        while (p != NULL)
        {
            p = p->next;
        }
        p->next = temp;
    }
}
void delete_at_last()
{
    if (head == NULL)
    {
        cout << ("Linked list is empty");
    }
    else if (head->next == NULL)
    {
        node *p = head;
        cout << "Deleted element is: " << head->value;
        head = NULL;
        delete p;
    }
    else
    {
        node *p = new node;
        node *pr = NULL;
        while (p->next != NULL)
        {
            pr = p;
            p = p->next;
        }
        cout << "Deleted value is " << p->value;
        p->next = NULL;
        delete p;
    }
}
void delete_first()
{
    if (head == NULL)
    {
        cout << "Linked list is empty";
    }
    else if (head->next == NULL)
    {
        node *p = head;
        cout << "The deleted elememnt is" << head->value;
        head = NULL;
        delete p;
    }
    else
    {
        node *p = head;
        cout << "deleted element is " << head->value;
        head = head->next;
        delete p;
    }
}
void insert_btw()
{
    int value, pos, i = 1;
    cout << "Enter the position at which you want to enter the value:";
    cin >> pos;
    node *temp = new node();
    node *p = new node();
    cout << "Enter the value:";
    cin >> value;
    while (i < pos - 1)
    {
        p = p->next;
        i++;
    }
    node *sv = p->next;
    p->next = temp;
    temp->next = sv;
}
void delete_btw()
{
    int no, i = 1;
    cout << "Enter the position you want to delete:";
    cin >> no;
    node *p = new node;
    node *pr = NULL;
    while (i < no)
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
int main()
{
    int ch;
    do
    {
        cout << "\n1. Insert first";
        cout << "\n2.Delete first";
        cout << "\n3.Insert Last";
        cout << "\n4.Delete last";
        cout << "\n5.Insert Between";
        cout << "\n6.Delete between";
        cout << "\n7.Display";
        cout << "\nEnter your Choice";
        cin >> ch;
        switch (ch)
        {
        case 1:
            insert_at_first();
            break;
        case 2:
            delete_first();
            break;
        case 3:
            insert_at_last();
            break;
        case 4:
            delete_at_last();
            break;
        case 5:
            insert_btw();
            break;
        case 6:
            delete_btw();
            break;
        case 7:
            display();
        }

    } while (ch <= 7);
    return 0;
}
