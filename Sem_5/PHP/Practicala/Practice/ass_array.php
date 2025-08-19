/*Write a php script for following tasks using array.

Roll No		Name		Age	Marks
101		Rahul		20	85
102		Pooja		21	34
103		Amit		19	92
104		Sneha		22	88

•	Display all student details in tabular format (roll no, name, age, marks).
•	Find and display the student with the highest marks.
•	Display names of students who scored more than 80 marks.
•	Calculate the average marks of all students
*/

<html>
<head>
    <title>2D Associative Array Example</title>
</head>
<body>

<?php
// 2D Associative Array of Students
$students = array(
    "101" => array("name" => "Rahul", "age" => 20, "marks" => 85),
    "102" => array("name" => "Pooja", "age" => 21, "marks" => 78),
    "103" => array("name" => "Amit",  "age" => 19, "marks" => 92),
    "104" => array("name" => "Sneha", "age" => 22, "marks" => 88)
);

// 1. Display all student details in tabular format
echo "<h3>All Student Details</h3>";
echo "<table border='1'>
        <tr>
            <th>Roll No</th>
            <th>Name</th>
            <th>Age</th>
            <th>Marks</th>
        </tr>";
foreach ($students as $roll => $details) {
    echo "<tr>
            <td>$roll</td>
            <td>{$details['name']}</td>
            <td>{$details['age']}</td>
            <td>{$details['marks']}</td>
          </tr>";
}
echo "</table><br>";

// 2. Find student with highest marks
$highestMarks = -1;
$topStudent = "";
foreach ($students as $roll => $details) {
    if ($details['marks'] > $highestMarks) {
        $highestMarks = $details['marks'];
        $topStudent = $details['name'];
    }
}
echo "<h3>Topper: $topStudent with $highestMarks marks</h3>";

// 3. Display names of students with marks > 80
echo "<h3>Students with marks greater than 80:</h3>";
foreach ($students as $details)
 {
    if ($details['marks'] > 80)
 {
        echo $details['name'] . "<br>";
    }
}

// 4. Calculate average marks
$totalMarks = 0;
$count = count($students);
foreach ($students as $details) {
    $totalMarks += $details['marks'];
}
$average = $totalMarks / $count;
echo "<h3>Average Marks of all students: $average</h3>";
?>

</body>
</html>
