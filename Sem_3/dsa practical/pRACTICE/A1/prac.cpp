#include <iostream>
using namespace std;

int main() {
    int size;

    // Input the size of the arrays
    cout << "Enter the size of the arrays: ";
    cin >> size;

    // Dynamically allocate memory for the arrays
    int* arr1 = new int[size];
    int* arr2 = new int[size];
    int* sum = new int[size];

    // Input elements of the first array
    cout << "Enter elements of the first array:\n";
    for (int i = 0; i < size; ++i) {
        cin >> arr1[i];
    }

    // Input elements of the second array
    cout << "Enter elements of the second array:\n";
    for (int i = 0; i < size; ++i) {
        cin >> arr2[i];
    }

    // Perform addition of the arrays
    for (int i = 0; i < size; ++i) {
        sum[i] = arr1[i] + arr2[i];
    }

    // Output the result
    cout << "Resultant array after addition:\n";
    for (int i = 0; i < size; ++i) {
        cout << sum[i] << " ";
    }
    cout << endl;

    // Free the dynamically allocated memory
    delete[] arr1;
    delete[] arr2;
    delete[] sum;

    return 0;
}
