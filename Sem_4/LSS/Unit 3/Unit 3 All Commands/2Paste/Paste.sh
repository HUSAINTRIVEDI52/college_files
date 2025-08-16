echo The paste command writes corresponding lines from the files with tab as a deliminator on the terminal.

paste number state capital

echo Only one character is specified
paste -d "|" number state capital

echo "space,|,space"
paste -d " | " number state capital

echo More than one character is specified
paste -d "|," number state capital

echo We can merge the files in sequentially manner using the -s option
paste -s number state capital

echo prints in sequential manner and delimentator  
paste -s -d ":" number state capital






