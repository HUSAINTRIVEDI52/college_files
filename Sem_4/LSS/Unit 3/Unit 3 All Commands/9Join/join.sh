echo "join two files"
join foodtypes.txt color.txt

echo"___________________"

echo "join files on diffrent fields"
join -1 1 -2 2 foodtypes.txt review.txt 

# not working
#join -1 2 -2 1 foodtypes.txt review.txt
