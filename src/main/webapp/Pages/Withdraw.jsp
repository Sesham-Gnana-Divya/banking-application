<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Banking Application</title>
    <link rel="stylesheet" href="../css/mainpage_style.css">
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
                <h1>Withdraw</h1>
                <a href ="Deposit"><h4>Deposit</h4></a>
                <a href ="Balance Enquery"><h4>Balance Enquiry</h4></a>
                <a href ="Counter Queries"><h4>Counter Queries</h4></a>
            </div>

            <div class="col2_back">
                    <h9>Enter Amount to Withdraw</h9>
                    <form id='debit' action = 'debit' method='post' autocomplete="off">
                    <input type="number" id="amount" name = "amount" placeholder="amount" required>
                    <h9>Enter Pin To Authenticate the Transaction</h9>
                    <input type="password" id="pin" name = "pin" placeholder="pin" required>
                    <h9>Message Box:</h9>
                    <div class="messagebox">
						<span style= "color :red">${errormessage }</span>
						<span style = "color:green">${successmessage }</span><br><br>
						<span style = "color:green">${custtext }</span><br>
						<div class="balance">${UpdatedBalance }</div>						
                    </div>
                    <div id="bottom">
                        <button type='submit'class='submit-btn'>Withdraw</button>
                 
                    </div>
                    </form>
            </div>
        </div>

    </div>
</body>
</html>

<style>
.balance{
        margin-top:20px;
        font-family: Poppins-Bold;
        color: rgb(11, 105, 23);
        text-align: center;
        font-size: 3vw;
    }
</style>