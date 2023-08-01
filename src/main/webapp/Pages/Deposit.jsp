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
                <a href ="Withdraw"><h4>Withdraw</h4></a>
                <h1>Deposit</h1>
                <a href ="Balance Enquery"><h4>Balance Enquiry</h4></a>
                <a href ="Counter Queries"><h4>Counter Queries</h4></a>
            </div>

            <div class="col2_back">
            <form id='credit' action = 'credit' method='post' autocomplete="off">
                    <h9>Enter Amount to Deposit</h9>
                    <input type="number" id="amount" name = "amount" placeholder="Amount" required>
                    <h9>Enter Your Name</h9>
                    <input type="text" id="depositor" name = "depositor" placeholder="Depositor Name" required>
                    <h9>Message Box:</h9>
                    <div class="messagebox">
						<span style= "color : red">${errormessage }</span>
						<span style = "color:green">${successmessage }</span><br><br>
						<span style = "color:green">${custtext }</span><br>
						<div class="balance">${UpdatedBalance }</div>
                    </div>
                    <div id="bottom">
                        <button type='submit'class='submit-btn'>Deposit</button>
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