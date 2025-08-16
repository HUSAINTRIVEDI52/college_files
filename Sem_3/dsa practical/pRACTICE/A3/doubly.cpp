#include <iostream>
using namespace std;
class Node
{
public:
    Node *next;
    Node *prev;
    int value;
};
Node *head = NULL;

void insert_at_last()
{
    Node *temp = new Node();
    temp->next = NULL;
    temp->prev = NULL;
    int no;
    cout << "Enter a value:";
    cin >> no;
    temp->value = no;
    if (head == NULL)
    {
        head = temp;
    }
    else
    {
        Node *p = head;
        while (p->next != NULL)
        {
            p = p->next;
        }
        p->next = temp;
        temp->prev = p;
    }
}

void insert_at_first()
{
    int no;
    cout << "Enter a number:";
    cin >> no;
    Node *temp = new Node();
    temp->value = no;
    temp->next = NULL;
    temp->prev = NULL;
    if (head == NULL)
    {
        head = temp;
    }
    else
    {
        temp->next = head;
        head->prev = temp;
        head = temp;
    }
}
void delete_at_last()
{
    if (head == NULL)
    {
        cout << "The linked list is empty";
    }
    else if (head->next == NULL)
    {
        cout << "the deleted element is" << head->value;
        Node *p = head;
        head = NULL;
        delete p;
    }
    else
    {
        Node *p = head;
        Node *pr = NULL;
        while (p->next != NULL)
        {
            pr = p;
            p = p->next;
        }
        cout << "the deleted element is " << p->value;
        pr->next = NULL;
        delete p;
    }
}
void delete_at_first()
{
    if (head == NULL)
    {
        cout << "The Linked list is empty:";
    }
    else if (head->next == NULL)
    {
        cout << "The deleted element is" << head->value;
        Node *p = head;
        head = NULL;
        delete p;
    }
    else
    {
        cout << "The deleted element is" << head->value;
        Node *p = head;
        head = head->next;
        head->prev = NULL;
        delete p;
    }
}
void insert_btw()
{
    int pos;
    cout << "Enter the position to enter the value in the node:";
    cin >> pos;
    cout << "Enter the value to enter in the linked lis:";
    Node *temp = new Node();
    cin >> temp->value;
    temp->next = NULL;
    temp->prev = NULL;
    int i = 1;
    Node *p = head;
    Node *sv;
    while (i < pos - 1)
    {
        p = p->next;
        i++;
    }
    sv = p->next;
    p->next = temp;
    temp->prev = p;
    temp->next = sv;
    sv->prev = temp;
}
void delete_btw()
{
    int no;
    cout << "enter the position you want to delete in the linkedlist:";
    cin >> no;
    Node *p = head;
    Node *pr, *sv;
    int i = 1;
    while (i < no)
    {
        pr = p;
        p = p->next;
        i++;
    }
    sv = p->next;
    pr->next = sv;
    sv->prev = pr;
    delete p;
}
void display_next()
{
    Node *temp = head;
    while (temp != NULL)
    {
        cout << "|" << temp->value << "|";
        temp = temp->next;
    }
}
void display_prev()
{
    Node *temp = head;
    while (temp->next != NULL)
    {
        temp = temp->next;
    }
    while (temp != NULL)
    {
        cout << "|" << temp->value << "|";
        temp = temp->prev;
    }
}
int main()
{

    int ch;
    do
    {
        cout << "\n1. INSERT AT LAST";
        cout << "\n2. INSERT AT FIRST";
        cout << "\n3. INSERT IN BETWEEN";
        cout << "\n4. DELETE AT FIRST";
        cout << "\n5. DELTE AT LAST";
        cout << "\n6. DELETE IN BETWEEN";
        cout << "\n7. DISPLAY NEXT";
        cout << "\n8. DISPLAY PREV";
        cout << "\nENTER UR CHOICE:";
        cin >> ch;
        switch (ch)
        {
        case 1:
            insert_at_last();
            break;
        case 2:
            insert_at_first();
            break;
        case 3:
            insert_btw();
            break;
        case 4:
            delete_at_first();
            break;
        case 5:
            delete_at_last();
            break;
        case 6:
            delete_btw();
            break;
        case 7:
            display_next();
            break;
        case 8:
            display_prev();
            break;
        }
    } while (ch <= 8);
}
