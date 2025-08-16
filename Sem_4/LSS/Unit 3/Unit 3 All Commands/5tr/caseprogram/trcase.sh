#lower to uppercase
echo "linux dedicated server" | tr "[a-z]" "[A-Z]"
# uppercase to lower
echo "LINUX DEDICATED SERVER " | tr "[A-Z]" "[a-z]"
# uppercase to lower in  file
 tr "[A-Z]" "[a-z]"  < uppercase.txt
# lowercase to uppercase in file
 tr "[a-z]" "[A-Z]"  < lowercase.txt
