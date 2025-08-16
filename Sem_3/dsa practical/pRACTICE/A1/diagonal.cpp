#include <iostream>
using namespace std;
int main()
{
    int arr[3][3];
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            cout << "Enter the " << "[" << i << "][" << j << "] element";
            cin >> arr[i][j];
        }
    }
    int sum = 0;
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            if (i == j)
            {
                sum += arr[i][j];
            }
        }
    }
    cout<<"The sum of the diagonal element is "<<sum<<endl; 
    cout<<"The average of teh diagonal element is "<<sum/3;

    return 0;
}
