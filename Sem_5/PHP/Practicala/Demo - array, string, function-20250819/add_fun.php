//Create a form which takes two numbers from user. Perform addition of two numbers using function. 
<?php
    function addNumbers($a, $b) {
        return $a + $b;
    }

    if (isset($_POST['submit'])) {
        $n1 = $_POST['num1'];
        $n2 = $_POST['num2'];
        echo "<h3>Sum = " . addNumbers($n1, $n2) . "</h3>";
    }
    ?>
<html>
<head>
    <title>Add Numbers</title>
</head>
<body>
    <h2>Add Two Numbers</h2>
    <form method="post">
        Enter First Number: <input type="number" name="num1"><br><br>
        Enter Second Number: <input type="number" name="num2"><br><br>
        <input type="submit" name="submit" value="Add">
    </form>

   
</body>
</html>
