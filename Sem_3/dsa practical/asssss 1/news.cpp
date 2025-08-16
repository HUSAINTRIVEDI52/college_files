#include<iostream>
using namespace std;
// #define size 3
void convertdia(int matrix[3][3])

{
cout<<"Diagoal matrix"<<endl;
    int arr[3][3]={0};
    for(int i=0;i<3;i++)
    {
         arr[i][i]=matrix[i][i];
    }
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            matrix[i][j]=arr[i][j];
        }
    }
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            // arr[i][j]=matrix[i][j];
            cout<<matrix[i][j]<<" ";
        }
        cout<<endl;
    }
}
void convupp(int mat[3][3])
{
    cout<<"Upper triangular matrix:"<<endl;
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<i;j++)
        {
            mat[i][j]=0;
        }
      }
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
            cout<<mat[i][j]<<" ";
        }
        cout<<endl;
      }
}
void lowertriangle(int arr[3][3])
{
    for(int i=0;i<3;i++)
    {
        for(int j=i+1;j<3;j++)
        {
                arr[i][j]=0;
        }
    }
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            cout<<arr[i][j]<<" ";
        }
        cout<<endl;
    }
}

int main(){
    
    int arr[3][3]={
    {1,2,3},
    {4,5,6},
    {7,8,9}
    };
    int brr[3][3]=
    {
        {1,3,2},
        {4,6,5},
        {9,8,7}
    };
    int crr[3][3]=
    {
        {3,3,3},
        {4,4,4},
        {5,5,5}
    };
convertdia(arr);
convupp(brr);
cout<<"Lower triangular"<<endl;
lowertriangle(crr);

return 0;
}
