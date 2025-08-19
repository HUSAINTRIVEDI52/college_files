 <?php 

    if(isset($_GET['name']) && isset($_GET['age']))
    {   
        $name=htmlspecialchars($_GET['name']);
        $age=(int) $_GET['age'];

        echo "The name is $name";
        echo"<br>THe age is $age";
    }
else{
    echo "<p>No data recieved</p>";
}
    ?>