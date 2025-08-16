// 5. Write a data structure program that will convert infix string into postfix string
#include<iostream>
#include<stack>
// #include<cctype>
// #include<cstring>a+(b*c-c)/d

using namespace std;
#define n 100
int priority(char sym)
{
    if(sym=='^')
    {
        return 3;
    }
    else if(sym=='*' || sym=='/' || sym=='%')
    {
         return 2;
    }
    else if(sym=='+' || sym=='-')
    {
        return 1;
    }
    else return 0;

}

int pretopost(const char* infix)
{
   string postfix="";
stack<char> st;
    for(int i=0;infix[i];i++)
    {
        char ch= infix[i];

        if(isalnum(ch))
        {
            postfix+=ch;
        }
        else if(ch == '(')
        {
            st.push(ch);
        }
        else if(ch==')')
         {
            while(!st.empty() && st.top()!='(')
            {
                postfix+=st.top();
                st.pop();
            }
            if(!st.empty()) st.pop();
         }
         else{
            while(!st.empty() && priority(ch)<=priority(st.top()))
            {
                postfix+=st.top();
                st.pop();
            }
            st.push(ch);
         }  
    }
    while(!st.empty())
    {
        postfix+=st.top();
        st.pop();
    }
    cout<<"postfix Impression  "<<postfix<<endl;
};
int main()
{
char infix[100];
cout<<"Enter an infix impression:";
cin.getline(infix,100);
pretopost(infix);
}