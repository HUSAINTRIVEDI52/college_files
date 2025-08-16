#include<iostream>
using namespace std;
#define row 3
#define col 3

int printmat(int mat[row][col])
{
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            cout<<mat[i][j]<<" ";
        }
        cout<<endl;    }
return 0;
}
int addmat(int mat1[row][col],int mat2[row][col],int result[row][col])
{
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
             result[i][j]=mat1[i][j]+mat2[i][j];
        }
    }

}
int submat(int mat1[row][col],int mat2[row][col],int result[row][col])
{
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            result[i][j]=mat1[i][j]-mat2[i][j];
        }
    }

}
int mulmat(int mat1[row][col],int mat2[row][col],int result[row][col])
{
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            result[i][j]=mat1[i][j]*mat2[i][j];
        }
    }

    
   
}
int addition(int mat[row][col])

{
    int sum=0;
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
          sum+=mat[i][j];  
        }
      }
      return sum;
}
int transpose(int arr[row][col],int trans[row][col])
{
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            trans[i][j]=arr[j][i];
        }
    }
   
}
int main(){
int mat1[row][col]={
    {1,2,3},
    {4,5,6},
    {7,8,9},
};
int mat2[row][col]={
    {2,1,3},
    {4,5,3},
    {6,7,4}
};
int result[row][col];
int trans[row][col];
printmat(mat1);
cout<<"The adition of both matrix is"<<endl;
addmat(mat1,mat2,result);
printmat(result);
cout<<"The multiplication of both the matrix is"<<endl;
mulmat(mat1,mat2,result);
printmat(result);
cout<<"The subtraction of both the matrix is"<<endl;
submat(mat1,mat2,result);
printmat(result);
cout<<"The addition of the matrix is "<<endl;
cout<<(addition(mat1))<<endl;

cout<<"The transpose of the matrix is"<<endl;
transpose(mat1,trans);
printmat(trans);
return 0;
}
