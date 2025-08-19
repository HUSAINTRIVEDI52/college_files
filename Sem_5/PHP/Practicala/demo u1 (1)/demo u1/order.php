<?php
$food = $_GET['food'];

switch ($food) 
{
    case "pizza":
        echo "You ordered Pizza. ";
        break;
    case "burger":
        echo "You ordered Burger. ";
        break;
    case "pasta":
        echo "You ordered Pasta. ";
        break;
    case "samosa":
        echo "You ordered Samosa. ";
        break;
    default:
        echo "Invalid food selection.";
}
?>
