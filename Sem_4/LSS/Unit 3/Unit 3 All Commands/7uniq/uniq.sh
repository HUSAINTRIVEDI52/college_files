echo supperss duplicate lines
uniq data.txt
echo "\n"

echo Count of lines
uniq -c data.txt
echo "\n"

echo Display only duplicate lines
uniq -d data.txt
echo "\n"

echo Print only unique lines
uniq -u data.txt
echo "\n"

echo "ignore the case"
uniq -i data.txt
echo "\n"

echo "all the duplicate lines"
uniq -D data.txt
