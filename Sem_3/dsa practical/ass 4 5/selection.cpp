#include <iostream>
using namespace std;
int main()
{
   int array[100], n, c, d, position, swap;

   cout << "Enter number of elements";
   cin >> n;

   cout << "Enter the number of elememnts:\n";
   for (c = 0; c < n; c++)
      cin >> array[c];

   for (c = 0; c < (n - 1); c++)
   {
      position = c;

      for (d = c + 1; d < n; d++)
      {
         if (array[position] > array[d])
            position = d;
      }
      if (position != c)
      {
         swap = array[c];
         array[c] = array[position];
         array[position] = swap;
      }
   }

   cout << "\n elements after swapping:";

   for (c = 0; c < n; c++)
      cout << "\n"
           << array[c];

   return 0;
}
