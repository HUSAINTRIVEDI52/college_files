<?php
if(isset($_POST["sub"]))
{
	
		$food = $_POST["food"];
		switch($food)
		{
			case "pizza":
			    echo "You have ordered a Pizza!";
			    break;
			case "burger":
			    echo "You have ordered a Burger!";
			    break;
			case "pasta":
			    echo "You have ordered Pasta!";
			    break;
			case "samosa":
			    echo "You have ordered a Samosa!";
			    break;
			default:
			    echo "Invalid selection.";
		}
	
}
?>

<html>
<form method="POST" action="com_order.php">
    <label>Select a food item:</label>
    <select name="food">
        <option value="pizza">Pizza</option>
        <option value="burger">Burger</option>
        <option value="pasta">Pasta</option>
        <option value="samosa">Samosa</option>
    </select>
    <br><br>
    <input type="submit" value="Order" name="sub">
</form>
</html>
