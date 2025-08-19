//Create a form which takes a string and convert it into uppercase and lowercase using user defined function
<?php
    function toUpper($s) {
        return strtoupper($s);
    }

    function toLower($s) {
        return strtolower($s);
    }

    if (isset($_POST['case'])) {
        $s = $_POST['str'];
        echo "<h3>Uppercase: " . toUpper($s) . "</h3>";
        echo "<h3>Lowercase: " . toLower($s) . "</h3>";
    }
    ?>
<html>
<head>
    <title>String Case</title>
</head>
<body>
    <h2>Convert String Case</h2>
    <form method="post">
        Enter a String: <input type="text" name="str"><br><br>
        <input type="submit" name="case" value="Convert">
    </form>

    
</body>
</html>