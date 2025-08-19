<?php
if(isset($_POST["sub"]))
{
    // Get the selected food items as an array
    $foods = $_POST["food"]; 
    
    echo "You have ordered:<br>";
    
    foreach($foods as $food) {
        echo "- $food <br>";
    }
}
?>

<html>
<form method="POST" action="com_order_multi.php">
    <label>Select a food item:</label>
    <select name="food[]" multiple>
        <option value="pizza">Pizza</option>
        <option value="burger">Burger</option>
        <option value="pasta">Pasta</option>
        <option value="samosa">Samosa</option>
    </select>
    <br><br>
    <input type="submit" value="Order" name="sub">
</form>
</html>
