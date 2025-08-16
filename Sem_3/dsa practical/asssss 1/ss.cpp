#include<iostream>
using namespace std;
#define x 10
#define y 10
class sp
{
int arr[x][y];
int r,c;
public:
int rowc()
{
    cout<<"Enter the size of rows:";
    cin>>r;

    cout<<"Enter the size of the column:";
    cin>>c;
}
void arrin()
{
    cout<<"Enter the elements of the array:";
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            cout<<"Enter the element ";
            cout<<"["<<i<<"]["<<j<<"]";
            cin>>arr[i][j];
        }
    }
}
void spsarshchec()
{
    int zero=0;
    int nonzero=0;
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            if(arr[i][j]==0 )
            {
                zero++;
            }
            else{
                nonzero++;
            }
        }
    }
    cout<<"zero"<<zero<<endl;
    cout<<"nonzero"<<nonzero<<endl;
    if(zero>nonzero)
    {
        cout<<"This is a sparsh matrix\n";
        convertsparsh(nonzero);
    }
    else{
        cout<<"This is mot a sparsh matrix\n";
    }
}
void convertsparsh(int n)
{
int spar[n+1][3];
int k=1;
spar[0][0]=r;
spar[0][1]=c;
spar[0][2]=n;
for(int i=0;i<r;i++)
{
    for(int j=0;j<c;j++)
    {
        if(spar[i][j]!=0)
        {
            spar[k][0]=i;
            spar[k][1]=j;
            spar[k][2]=arr[i][j];
            k++;
        }
    }
}
cout<<"The converted matrix is \n";
for(int i=0;i<k;i++)
{
    for(int j=0;j<3;j++)
    {
        cout<<spar[i][j]<<" ";
    }
    cout<<endl;
}
}
};
int main(){
sp s1;
s1.rowc();
s1.arrin();
s1.spsarshchec();
return 0;
}
