<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="" method="post">
    Name:<input type=text name="name"><br>
    Email<input type=email name="email"><br>
    phone number:<input type=text name="num"><br>
    password:<input type=text name="pass"><br>
    <input type="submit" name=submit><br>

    <?php
        if(isset($_POST['submit'])){
            
            $name=htmlspecialchars($_POST['name']);
            $email=htmlspecialchars($_POST['email']);
            $Num=intval($_POST['num']);
            $pass=htmlspecialchars($_POST['pass']); 

            echo 'Name:' . $name. "<br>";
            echo 'Email: ' . $email. "<br>";
            echo 'Number:' . $Num. "<br>";
            echo 'password:' . $pass. "<br>";

        }
    
    ?>




    </form>
    
</body>
</html>