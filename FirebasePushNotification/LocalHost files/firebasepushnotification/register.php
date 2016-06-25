<?php 

if($_SERVER['REQUEST_METHOD']=='POST'){
	
	//getting the request values 
	$firebaseid = $_POST['firebaseid'];
	$email  = $_POST['email'];
	
	//connecting to database 
	$con = mysqli_connect('localhost','root','','pushnotification');

	//creating an sql query 
	$sql = "INSERT INTO register (firebaseid, email) VALUES ('$firebaseid','$email')";
	
	//executing the query to the database 
	if(mysqli_query($con,$sql)){
		echo 'success';
	}else{
		echo 'failure';
	}
}