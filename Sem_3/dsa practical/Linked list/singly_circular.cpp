#include<iostream>
using namespace std;
//circular linked list:1) singly circular  2)doubly circular
//last->next=Head
class Node
{
	public:
	int value;
	Node *next;
	
};
Node *Head=NULL;
Node *Last=NULL;
void insert_at_last()
{
	Node *tmp=new Node();
	int no;
	cout<<"\n enter value for ur node:";
	cin>>no;
	tmp->value=no;
	tmp->next=NULL;
	if(Head==NULL)
	{
	Head=tmp;
	tmp->next=Head;
	Last=Head;
	}
	else
	{
	Node *p=Head;
	while(p->next!=Head)
	{
	p=p->next;
	}
	p->next=tmp;
	Last=tmp;
	Last->next=Head;//singly circuar
	}
	

}
void insert_at_first()
{
	Node *tmp=new Node();
	int no;
	cout<<"\n enter value for ur node:";
	cin>>no;
	tmp->value=no;
	tmp->next=NULL;
	if(Head==NULL)
	{
	Head=tmp;
	tmp->next=Head;
	Last=tmp;
	}
	else
	{
	tmp->next=Head;
	Head=tmp;
	}
	Last->next=Head;
}
void delete_at_last()
{
	if(Head==NULL)
	{
	cout<<"\n LINKED LIST IS EMPTY";
	}
	else if(Head->next==Head)
	{
	cout<<"\n DELETED ELEMENT IS:"<<Head->value;
	Node *p=Head;
	Head=NULL;
	delete p;
	}
	else
	{
	Node *p=Head;
	Node *pr=NULL;
	while(p->next!=Head)
	{
	pr=p;
	p=p->next;
	}
	cout<<"\n DELETED ELEMENT IS:"<<p->value;	
	pr->next=Head;
	Last=pr;
	delete p;
	}
	Last->next=Head;
}
void delete_at_first()
{
	if(Head==NULL)
	{
	cout<<"\n LINKED LIST IS EMPTY";
	}
	else if(Head->next==Head)
	{
	cout<<"\n DELETED ELEMENT IS:"<<Head->value;
	Node *p=Head;
	Head=NULL;
	delete p;
	}
	else
	{
	cout<<"\n DELETED ELEMENT IS:"<<Head->value;
	Node *p=Head;
	Head=Head->next;	
	delete p;
	}
	Last->next=Head;
}
void display()
{
Node *tmp=Head;
while(tmp->next!=Head)
{
cout<<"|"<<tmp->value<<"|";
tmp=tmp->next;
}
cout<<"|"<<tmp->value<<"|";
}
void search()
{
int value;
bool flag=false;
cout<<"\n enter value:";
cin>>value;
Node *tmp=Head;
while(tmp->next!=Head)
{
if(value==tmp->value)
{
cout<<"\n found";
flag=true;
break;
}
tmp=tmp->next;

}
if(flag==false)
{
cout<<"\nNot found";
}

}
int main()
{
	
	int ch;
	do
	{
	cout<<"\n1. INSERT AT LAST";
	cout<<"\n2. INSERT AT FIRST";
	cout<<"\n3. DELETE AT FIRST";
	cout<<"\n4. DELTE AT LAST";
	cout<<"\n5. DISPLAY";
	cout<<"\n6. SEARCH";
	cout<<"\nENTER UR CHOICE:";	
	cin>>ch;
	switch(ch)
	{
	case 1: insert_at_last();
		break;
	case 2: insert_at_first();
		break;
	case 3: delete_at_first();
		break;
	case 4: delete_at_last();
		break;
	case 5: display();
		break;
	case 6: search();
		break;
	}
	}while(ch<=6);
}
