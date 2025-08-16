#include<iostream>
using namespace std;
class node
{
    public:
    int value;
    node *next;
};


int main(){
node *First =new node();

node *Second = new node();

node *Third=new node();


First->value=10;
Second->value=20;
Third->value=30;

First->next=Second;
Second->next=Third;
Third->next=NULL;

node *temp=First;
while(temp!=NULL)
{
    cout<<"\n"<<temp->value;
    temp=temp->next;
}
// temp=First;

return 0;
}

