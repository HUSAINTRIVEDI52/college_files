using namespace std;
#include<iostream>

#define Max 25

int stack[Max];
int top = -1;
int pop();
void push(int);

int main()
{
	char postfix[25];
	int x,y,i = 0,ans = 0;
	cout<<"Enter A Postfix Expression:..";
	cin>>postfix;
	while(postfix[i]!='\0')
	{
		if((postfix[i] == '+') || (postfix[i] == '-') || (postfix[i] == '*') || (postfix[i] == '/'))
		{
			switch(postfix[i])
			{
				case '+':
				x = pop();
				y = pop();
				ans = x + y;
				push(ans);
				break;

				case '-':
				x = pop();
				y = pop();
				ans = x - y;
				push(ans);
				break;

				case '*':
				x = pop();
				y = pop();
				ans = x * y;
				push(ans);
				break;

				case '/':
				x = pop();
				y = pop();
				ans = x / y;
				push(ans);
				break;

				default:
				printf("\nNo Matching");
			}
		}
		else
		{
			push(postfix[i]-'0');
		}
		i++;
	}
	cout<<"Evaluation Is:"<<ans;
}

void push(int p)
{
	top=top+1;
	stack[top] = p;
	cout<<"\n stack is:\n";
	for(int i=top;i>=0;i--)
	{
	cout<<"\n |"<<stack[i]<<"|";
	}
}

int pop()
{
	
	int item=stack[top];
	top=top-1;
	return item;
}
