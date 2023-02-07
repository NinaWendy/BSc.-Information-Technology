<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "account";

$conn = mysqli_connect($servename, $username, $password, $dbname);

if($conn){
    // echo "Connected to database successfully";
}else{
    die("Failed to connect to database". mysqli_connect_error());
}
?>