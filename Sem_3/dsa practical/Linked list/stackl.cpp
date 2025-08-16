#include<iostream>
using namespace std;
//stack using linked list:PUSH, POP, PEEP, DISPLAY TOP POINTER
class node
{
	public:	
	int value;
	node* next;

};
node *TOP=NULL;
void PUSH()
{
	int x;	
	node *tmp=new node;
	cout<<"\n enter value to be inserted into stack?";
	cin>>x;
	tmp->value=x;
	tmp->next=NULL;
	if(TOP==NULL)
	{
	TOP=tmp;
	}
	else
	{
	tmp->next=TOP;
	TOP=tmp;	
	}
	

}
void POP()
{
	if(TOP==NULL)
	{
	cout<<"\n UNDERFLOW";
	}
	else
	{
	cout<<"\n ELEMENT TOBE deleted is:"<<TOP->value;	
	node *tmp=TOP;
	TOP=TOP->next;
	delete tmp;
	}
}
void PEEP()
{
	if(TOP==NULL)
	{
	cout<<"\n UNDERFLOW";
	}
	else
	{
	cout<<"\n TOP ELEMENT is:"<<TOP->value;	
	}

}
void DISPLAY()
{
	if(TOP==NULL)
	{
	cout<<"\n UNDERFLOW";
	}
	else
	{	
	node *tmp=TOP;
	while(tmp!=NULL)
	{
	cout<<"\n |"<<tmp->value<<" |";
	tmp=tmp->next;
	}
	}

}


int main()
{
	int ch;
	do
	{
	cout<<"\n MENU";
	cout<<"\n 1.PUSH";
	cout<<"\n 2.POP";
	cout<<"\n 3.PEEP";
	cout<<"\n 4.DISPLAY";
	cout<<"\n ENTER YOUR CHOICE:";
	cin>>ch;
	switch(ch)
	{
	case 1: PUSH();
	break;
	case 2: POP();
	break;
	case 3: PEEP();
	break;
	case 4: DISPLAY();
	break;
	}

	}while(ch<=4);
	






}
