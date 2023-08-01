
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Banking Application</title>
     <link rel="stylesheet" href="../css/main.css">
     <link rel="icon" href="/images/icons/Logo.png">
</head>


<body>
    <div class="full-page">
        <div class="navbar">
            <div>
                <a href="/">DSK Bank</a>
            </div>
           <!-- <nav>
                <ul id="MenuItems">
                    <li><button class="loginbtn" onclick="document.getElementById('login-form').style.display='block'" style="width:auto;">Login</button></li>
                </ul>
            </nav> -->
            
        </div>
        
        
        <div class='login-page'>
            <div class="form-box">
                <div class='button-box'><h1>Log In Form<h1></div>
                
                
                <form id='login' class='input-group-login' action = 'login' method='post' autocomplete="off">
                <span style="color:black">Enter Customer ID:</span>
                    <input type='text'class='input-field' id='username' name='username' placeholder='Customer ID' required >
                    <span style="color:black">Enter Password:</span>
		    <input type='password'class='input-field' id='password' name='password' placeholder='Password' required>
		    <button type='submit'class='submit-btn'>Log in</button>
				<div class='error-msg'>${SPRING_SECURITY_LAST_EXCEPTION.message }</div>
		 </form>           
            
            </div>
        </div>
    </div>

</body>
</html>
</html>
