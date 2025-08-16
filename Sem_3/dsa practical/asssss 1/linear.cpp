#include<iostream>
using namespace std;
class fun
{
    public:
    void mat()
    {
        int mat[]={1,2,3,4,5};
        int srch=8;
        int n=5;
        int founditem=-1;
        for(int i=0;i<n;i++)
        {
            if(mat[i]==srch)
            {
                founditem=i;
                break;
            }
        }
        if(founditem!=-1)
        {
            for(int i=founditem;i>0;i--)
            {
                mat[i]=mat[i-1];
            }
            mat[0]=srch;
        }
        else{
            mat[n]=srch;
            ++n;
        }
        cout<<"Modified array";
        for(int i=0;i<n;i++)
        {
            cout<<mat[i];
        }
    }
};
int main(){
fun f1;
f1.mat();
return 0;
}
