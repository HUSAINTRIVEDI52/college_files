#include<iostream>
using namespace std;
class Node
{
    public:
    int value;
    Node *next;
};

Node *head=NULL;
Node *last=NULL;


void insert_at_last()
{
    Node *temp=new Node();
    temp->next=NULL;
    int no;
    cout<<"enter a number:";
    cin>>no;
    temp->value=no;
    if(head==NULL)
    {
        head=temp;
        temp->next=head;
        last=head;
    }
    else{
        Node *p=head;
        while(p->next!=NULL)
        {
            p=p->next;
        }
        p->next=temp;
        last=temp;
        last->next=head;
    }
}

void insert_at_first()
{
    int no;
    Node *temp=new Node();
    temp->next=NULL;
    cout<<"Enter a number:";
    cin>>no;
    temp->value=no;
    if(head==NULL)
    {
        head=temp;
        temp->next=head;
        last=temp;
    }
    else{
        temp->next=head;
        head=temp;
    }
last->next=head;
}

void delete_At_last()
{
    if(head==NULL)
    {
        cout<<"Linked list is empty";
    }
    else if(head->next==head)
    {
        cout<<"the deleted element is"<<head->value;
        Node *p=head;
        head=NULL;
        delete p;
    }
    else
    {
        Node *p=head;
        Node *pr=NULL;
        while(head->next!=head)
        {
            p=pr;
            p=p->next;
        }
        cout<<"deleted element is"<<p->value;
        pr->next=head;
        last=pr;
        delete p;
    }
    last->next=head;
}
void delete_at_first()
{
    if(head==NULL)
    {
        cout<<"Linked list is empty";
    }
    else if(head->next=head)
    {
        cout<<"The deleted element is"<<head->value;
        Node *p=head;
        head=NULL;
        delete p;
    }
    else{
        cout<<"The deleted element is "<<head->value;
        Node *p=head;
        head=head->next;
        delete p;
    }
    last->next=head;
}
void display()
{
    Node *temp=head;
    if(head->next!=head)
    {
        cout<<"|"<<temp->value<<"|";
        temp=temp->next;
    }
    cout<<"|"<<temp->value<<"|";
}
void search()
{
    int value;
    cout<<"Enter a value";
    cin>>value;
    bool flag=false;
    Node *temp=head;
    while(temp->next!=head)
    {
        if(value==temp->value)
        {
            cout<<"found";
            flag=true;
            break;
        }
        temp=temp->next;
    }
    if(flag==false)
    {
        cout<<"Not found";
    }
}
int main(){

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
	case 4: delete_At_last();
		break;
	case 5: display();
		break;
	case 6: search();
		break;
	}
	}while(ch<=6);

return 0;
}
