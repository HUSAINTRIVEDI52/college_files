#include <iostream>
using namespace std;
class node
{
public:
  int value;
  node *next;
};
node *head = new node();

void insert_at_Last()
{
  node *temp = new node();
  int input;
  cout << "\nEnter a value:";
  cin >> input;

  temp->value = input;
  temp->next = NULL;
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
    p->next = temp;
  }
}
void insert_at_first()
{
  node *temp = new node();
  int no;
  cout << "\n Enter a number";
  cin >> no;
  temp->value = no;
  temp->next = NULL;
  if (head == NULL)
  {
    head = temp;
  }
  else
  {
    temp->next = head;
    head = temp;
  }
}
void delete_at_last()
{
  if (head == NULL)
  {
    cout << "\nLinked List is empty";
  }
  else if (head->next == NULL)
  {
    cout << "Deleted element is" << head->value;
    node *p = head;
    head = NULL;
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
    cout << "\n deleted element is" << p->value;
    pr->next = NULL;
    delete p;
  }
}
void delete_at_first()
{
  if (head == NULL)
  {
    cout << "linked list is empty..";
  }
  else if (head->next == NULL)
  {
    cout << "Deleted element is" << head->value;
    node *p = head;

    head = NULL;
    delete p;
  }
  else
  {
    cout << "Deleted element is" << head->value;
    node *p = head;
    head = head->next;
    delete p;
  }
}
void insert_btw()
{
  int i = 1;
  int pos;
  cout << "Enter the position for the new node";
  cin >> pos;
  node *temp = new node();
  cout << "Enter the value for the new node";
  cin >> temp->value;
  node *p = head;
  while (i < pos - 1)
  {
    p = p->next;
    i += 1;
  }
  node *sv = p->next;
  p->next = temp;
  temp->next = sv;
}
void delete_btw()
{
  int pos, i = 1;
  cout << "Enter the postiton you want tot delete";
  cin >> pos;

  node *p = head;
  node *pr = NULL;
  while (i < pos)
  {
    pr = p;
    p = p->next;
    i = i + 1;
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
do{
  cout<<"\n1. Insert first";
  cout<<"\n2.Delete first";
  cout<<"\n3.Insert Last";
  cout<<"\n4.Delete last";
  cout<<"\n5.Insert Between";
  cout<<"\n6.Delete between";
  cout<<"\n7.Display";
  cout<<"\nEnter your Choice";
  cin>>ch;
  switch(ch)
  {
     case 1:insert_at_first();
     break;
     case 2:delete_at_first();
     break;
     case 3:insert_at_Last();
     break;
     case 4:delete_at_last();
     break;
     case 5:insert_btw();
     break;
     case 6:delete_btw();
     break;
     case 7:display();
  }

}while(ch<=7);
  // return 0;
}
