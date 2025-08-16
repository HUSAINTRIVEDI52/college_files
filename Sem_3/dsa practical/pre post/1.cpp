#include <iostream>
#include <cctype>
#include <stack>
#include <string>
#define n 100
using namespace std;
char priority(char sym)
{
    if (sym == '^')
        return 3;
    else if (sym == '*' || sym == '/' || sym == '%')
        return 2;
    else if (sym == '+' || sym == '-')
        return 1;
    else
        return 0;
}
void pretopost(const char *infix)
{
    stack<char> st;
    string postfix = "";
    for (int i = 0; infix[i]; i++)
    {
        char ch = infix[i];

        if (isalnum(ch))
        {
            postfix += ch;
        }
        else if (ch == '(')
        {
            st.push(ch);
        }
        else if (ch == ')')
        {
            while (!st.empty() && st.top() != '(')
            {
                postfix += st.top();
                st.pop();
            }
            if (!st.empty())
                st.pop();
        }
        else
            {
        while (!st.empty() && priority(ch) <= priority(st.top()))
        {

                postfix += st.top();
                st.pop();
        }
        st.push(ch);
            }
    }
    while (!st.empty())
    {
        postfix += st.top();
        st.pop();
    }
    cout << "The postfix expression is " << postfix << endl;
}
int main()
{
    char infix[100];
    cout << "Enter an infix expression ";
    cin.getline(infix, 100);
    pretopost(infix);

    return 0;
}
