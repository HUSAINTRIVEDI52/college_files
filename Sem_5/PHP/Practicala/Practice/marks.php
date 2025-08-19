


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        $students = array(
            "101"=>array("name"=>"Rahul","age"=>20,"marks"=>85),
            "102"=>array("name"=>"Pooja","age"=>62,"marks"=>56),
            "103"=>array("name"=>"Amit","age"=>66,"marks"=>77),
            "104"=>array("name"=>"Amit","age"=>44,"marks"=>88)
        );

        //Display the students details in tablular format:
            echo "<h3>All Students detail:</h3>";
            echo "<table border='1'
                <tr>
                    <th>ROll NO</th>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Marks</th>
                </tr>";
        foreach($students as $roll_no=>$details){
            echo "<tr>
                    <td>$roll_no</td>
                    <td>{$details['name']}</td>
                    <td>{$details['age']}</td>
                    <td>{$details['marks']}</td>
                    </tr>";
        }
        echo "</table><br>";
        //The highest marks:
        $highest_mark=-1;
        $topstudent="";
        foreach($students as $roll_no=>$details){
            if($details['marks']>$highest_mark){
                $highest_mark=$details['marks'];
                $topstudent=$details['name']. "<br>";
            }
        }
        echo "<h3>Topper: $topstudent with highest maark $highest_mark<h3>";

        echo "Display the name of the student with the marks greater than 80<br>";
        foreach($students as $details){
            if($details['marks']>80){
                echo $details['name'] ."<br>";
            }
        }
        // Calculate the avg of the marks:
        $total_marks=0;
        $count=count($students);
        foreach ($students as $details){
            $total_marks += $details['marks'];
        }
        $avg=$total_marks/$count;
        echo "<h3>The avg marks of all the student is $avg</h3>";


    ?>
</body>
</html>