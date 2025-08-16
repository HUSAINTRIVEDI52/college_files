echo "\n Print 1st and 3rd column"
awk '{print $1 "\t" $3 }' marks.txt

echo "\nPrint Columns in any order"
awk '{print $4 "\t" $1}' marks.txt

echo "\n Print Lines with more than 30 characters"
awk 'length > 30' marks.txt
