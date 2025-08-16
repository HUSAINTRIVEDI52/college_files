#sed Command
echo "______________________"
#Replacing or substituting string
sed 's/unix/linux/' file1.txt
echo "______________________"

#Replacing the nth occurence of a pattern in a line
sed 's/unix/linux/3' file1.txt
echo "______________________"

#Replacing all the occurence of the pattern in a line
sed 's/unix/linux/g' file1.txt
echo "______________________"

#Replacing from nth occurences to all occurrences in a line
sed 's/unix/linux/2g' file1.txt
echo "______________________"

#Changing the slash(/) delimiter
sed 's/http:/www./' file1.txt
echo "______________________"

#Using & as the matched string
sed 's/unix/{www}/' file1.txt













