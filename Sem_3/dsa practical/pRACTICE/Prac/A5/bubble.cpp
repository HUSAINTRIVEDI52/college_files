#include<iostream>
using namespace std;
int sorts(int arrrr[10])
{
    int temp;
    for(int i=0;i<10;i++)
    {
        for(int j=0;j<10;j++)
        {
            if(arrrr[i]>arrrr[j])
            {
                temp=arrrr[i];
                arrrr[i]=arrrr[j];
                arrrr[j]=temp;
            }
        }
    }
    return arrrr[10];
}
int main(){
    int arr[10];
    cout<<"Before sorting of array is:";
    for(int i=0;i<10;i++)
    cin>>arr[i];

    sorts(arr);
    cout<<"\nArray After sorting:";
    for(int i=0;i<10;i++)
    {
        cout<<" "<<arr[i];
    }


return 0;
}
