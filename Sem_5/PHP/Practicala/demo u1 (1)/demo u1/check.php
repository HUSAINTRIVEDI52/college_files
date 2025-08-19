<?php
if (isset($_POST['submit'])) {
    if (!empty($_POST['fruits'])) {
        echo "<h3>You selected:</h3>";
	$selected=$_POST['fruits'];
        foreach ( $selected as $fruit) {
            echo $fruit . "<br>";
        }
    }
    else {
        echo "<p style='color:red;'>No fruit selected!</p>";
    }
}
?>

<html>
<head>
    <title>Checkbox Demo</title>
</head>
<body>
    <form method="post" action="">
        <h3>Select your favorite fruits:</h3>
        <input type="checkbox" name="fruits[]" value="Apple"> Apple <br>
        <input type="checkbox" name="fruits[]" value="Banana"> Banana <br>
        <input type="checkbox" name="fruits[]" value="Mango"> Mango <br>
        <input type="checkbox" name="fruits[]" value="Orange"> Orange <br><br>

        <input type="submit" name="submit" value="Submit">
    </form>
</body>
</html>
