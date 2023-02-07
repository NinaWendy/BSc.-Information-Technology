<?php
include "db_conn.php";
if(isset($_POST['submit'])){
    $usrname = $_POST['username'];
    $pass = $_POST['password'];

    $sql = "INSERT INTO Users(`Username`, `Password`) VALUES ('$usrname','$pass')";

    $result = mysqli_query($conn, $sql);
    if($result){
        echo "User  registerd successfully";
    }else{
        echo "Failed to register user";
    }
}
?>
<!DOCTYPE html>
<html>
    <head>
         <title>My first PHP website</title>
    </head>
    <body>
        <h2>Login Page</h2>
        <a href="index.php">Click here to go back</a><br/><br/>
        <form action="Register.php" method="post">
            Enter Username: <input type="text" name="username" required="required"/> <br/>
            Enter Password: <input type="password" name="password" required="required" /> <br/>
            <!-- <input type="submit" name = "submit" value="Login"/> -->
            <button type="submit" class="btn" name = "submit">
                Login
            </button>
        </form>
    </body>
</html>