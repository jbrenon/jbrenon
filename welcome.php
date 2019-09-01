<?php

session_start();
?>

<html>
<head>
	<title>Home Page</title>
	<body>
		<h1> welcome <?php echo $_SESSION['Username']; ?> </h1>
	</body>

</head>
</html>