#include<iostream>
using namespace std;
class Node
{
    public:
    int value;
    Node *next;
    Node *prev;
};
Node *head=NULL;
Node *last=NULL;
void insert_at_last()
{
    Node *temp=new Node();
    int no;
    cout<<"Enter the value you want to enter in the linked list:";
    cin>>no;
    temp->next=NULL;
    temp->prev=NULL;
    temp->value=no;
    if(head==NULL)
    {
        head=temp;
        head->next=head;
        head->prev=head;
        last=head;
    }
    else{
        last->next=temp;
        temp->prev=last;
        last=temp;
        temp->next=head;
        head->prev=last;
    }
}

void insert_at_first()
{
    int no;
    cout<<"Enter a number:";
    cin>>no;
    Node *temp=new Node();
    temp->next=NULL;
    temp->prev=NULL;
    temp->value=no;
    if(head==NULL)
    {
        head=temp;
        temp->next=head;
        temp->prev=head;
        last=head;
    }
    else{
        temp->next=head;
        head->prev=temp;
        head=temp;
        last->next=head;
        head->prev=last;
    }
}
void delete_at_last()
{
if(head==NULL)
{
    cout<<"The linked list is empty";
}
else if(head->next==NULL) 
{
    cout<<"The deleted element is "<<head->value;
    Node *p=head;
    head=NULL;
    delete p;
}
else{
    Node *p=head;
    Node *pr;
    while(p->next!=head)
    {
        pr=p;
        p=p->next;
    }
    cout<<"Deleted element is "<<p->value;
    last=pr;
    last->next=head;
    head->prev=last;
    delete p;
}
}
void delete_at_firsst()
{
    if(head==NULL)
    {
        cout<<"The linked list is empty";
    }
    else if(head->next!=NULL)
    {
        cout<<"The deleted element is"<<head->value;
        Node *p=head;
        head=NULL;
        delete p;
    }
    else{
        cout<<"the deleted element is "<<head->value;
        Node *p =head;
        head=head->next;
        head->prev=last;
        last->next=head;
        delete p;
    }
}
void insert_btw()
{
    int no,val;
    cout<<"Enter the position to enter the value:";
    cin>>no;
    cout<<"Enter the value:";
    cin>>val;
    Node *temp=new Node();
    temp->value=val;
    temp->next=NULL;
    temp->prev=NULL;
    int i=1;
    Node *p=head;
    Node *sv;
    while(i<no-1)
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
void delete_btw()
{
    int pos;
    cout<<"Enter the position you want to delete in btw:";
    cin>>pos;
    Node *p=head;
    Node *pr,*sv;
    int i=1;
    while(i<pos)
    {
        pr=p;
        p=p->next;
        i++;
    }
    sv=p->next;
    pr->next=sv;
    sv->prev=pr;
    delete p;
}
void display_next()
{
    Node *temp=head;
    while(temp->next!=head)
    {
        cout<<"|"<<temp->value<<"|";
        temp=temp->next;
    }
    cout<<"|"<<temp->value<<"|";
}
int main(){

	int ch;
	do
	{
	cout<<"\n1. INSERT AT LAST";
	cout<<"\n2. INSERT AT FIRST";
	cout<<"\n3. INSERT IN BETWEEN";
	cout<<"\n4. DELETE AT FIRST";
	cout<<"\n5. DELTE AT LAST";
	cout<<"\n6. DELETE IN BETWEEN";
	cout<<"\n7. DISPLAY NEXT";
	cout<<"\nENTER UR CHOICE:";	
	cin>>ch;
	switch(ch)
	{
	case 1: insert_at_last();
		break;
	case 2: insert_at_first();
		break;
	case 3: insert_btw();
		break;
	case 4: delete_at_firsst();
		break;
	case 5: delete_at_last();
		break;
	case 6: delete_btw();
		break;
	case 7: display_next();
		break;
	}
	}while(ch<=7);
return 0;
}
