#include<iostream>
#define M 10
#define N 10
using namespace std;
class DEMO
{
	int x[M][N];
	
	int r,c;
	public:
	void get()
	{
	cout<<"\n enter values for row and columns:";
	cin>>r>>c;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			cout<<"\n enter value:";
			cin>>x[i][j];

			}

		}

	}
	void put()
	{
	cout<<"\n MATRIX \n";
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			cout<<"\t"<<x[i][j];

			cout<<"\n";
		}

	}
	void checksparse()
	{
		int zeros=0,nonzeros=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			if(x[i][j]==0)
			zeros=zeros+1;
			//zeros++;
			else
			nonzeros++;//nonzeros=nonzeros+1;
			}
			
		}
		if(zeros>nonzeros)	
		{
		cout<<"\n Matrix is a sparse";
		sparseconvert(nonzeros);
		}
		else
		{
		cout<<"\n Matrix is not a sparse";
		}

	}
	void sparseconvert(int nz)
	{
		
		int sparse[nz+1][3];
		sparse[0][0]=r;
		sparse[0][1]=c;
		sparse[0][2]=nz;
		int k=1;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			if(x[i][j]!=0)
				{
				sparse[k][0]=i;
				sparse[k][1]=j;
				sparse[k][2]=x[i][j];
				k++;
				}

			}	

		}
		cout<<"\n output:\n";
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<3;j++)
			{
			cout<<"\t"<<sparse[i][j];
			}
			cout<<"\n";
		}
	}
	
	
};
int main()
{
	DEMO d1;
	d1.get();
	d1.put();
	d1.checksparse();
}
