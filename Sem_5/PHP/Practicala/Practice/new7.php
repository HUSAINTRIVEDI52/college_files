<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h3>Develop a simple calculator in PHP that takes two numbers and an operator (+, -, , /) from a
form and displays the result</h3>

<form action="" method="get">
    Number:1<input type=text name="num1"><br><br>
    Number:2<input type=text name="num2"><br><br>

    <button type="submit"  name="add">add</button>
    <button type="submit"  name="sub">subtract</button>
    <button type="submit"  name="div">Divide</button>
    <button type="submit"  name="mul">Multiply</button>

    <?php
    if(isset($_GET['add'])){
        if(empty($_GET['num1']) && empty($_GET['num2'])){
            echo "Enter a number";
        }else{
            $add1=intval($_GET['num1']);
            $add2=intval($_GET['num2']);
            echo $add1 + $add2;
        }

    }

    if(isset($_GET['sub'])){
        if(empty($_GET['num1']) && empty($_GET['num2'])){
            echo "Enter a number";
        }else{
            $sub1=intval($_GET['num1']);
            $sub2=intval($_GET['num2']);
            echo $sub1 - $sub2;
        }
    }

    if(isset($_GET['div'])){
        if(empty($_GET['num1']) && empty($_GET['num2'])){
            echo "Enter a number";
        }else{
            $div1=intval($_GET['num1']);
            $div2=intval($_GET['num2']);
            echo $div1 / $div2;
        }
    }
    
    
    if(isset($_GET['mul'])){
        if(empty($_GET['num1']) && empty($_GET['num2'])){
            echo "Enter a number";
        }else{
            $div1=intval($_GET['num1']);
            $div2=intval($_GET['num2']);
            echo $div1 * $div2;
        }
    }

    ?>

</form>
</body>
</html>
