#include <iostream>
using namespace std;
#define x 10
#define y 10

class fun {
    int arr[x][y];
    int r, c;

public:
    void rc() {
        cout << "Enter the number of rows: ";
        cin >> r;

        cout << "Enter the number of columns: ";
        cin >> c;
    }

    void input() {
        cout << "Enter the elements of the array:\n";
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                cout << "Enter the element [" << i << "][" << j << "]: ";
                cin >> arr[i][j];
            }
        }
    }

    void identity() {
        if (r != c) {
            cout << "This is not an identity matrix because it is not a square matrix.\n";
            return;
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == j) {
                    if (arr[i][j] != 1) {
                        cout << "This is not an identity matrix.\n";
                        return;
                    }
                } else if (arr[i][j] != 0) {
                    cout << "This is not an identity matrix.\n";
                    return;
                }
            }
        }

        cout << "This is an identity matrix.\n";
    }
};

int main() {
    fun f1;
    f1.rc();
    f1.input();
    f1.identity();
    return 0;
}
