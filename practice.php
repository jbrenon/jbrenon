<html>
<head>
	<title>practisan muna</title>
	
	<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="style.css">
	

</head>
<body>
	<div class = "container">
		<div class="login-box">
		<div class = "row">
			<div class = "col-md-6 login-left">
			<h2>login here</h2>
			<form action="shen.php" method="POST">
				<div class = "form-group">
					<label>Username</label>
					<input type = "text" name = "username" class="form-control" required>

				</div>

				<div class = "form-group">
					<label>password</label>
					<input type = "password" name = "password" class="form-control" required>
					
				</div>
				<button type="submit" class="btn btn-primary"> login </button>
				 	
			</form>
		</div>


		<div class = "col-md-6 login-right">
			<h2>register here</h2>
			<form action="process.php" method="POST">
				<div class = "form-group">
					<label>Username</label>
					<input type = "text" name = "users" class="form-control" required>

				</div>

				<div class = "form-group">
					<label>password</label>
					<input type = "text" name = "passs" class="form-control" required>
					
				</div>
				<button type="submit" class="btn btn-primary"> register</button>
			</form>
		</div>
		</div>
	</div>
	</div>
</body>
</html>