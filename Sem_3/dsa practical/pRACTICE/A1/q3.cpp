#include <iostream>
using namespace std;
int main()
{

    int arr[3][3];
    cout << "Enter the elements of the array:";
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            cin >> arr[i][j];
        }
    }
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            cout << arr[i][j] << " " << endl;
        }
    }

    cout << "Results:";
    int c = 0;

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            if (arr[i][j] == 0)
            {
                c++;
            }
        }
    }
    if (c > (3 * 3 / 2))
    {
        cout << "This is a sparsh matrix";
    }
    else
    {
        cout << "This is not  a sparsh matrix";
    }
    return 0;
}
