#include<iostream>
using namespace std;
class Node
{
    public:
    int value;
    Node *next;
};


int main(){
Node *First =new Node();

Node *Second = new Node();

Node *Third =new Node();

First->value=100;
Second->value=200;
Third->value=300;

First->next=Second;
Second->next=Third;
Third->next=NULL;

Node *Temp =First;
Temp=First;
while(Temp!=NULL)
{
    cout<<"\n|"<<Temp->value<<"|"<<Temp->next<<"|";
    Temp=Temp->next;
}


return 0;
}
