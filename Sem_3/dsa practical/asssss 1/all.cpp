#include <iostream>
using namespace std;

// Convert a matrix to its diagonal form
void convertdia(int matrix[3][3]) {
    cout << "Diagonal matrix:" << endl;
    int arr[3][3] = {0}; // Initialize a matrix with all zeros
    
    // Copy diagonal elements
    for (int i = 0; i < 3; i++) {
        arr[i][i] = matrix[i][i];
    }
    
    // Update the original matrix with diagonal matrix values
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            matrix[i][j] = arr[i][j];
        }
    }
    
    // Print the diagonal matrix
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            cout << matrix[i][j] << " "; // Added space for readability
        }
        cout << endl;
    }
}

// Convert a matrix to its upper triangular form
void convupp(int mat[3][3]) {
    cout << "Upper triangular matrix:" << endl;
    
    // Set elements below the main diagonal to 0
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < i; j++) {
            mat[i][j] = 0;
        }
    }
    
    // Print the upper triangular matrix
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            cout << mat[i][j] << " "; // Added space for readability
        }
        cout << endl;
    }
}

int main() {
    int arr[3][3] = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    int brr[3][3] ={
        {3,2,1},
        {4,5,6},
        {7,8,9},
    };

    // Convert to diagonal matrix
    convertdia(arr);
    
    // Convert the already diagonal matrix to upper triangular form
    convupp(brr);

    return 0;
}
