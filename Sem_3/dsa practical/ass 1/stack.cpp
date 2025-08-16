#include<iostream>
using namespace std;
#define size 5
class Demo
{
	int stack[size];
	int top=-1;
	public:
	void PUSH()
	{
		if(top==size-1)
		cout<<"\n STack is FULL";
		
		else
		{
		int value;
		cout<<"\n enter value:";
		cin>>value;
		top=top+1;
		stack[top]=value;
		}
		
		
		
		
	
	}
	void POP()
	{
		if(top==-1)
		cout<<"\n STack is EMPTY";
		
		else
		{
		cout<<"\n Deleted element is:"<<stack[top];
		top=top-1;
		}
		
	
	}
	void PEEP()
	{
		if(top==-1)
		cout<<"\n STack is EMPTY";
		
		else
		{
		cout<<"\n Top element is:"<<stack[top];
	
		}
	
	
	}
	void display()
	{
		for(int i=top;i>=0;i--)
		{
		cout<<"\n |"<<stack[i]<<"|";
		}
	
	
	}
	
};
int main()
{
	Demo d1;
	int ch;
	do
	{
		cout<<"\n MENU";
		cout<<"\n 1 PUSH";
		cout<<"\n 2 POP";
		cout<<"\n 3 PEEP";
		cout<<"\n 4 DISPLAY";
		cout<<"\n 5 EXIT";
		cout<<"\n enter ur choice:";
		cin>>ch;
		switch(ch)
		{
		case 1:d1.PUSH();
		break;
		
		case 2:d1.POP();
		break;
		
		case 3:d1.PEEP();
		break;
		
		case 4:d1.display();
		break;
		
		case 5:exit(0);
		break;
		
		
		}
		
			
	}while(ch<=5);

}
