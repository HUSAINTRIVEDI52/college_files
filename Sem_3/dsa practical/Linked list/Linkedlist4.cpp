#include<iostream>
using namespace std;
class Node
{
    public:
    int value;
    Node *next;
};
void printlist(Node *temp)
{

while(temp!=NULL)
{
    cout<<"\n|"<<temp->value<<"|";
    temp=temp->next;
}
}
int main(){
Node *First=new Node();

Node *Second=new Node();

Node *Third=new Node();

First->value=12;
Second->value=13;
Third->value=14;

First->next=Second;
Second->next=Third;
Third->next=NULL;


printlist(First);


return 0;
}
