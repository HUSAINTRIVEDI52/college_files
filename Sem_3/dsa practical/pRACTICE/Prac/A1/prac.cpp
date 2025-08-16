#include <iostream>
using namespace std;

void displayRowSums(int A[5][6]) {
    for (int i = 0; i < 5; ++i) {
        int sum = 0;
        for (int j = 0; j < 6; ++j) {
            sum += A[i][j];
        }
        cout << "Sum of elements in row " << i + 1 << ": " << sum << endl;
    }
}

int main() {
    int A[5][6] = {
        {1, 2, 4, 6, 0, 0},
        {5, 7, 2, 9, 0, 0},
        {6, 8, 3, 5, 0, 0},
        {7, 9, 4, 7, 0, 0},
        {0, 0, 0, 0, 0, 0}
    };

    // Calculating sums and placing them in the last column
    for (int i = 0; i < 4; ++i) {
        int sum = 0;
        for (int j = 0; j < 4; ++j) {
            sum += A[i][j];
        }
        A[i][4] = sum; // Placing sum in the fifth column
    }

    // Adding calculated sums to the last row for the last column
    for (int j = 0; j < 4; ++j) {
        A[4][j] = A[0][j] + A[1][j] + A[2][j] + A[3][j];
    }

    displayRowSums(A);

    return 0;
}
