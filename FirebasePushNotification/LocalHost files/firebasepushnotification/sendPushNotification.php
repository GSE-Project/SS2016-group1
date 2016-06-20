<!DOCTYPE html>

<html>
	<head>
		<title>Firebase Push Notification</title>
	</head>
	
	<body>
		<?php
			//Connecting to database 
			$con = mysqli_connect('localhost','root','','pushnotification');
			
			//Query to get values from database 
			$sql = "SELECT * FROM register";
			
			//Getting the values 
			$result = mysqli_query($con,$sql);
			
			?>
			<form action='send.php' method='post'>
				<select name='email'>
				<?php 
					//Traversing trhough all values 
					while($row = mysqli_fetch_array($result)){
						//displaying the values in a dropdown list 
				?>
						<option value='<?php echo $row['email'];?>'><?php echo $row['email'];?></option>
		
				<?php
					}
				?>
				</select><br /><br />
		
				<!-- here user would enter the message to send to a particular device --> 
				<textarea name='message'></textarea><br />
		
				<button>Send Notification</button><br />
			</form>
			<?php
				//Displaying a success message when the notification is sent 
				if(isset($_REQUEST['success'])){
			?>
			<strong>Great!</strong> Your message has been sent successfully...
			<?php
				}
			?>
	</body>
</html>