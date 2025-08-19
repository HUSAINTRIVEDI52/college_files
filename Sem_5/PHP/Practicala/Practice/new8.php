<?php


$var1= "Apple";
$var2= "Banana";
$var3 = "Pineapple";

echo "Using isset<br>";
echo $var1 .(isset($var1)? " Set " : " Not set " ). "<br>";
echo $var2 .(isset($var2)? " Set ": " Not set "). "<br>";
echo $var3 .(isset($var3)? " Set " : " Not set "). "<br>";

echo "Empty Functions<br>";
echo $var1 .(empty($var1)? " Set " : " Not Set "). "<br>";
echo $var2 .(empty($var2)? " Set " : "Not Set "). "<br>";
echo $var3 .(empty($var3)? " Set " : " Not Set"). "<br>";
?>
