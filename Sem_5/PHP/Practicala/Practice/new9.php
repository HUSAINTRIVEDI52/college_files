<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

<?php

    $greet=date("H");
// <h2>
    if($greet>=5 && $greet <12){
        echo "Good morning";

    }else if(greet>=12 &&$greet <=18){
        echo "Good afternoon";
    }else{
        echo "Good evening";
    }
    // </h2>
?>
    
</body>
</html>