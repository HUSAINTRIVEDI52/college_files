<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="" method="post">
        Enter your name:<input type="text" name="name"/>
        <input type="submit" name="submit">
</form>
<?php
echo "<h1>Simple greeting page</h1>";
if(isset($_POST['submit']))
{
    $name=$_POST['name'];
    echo "<p> Welcome to the page $name";
}

?>

    
</body>
</html>