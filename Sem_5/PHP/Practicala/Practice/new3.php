<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Write a PHP script that demonstrates the use of different data types: string, integer, float,
array, and NULL.</h1>
   <?php
   echo"<p>String example</p>";
   $name="Husain";
   echo "Your name is $name <br>";
   var_dump($name);

   echo "<p>Int example</p>";
   $int=10;
   echo "<p>THe interger is $int</p>";

   echo "<p>Float example </p>";
   $float=10.10;
   echo "<p>The float  is $float</p>";

   echo "<p>Null Example</p>";
   $nell=NULL;
   echo "<p>Null variable:$nell</p>";
   var_dump($nell);

   $skills= array('Python','Flutter','CICD Pipeline','Kubernetes');
   echo "<p>The Example of string is :THE skills of mine are as follows:</p>";
   print_r($skills);
   echo "<br>";


   
   ?>
    
</body>
</html>