<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>THis is question 5</h1>
    <form action="" method="post">

    Enter the first number: <input type="text" name ="num1" placholder="Hello">
    <br>
    <br>
    Enter the second number: <input type="text" name="num2" placholder="Hello">
    <br>
    <br>
    <button type="submit" name="Submit">Submit</button>
</form>

    <?php
            if(isset($_POST['Submit'])){
                $fnumber=(int)$_POST['num1'];
                $snumber=(int)$_POST['num2'];
                $add=$fnumber+$snumber;
                echo "<p>The additionnof the both vallues is $add</p>";
            }

    ?>
    
</body>
</html>