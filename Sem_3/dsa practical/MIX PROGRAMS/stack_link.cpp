#include<iostream>
using namespace std;
 class node
 {
 public:
 int value;
 node *next;
 };

node *head=new node();
 void push()
 {
   int val;
   cout<<"Enter the value\n";
   cin>>val;
   node *temp=new node();
   temp->value=val;
   if(head==NULL)
   {
   head=temp;
   }
   else
   {
   node *p=head;
   temp->next=head;
   head=temp;
   }
 }
 void pop()
 {
 if(head==NULL)
 {
 cout<<"NULL\n";
 }
 else
 {
 cout<<"The deleted element is"<<head->value;
 node *p=head;
 head=head->next;
delete p;
  }
 }
void peep()
{
	cout<<"The top of the element is"<<head->value;
	}
	void display()
	{
	if(head==NULL)
	{
	cout<<"NULL\n";
	}
	else
	{
      node *temp=head;
      while(head!=NULL)
      {
       cout<<"|"<<head->value<<"|";
       temp=temp->next;
      }
	}
	}
int main()
{
	int ch;
	do{
	cout<<"\nMENU";
	cout<<"\n1.PUSH";
	cout<<"\n2.POP";
	cout<<"\n3.PEEP";
	cout<<"\n4.Display";
	cout<<"\nEnter your choice";
	cin>>ch;
	switch(ch)
	{
	case 1: push();
	break;
	case 2:pop();
	break;
	case 3:peep();
	break;
	case 4:display();
	break;

	}
}
	while(ch<=7);


}