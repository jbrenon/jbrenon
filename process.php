<?php

session_start();

$con = mysqli_connect('localhost', 'root', '');
mysqli_select_db($con, 'dbtest');

$users= $_POST['users'];
$pass = $_POST['passs'];

$s = "select * from tblregistered where Username = '$users'";

$result = mysqli_query($con, $s);
$num = mysqli_num_rows($result);

if($num == 1)
{
	echo "user name taken";
}
else
{
	$reg = "insert into tblregistered(Username, Pass) values ('$users', '$pass')";
	mysqli_query($con, $reg);
	echo "registered successfully";
}
?>