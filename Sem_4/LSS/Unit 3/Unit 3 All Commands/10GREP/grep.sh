# Searching for  a string in a file
echo "___________________"
grep "admin" file.txt 
echo "___________________"
#Searching for a string in multiples files
grep "admin"  file.txt file_1.txt 
echo "___________________"
#Case  insensitive search
grep -i "AdMin" file.txt 
echo "___________________"
#Inversing the pattern match (Display all the lines except the lines which include "admin")
grep -v "admin" file.txt 
echo "___________________"
#Displaying Line numbers
grep -n "admin" file.txt
echo "___________________"
#Counting the lines containing the pattern
grep -c "admin" file.txt
echo "___________________"
#case match the pattern
grep -w "Admin" file.txt
echo "___________________"
#case match the pattern
grep -w "admin" file.txt
echo "___________________"
#Displaying Filenames
grep -l "admin" *.txt
echo "___________________"
#Diplay the filename which do not contain the matched pattern
grep -L "admin" *.txt
echo "___________________"
#Display the lines which matches all the given patterns
--
echo "___________________"
