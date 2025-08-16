//SELECTION SORT::::
#include<iostream>
using namespace std;



int main(){

	int i,j,mini,temp;
	int arr[5]={2,54,7,46,41};
	
	for(i=0;i<4;i++){
		mini=i;
		for(j=i;j<5;j++){
		       if(arr[j]<arr[mini]){
				mini=j;
		       }

		}
		temp=arr[mini];
		arr[mini]=arr[i];
		arr[i]=temp;


	}

	printf("sorted array by selection sort\n");

	for(i=0;i<5;i++){
		cout<<" "<<arr[i];
	}



}