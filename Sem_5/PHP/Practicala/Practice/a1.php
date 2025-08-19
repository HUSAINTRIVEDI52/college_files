<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h2>Check if a number is positive or negative. Genrate random number in textbox.</h2>
    <form action="" method="post">
       Number: <input type=text name="check">
        <button type=sumbit name="submit">submit</button>
</form>

<?php
        if(isset($_POST['submit'])){
            $check=intval($_POST['check']);
            if($check<0){
                echo "Number is nagative";
            }else {
                echo "Number is positive";
            }
        }
    ?>
    
</body>
</html>