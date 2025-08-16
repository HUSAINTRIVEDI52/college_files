// Write a program that will perform following operations on single dimension array:
// •count odd elements••count even elements••count prime numbers

#include<iostream>
using namespace std;
    void isprime(int arr[6])
    {
    int count=0;
    for(int i=2;i<6/2;i++)
    {
        if(arr[i]%2==0)
        {
            count++;
            break;
        }

    }
    
    }
int main(){
    int even=0;
    int odd=0;
    int prime=0;
    int arr[6]={1,2,3,4,5,6};
    // void isprime
    for(int i=0;i<6;i++)
    {
        if(i%2==0)
        {
            even++;
        }
        else if(i%2!=0)
        {
            odd++;
            
        }
    
    }
    // if(isprime(arr[arr[6]]))
    cout<<"Even"<<even;
    cout<<"odd"<<odd;

return 0;
}
