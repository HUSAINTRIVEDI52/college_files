#include<iostream>
using namespace std;
class Node
{
    public:
    int value;
    Node *next;
};
Node *head=NULL;
void insert_at_first()
{
    int no;
    cout<<"Enter a value:";
    cin>>no;
    Node *temp=new Node;
    temp->value=no;
    if(head==NULL)
    {
        temp->next=head;
    }else{
        temp->next=head;
head=temp;
    }
}
void insert_At_last()
{
    int no;
    cout<<"Enter a value";
    cin>>no;
    Node*temp=new Node;
    temp->value=no;
    if(head==NULL)
    {
        head=temp;
    }else{
        Node *p=head;
        while(p->next!=NULL)
        {
            p=p->next;
        }
        p->next=temp;
    }
}
void delete_at_first()
{
    if(head==NULL)
    {
        cout<<"The linked list is empty";
    }else if(head->next==NULL)
    {
        Node *p=head;
        // head=head->next;
        head=NULL;
        delete p;
    }else{
        Node *p=head;
        cout<<"deleted element is"<<head->value;
        // head=NULL;
        head=head->next;
        delete p;
    }
}
void delete_at_last()
{
    if(head==NULL)
    {
        cout<<"The linked list is empty";
    }else if(head->next==NULL)
    {
        cout<<"The deleted element is"<<head->value;
        Node *p=head;
        head=NULL;
        delete p;
    }else{
        
        Node *p=head;
        cout<<"The deleted element is"<<head->value;
        head=head->next;
        delete p;
    }
}
void insert_btw()
{
    Node *temp=new Node;
    int no,pos,i=1;
    cout<<"Emter the position:";
    cin>>pos;
    cout<<"Enter the value:";
    cin>>no;
    Node *p=head;
    Node *sv;
    while(i<pos-1)
    {
        p=p->next;
        i++;
    }
    sv=p->next;
    p->next=temp;
    temp->next=sv;
}
void delete_at_btw()
{
    int i=0;
    Node *p=head;
    Node *pr;
    int no,pos;
    cout<<"Enter the position to delete";
    cin>>no;
    while(i<pos)
    {
        pr=p;
        p=p->next;
        i++;
    }
    p->next=pr->next;
    delete p;
}
void display()
{
    Node *temp=head;
    while(head!=NULL)
    {
        cout<<"|"<<temp->value<<"|";
        temp=temp->next;
    }
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
	cout<<"\n7. DISPLAY";
	cout<<"\nENTER UR CHOICE:";	
	cin>>ch;
	switch(ch)
	{
	case 1: insert_At_last();
		break;
	case 2: insert_at_first();
		break;
	case 3: insert_btw();
		break;
	case 4: delete_at_first();
		break;
	case 5: delete_at_last();
		break;
	case 6: delete_at_btw();
		break;
	case 7: display();
		break;
	}
	}while(ch<=7);
return 0;
}
