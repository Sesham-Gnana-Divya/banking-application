<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Banking Application</title>
    <link rel="stylesheet" href="../css/mainpage_style.css">
    <link rel="stylesheet" href="../css/CounterQueries.css">
    <link rel="icon" href="../images/icons/Logo.png">
</head>
<body>
    <div class="container">
        <div class="navbar">
            <div class="logo1">
                <a href="/">DSK Bank</a>
            </div>
            <nav>
                <ul>
                    <li><a>ID ${user.cid}</a></li>
                    <li><a>${user.name}</a></li>
                </ul>
            </nav>
                <div class="dropdown">
                    <img src="../images/menu.png" class = "menu-icon">
                    <div class="dropdown-content">
                        <h6><a href ="logout">Logout</a></h6>
                    </div>
                </div>
        </div>
        <div class="row">

            <div class="col1">
                <a href ="Withdraw"><h4>Withdraw</h4></a>
                <a href ="Deposit"><h4>Deposit</h4></a>
                <a href ="Balance Enquery"><h4>Balance Enquiry</h4></a>
                <h1>Counter Queries</h1>
            </div>

            <div class="col2_back">
                    <br>
                    <form action="" method="post">
                    <select id="query_choice" name="id" onchange="javascript:this.form.submit()" class="dropdown-el">
                        <option value="" selected="selected">Please Select the Query</option>
                         <option value="1">Loans and EMI</option>
                         <option value="2">Cash Counter</option>
                         <option value="3">NRI Account</option>
                         <option value="4">Internet and Phone Banking</option>
                         <option value="5">Account Opening</option>
                    </select>
                    </form>
                    <div class="messagebox">
                    	<br>
                    	<span style="color:red">${error }</span><br><br>
                    	<span style="font-size:35px">${apointmentName }</span><br><br>
						<span>${counter }</span><br>
						<span style="font-size:35px">${counterNumber }</span><br><br>
						<span>${token_text }</span><br>
						<span style="font-size:50px">${token}</span>						
                    </div>
                    
                    </div>

            </div>
        </div>

</body>
</html>
