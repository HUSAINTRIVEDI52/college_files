<?php
if (isset($_GET["sub"])) 
{
  if(empty($_GET["uname"]))
    {
	echo "Plz enter name first";
   }
   else
   {
   	echo $_GET["uname"];
    }
} 
?>
<html>
<body>
    <h2>Enter Your Name</h2>
    <form action=" " method="get">
               <label for="username">
        Enter User Name:
        </label>
        
        <input type="text" name="uname" >
               <input type="submit" value="Submit" name="sub">
    </form>
</body>
</html>

