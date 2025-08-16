echo "If...else"
awk 'BEGIN {
     num = 11
	 if( num%2 == 0) 
		printf "%d is even number \n" , num
	else 	printf  "%d is odd number \n" , num 
	}'
