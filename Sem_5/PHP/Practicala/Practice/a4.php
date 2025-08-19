<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="" method="post">
        enter a number:<input name="num" type=text>
        <input type=submit name='submit'>
</form>
<?php
    if(isset($_POST['submit'])){
        $num=intval($_POST['num']);
        $rev=strrev($num);
        if($num==$rev){
            echo "THis is palindrome number";
        }else{
            echo "THis is not a palindrome number";
        }
    }
?>
    
</body>
</html>