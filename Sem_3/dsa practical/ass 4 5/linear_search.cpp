// Searching
// 1)Linear / Sequential
// 2)Binary ---Array compulsory sorted /array half comarision serach 

#include<iostream>
using namespace std;

int main()
{
int a[100],i,n,item,found=0;

cout<<"\n------------ LINEAR SEARCH ------------ \n\n";
cout<<"Enter No. of Elements=";
cin>>n;

cout<<"\nEnter Elements=\n";
for(i=1;i<=n;i++)
{
cin>>a[i];
}

cout<<"\nEnter Element you want to Search=";
cin>>item;

for(i=0;i<n;i++)                       //Array Elements Comparsion with Item
{
if(a[i]==item)
{
cout<<"\nData is Found at Location : "<<i;
found=1;
break;
}
}

if(found==0)
{
cout<<"Data is Not Found";
}
return 0;
}
