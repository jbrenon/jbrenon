<?php

session_start();

$con = mysqli_connect('localhost', 'root', '');
mysqli_select_db($con, 'dbtest');

$users= $_POST['username'];
$pass = $_POST['password'];

$s = "select * from tblregistered where Username = '$users' && Pass = '$pass'";
$result = mysqli_query($con, $s);
$num = mysqli_num_rows($result);


if($num == 1)
{
	$_SESSION['Username'] = $users;
	header('location:welcome.php');
}
else
{
	header('location:practice.php');
}
?>