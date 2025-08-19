<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="" method="post">
        Subject 1:<input type=text name="sub1"><br>
        Subject 2:<input type=text name="sub2"><br>
        Subject 3:<input type=text name="sub3"><br>
        <button type=submit name="submit">Calculate result</button>

        <?php
            if(isset($_POST['submit'])){
                $sub1=intval($_POST['sub1']);
                $sub2=intval($_POST['sub2']);
                $sub3=intval($_POST['sub3']);
                $percent=($sub1+$sub2+$sub3)/3;
                echo "<br>The percentage of the candidate is ". $percent;
            }
        ?>
</form>
    
</body>
</html>