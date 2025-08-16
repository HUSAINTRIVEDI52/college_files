#include<iostream>
using namespace std;
#define max 25
int stack[max];
int top=-1;
int pop();
int push(int);
int main(){
    char postfix[25];
    int x,y,i=0,ans=0;
    cout<<"Enter a postfix expression";
    cin>>postfix;
    while(postfix!='\0')
    {
        if((postfix[i]=='/') || (postfix[i]=='*') || (postfix[i]=='-') || (postfix[i]=='+')){
            switch(postfix[i])
            {
                case '+':
                x=pop();
                y=pop();
                ans=x+y;
                push(ans);
                break;

                case '-':
                x=pop();
                y=pop();
                ans=x-y;
                push(ans);
                break;

                case '/':
                x=pop();
                y=pop();
                ans=x/y;
                push(ans);
                break;

                case '*':
                x=pop();
                y=pop();
                ans=x*y;
                push(ans);
                break;
                
            }
        }else{
            push(postfix[i]-'\0');
        }
        i++;
    }
    cout<<"Evaluation is:"<<ans<<endl;

return 0;
}
int push(int p)
{
    top+=1;
    stack[top]=p;
    cout<<"Stack is";
    for(int  i=top;i>=0;i--)
    {
        cout<<"|"<<stack[i]<<"|";
    }
}

int pop()
{
    int item=stack[top];
    top+=1;
    return item;
}