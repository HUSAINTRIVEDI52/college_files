#include<iostream>
using namespace std;

class Node
{
	public:
	in;
	Node *next;t value
};

int main()
{
	Node *First=new Node();
	cout<<"\nAddress of first node is:"<<First;
	Node *Second=new Node();
	cout<<"\nAddress of first node is:"<<Second;
	Node *Third=new Node();
	cout<<"\nAddress of first node is:"<<Third;
	First->value=10;
	Second->value=20;
	Third->value=30;
	
	First->next=Second;
	Second->next=Third;
	
	
	
	
}




















