#include <iostream>
using namespace std;
// #include<conio.h>
int arr[9] = {3, 2, 5, 6, 7, 1, 8, 4, 9};
void mergesort(int arr[], int low, int high);
void merge(int arr[], int low, int mid, int high);
void main()