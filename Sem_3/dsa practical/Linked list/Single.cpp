#include<iostream>
using namespace std;

class Node
{
	public:
	int value;
	Node *next;
	
};
Node *Head=NULL;
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
	}
	else
	{
	Node *p=Head;
	while(p->next!=NULL)
	{
	p=p->next;
	}
	p->next=tmp;
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
	}
	else
	{
	tmp->next=Head;
	Head=tmp;
	}
}
void delete_at_last()
{
	if(Head==NULL)
	{
	cout<<"\n LINKED LIST IS EMPTY";
	}
	else if(Head->next==NULL)
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
	while(p->next!=NULL)
	{
	pr=p;
	p=p->next;
	}
	cout<<"\n DELETED ELEMENT IS:"<<p->value;	
	pr->next=NULL;
	delete p;
	}
}
void delete_at_first()
{
	if(Head==NULL)
	{
	cout<<"\n LI NKED LIST IS EMPTY";
	}
	else if(Head->next==NULL)
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

}
void insert_bet()
{
	int pos;
	cout<<"\n ENter ur position:";
	cin>>pos;
	Node *tmp=new Node;
	cout<<"\n enter value:";
	cin>>tmp->value;
	tmp->next=NULL;
	int i=1;
	Node *p=Head;
	Node *SV;
	while(i<pos-1)
	{
	p=p->next;
	i=i+1;
	}
	SV=p->next;
	p->next=tmp;
	tmp->next=SV;

}

void delete_bet()
{
	int pos;
	cout<<"\n ENter ur position:";
	cin>>pos;
	int i=1;
	Node *p=Head;
	Node *PR;
	while(i<pos)
	{
	PR=p;
	p=p->next;
	i=i+1;
	}
	PR->next=p->next;
	delete p;

}
void display()
{
Node *tmp=Head;
while(tmp!=NULL)
{
cout<<"|"<<tmp->value<<"|";
tmp=tmp->next;

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
	case 3: insert_bet();
		break;
	case 4: delete_at_first();
		break;
	case 5: delete_at_last();
		break;
	case 6: delete_bet();
		break;
	case 7: display();
		break;
	}
	}while(ch<=7);
}
