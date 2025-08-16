awk '$3 > 30 { print $0 ;} ' food.txt

echo "\n"

echo "hello"

awk '$3 < 30 { printf "%s\t%s\n", $0,"**" ; } ' food.txt
