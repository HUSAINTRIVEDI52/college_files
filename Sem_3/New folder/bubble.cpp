#include<iostream>
using namespace std;

// void bubble_sort();
void bubble_sort(int a[10]){
    int i,j,temp;
         for(i=0;i<10;i++){
            for(j=i+1;j<10;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
}
}
}
int main(){
    int arr[10]={2,7,8,6,5,4,3,8,10,1};
    bubble_sort(arr);
    for(int i =0 ; i < 10 ; i++){
        cout<<" "<<arr[i];
    }

    return 0;
}