#include <iostream>
using namespace std;

#define MAX 100

// Sparse matrix representation
int data[MAX][3];
int len = 0;

// Function to insert elements into the sparse matrix
void insert(int r, int c, int val) {
    data[len][0] = r;
    data[len][1] = c;
    data[len][2] = val;
    len++;
}

// Function to print the sparse matrix
void print() {
    cout << "\nDimension of Sparse Matrix: " << len << " x 3\n";
    cout << "Sparse Matrix:\nRow Column Value\n";
    for (int i = 0; i < len; i++) {
        cout << data[i][0] << " " << data[i][1] << " " << data[i][2] << "\n";
    }
}

int main() {
    int r = 5, c = 4;
    int a[5][4] = {
        {0, 1, 0, 0},
        {0, 0, 2, 0},
        {0, 3, 0, 0},
        {0, 0, 5, 0},
        {0, 0, 0, 4}
    };

    // Print the original matrix
    cout << "Matrix:\n";
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            cout << a[i][j] << " ";
        }
        cout << endl;
    }

    // Convert to sparse matrix
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            if (a[i][j] != 0) {
                insert(i, j, a[i][j]);
            }
        }
    }

    // Print the sparse matrix
    print();

    return 0;
}
