#include <iostream>
using namespace std;
class node
{
public:
    int value;
    node *prev;
    node *next;
};
node *head = new node();
void insert_at_last()
{
    node *temp = new node();
    int no;
    cout << "Enter value for the node:";
    cin >> no;

    temp->value = no;
    temp->next = NULL;
    temp->prev = NULL;
    if (head == NULL)
    {

        head = temp;
    }
    else
    {
        node *p = head;
        while (p->next != NULL)
        {
            p = p->next;
        }
        p->next = NULL;
        temp->prev = head;
    }
}
void insert_at_first()
{
    node *temp = new node();
    int no;
    cout << "Enter the value for your node:";
    cin >> no;
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
        cout << "Linked list is empty";
    }
    else if (head->next == NULL)
    {
        cout << "The deleted element is" << head->value;
        node *p = head;
        head == NULL;
        delete p;
    }
    else
    {
        node *p = head;
        node *pr = NULL;
        while (p->next != NULL)
        {
            pr = p;
            p = p->next;
        }
        cout << "Deleted element is" << p->value;
        pr->next = NULL;
        delete p;
    }
}
void delete_at_first()
{
    if (head == NULL)
    {
        cout << "The linked list is empty";
    }
    else if (head->next == NULL)
    {
        cout << "The deleted element is" << head->value;
        node *p = head;
        head = NULL;
        delete p;
    }
    else
    {
        node *p = head;
        cout << "The deleted element is" << head->value;
        head = head->next;
        head->prev = NULL;
        delete p;
    }
}
void insert_btw()
{
    int pos, val;
    cout << "Enter the position to enter the value:";
    cin >> pos;
    cout << "Enter the value:";
    cin >> val;
    node *temp = new node();
    node *sv;
    temp->next = NULL;
    temp->prev = NULL;
    int i = 1;
    node *p = head;
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
    int pos;
    cout << "Enter the position:";
    cin >> pos;
    int i = 1;
    node *p = head;
    node *sv, *pr;
    while (i < pos)
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
    node *temp = head;
    while (temp != NULL)
    {
        cout << "|" << temp->value << "|";
        temp = temp->next;
    }
}
void display_prev()
{
    node *temp = head;
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
        cout << "\nINSERT AT LAST";
        cout << "\nINSERT AT FIRST";
        cout << "\nINSERT ATA BETWEEN";
        cout << "\nDELETE AT FIRST";
        cout << "\nDELETE IN LAST";
        cout << "\n DELETE IN BETWEEN";
        cout << "\nDISPLAY NEXT";
        cout << "\nDISPLAY PREVIOUS";
        cout << "\n ENTER YOUR CHOICE";
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
        }
    } while (ch <= 8);

    return 0;
}
