echo " Conditional Statements" 
awk 'BEGIN {
	i=10 ; j=20
	if (i < 10)
		print i
	else
		print j
	}'
