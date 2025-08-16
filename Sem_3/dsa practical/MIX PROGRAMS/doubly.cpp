#include<iostream>
using namespace std;
class node
{ 
 	public:
	int value;
	node *next;
	node *prev;
};
node *head=new node();
void delete_at_first()
{
	node *temp=new node();
	cout<<"\nEnter the value";
	int val;
	cin>>val;
	if(head==NULL)
	{
		cout<<"The Linked List is empty";
	}
	else if(head->next=NULL)
	{
		cout<<"\nThe deleted element is"<<head->value;
		node *p=head;
		head=NULL;
		delete p;
	}
	else
	{
		cout<<"\nThe deleted element is"<<head->value;
		node *p=head;
		head=head->next;
		head->prev=NULL;
		delete p;
	}
}
void delete_at_last()
{
	if(head==NULL)
	{
	cout<<"The linked list is empty";
	}
	else if(head->next=NULL)
	{
	cout<<"The deleted element is "<<head->value;
	node *p=head;
	head=NULL;
	delete p;
	}
	else
	{
	node *p=head;
	node *pr=NULL;
	while(p->next!=NULL)
	{
	pr=p;
	p=p->next;
	}
	cout<<"Deleted element is"<<p->value;
	p->next=NULL;
	delete p;
	}

}
void delete_btw()
{
	int i=1,pos;
	cout<<"Enter the position you want to delete";
	cin>>pos;
	node *p=head;
	node *pr,*sv;
	while(i<pos)
	{
		pr=p;
		p=p->next;
	}
	sv=p->next;
	pr->next=sv;
	sv->prev=pr;
	delete p;
}
void insert_at_first()
{
	int val;
	cout<<"Enter the value";
	cin>>val;
	node *temp=new node();
	temp->value=val;
	temp->next=NULL;
	temp->prev=NULL;
	if(head==NULL)
	{
	head=temp;
	}
	else
	{
	 temp->next=head;
	 head->prev=temp;
	 head=temp;
	}
	
}
void insert_at_last()
{
	node *temp=new node();
	int val;
	cout<<"Enter a value";
	cin>>val;
	temp->value=val;
	temp->next=NULL;
	temp->prev=NULL;

	if(head==NULL)
	{
	temp=head;
	}
	else 
	{
	node *p=head;
	while(p->next!=NULL);
	{
	p=p->next;
	}
	p->next=temp;
	temp->prev=p;
	}

}
void insert_at_between()
{
	int pos,val,i=1;
	cout<<"Enter the position to enter the value:";
	cin>>pos;
	cout<<"Enter the value:";
	cin>>val;
	node *temp=new node;
	temp->next=NULL;
	head->prev=NULL;
	node *sv;
	node *p=head;
	while(i<pos-1)
	{
	p=p->next;
	i++;
	}
	sv=p->next;
	p->next=temp;
	temp->prev=p;
	temp->next=sv;
	sv->prev=temp;
}
void display_next()
{
	node*temp=head;
	while(temp!=NULL)
	{
	cout<<"|"<<temp->value<<"|";
	temp=temp->next;
	}
}
void display_prev()
{
	node *temp=head;
	while(temp->next!=NULL)
	{
	temp=temp->next;
	}
	while(temp!=NULL)
	{
	cout<<"|"<<temp->value<<"|";
	temp=temp->prev;

	}
}
int main()
{
	int ch;
	do
	{
	cout<<"\n1.Insert First";
	cout<<"\n2.Delete first";
	cout<<"\n3.Insert Last";
	cout<<"\n4.Delete last";
	cout<<"\n5.Insert Between";
	cout<<"\n6.Delete between";
	cout<<"\n7.Display next";
	cout<<"\n8.Display previous";
	cout<<"\n MENU";
	cin>>ch;

	switch(ch)
	{
	case 1:insert_at_first();
	break;
	case 2: delete_at_first();
	break;
	case 3:	void insert_at_last();
	break;
	case 4:delete_at_last();
	break;
	case 5: insert_at_between();
	break;
	case 6:delete_btw();
	break;
	case 7: display_next();
	break;
	case 8:  display_prev();
	break;
	}
	}
	while(ch<=7);
}