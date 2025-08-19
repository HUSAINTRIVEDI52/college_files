<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
        <form action="" method="post">
            Enter a string:<input type=text name='str'>
            <input type='submit' name='case' value="convert">


    <?php
        // function tolower($s){
        //     return strtolower($s);
        // }
        // function toupper($s){
        //     return strtoupper($s);
        // }
        if(isset($_POST['case'])){
            $s=$_POST['str'];
            echo "<h3> UpperCase:" . strtolower($s)  . "</h3>";
            echo "<h3> Lowercase:" . strtoupper($s)  . "</h3>";
        }
    ?>
</body>
</html>