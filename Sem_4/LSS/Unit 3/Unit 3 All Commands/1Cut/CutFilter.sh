echo "List without ranges(index number)"
cut -b 1,2,3 CutSampleText.txt

echo "\n"
echo "List with ranges"
cut -b 1-3,5-7 CutSampleText.txt

echo "\n"
echo "In this, 1- indicate from 1st byte to end byte of a line"
cut -b 7- CutSampleText.txt

echo "\n"
echo "To cut by character use the -c option"
cut -c 2,5,7 CutSampleText.txt

echo "\n"
echo "cut command that prints first seven characters of each line from the file."
cut -c 1-7 CutSampleText.txt


echo If -d option is used then it considered space as a field separator or delimiter:
#cut -f 1 CutSampleText.txt

echo "\n"
echo "Cuts from the first appearance of delimiter"
cut -d " " -f 1 CutSampleText.txt

echo "\n"
echo Command prints field from first to fourth of each line from the file.
cut -d " " -f 1-4 CutSampleText.txt
