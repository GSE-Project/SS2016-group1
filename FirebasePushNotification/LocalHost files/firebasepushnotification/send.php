<?php 

//Your firebase url 
const DEFAULT_URL = 'https://sizzling-fire-9431.firebaseio.com/';

//Checking post request 
if($_SERVER['REQUEST_METHOD']=='POST'){
	
	//Connection to database 
	$con = mysqli_connect('localhost','root','','pushnotification');
	
	//Importing firebase libraries 
	require_once 'firebaseInterface.php';
	require_once 'firebaseLib.php';
	require_once 'firebaseStub.php';
	
	//Geting email and message from the request 
	$email = $_POST['email'];
	$msg = $_POST['message'];
	
	//Getting the firebase id of the person selected to send notification
	$sql = "SELECT * FROM register WHERE email = '$email'";
	
	//Getting the result from database 
	$res = mysqli_fetch_array(mysqli_query($con,$sql));
	
	//getting the unique id from the result 
	$uniqueid = $res['firebaseid'];
	
	//creating a firebase variable 
	$firebase = new \Firebase\FirebaseLib(DEFAULT_URL,''); 
	
	//changing the msg of the selected person on firebase with the message we want to send 
	$firebase->set($uniqueid.'/msg', $msg);
	
	//redirecting back to the sendnotification page 
	header('Location: sendPushNotification.php?success');
}else{
	header('Location: sendPushNotification.php');
}