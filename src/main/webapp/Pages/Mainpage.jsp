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
                <h2>Welcome to</h2>
                <h11>DSK</h11>
                <h3>Banking Services</h3>
                <p>Hyderabad Branch</p>
            </div>

            <div class="col2">

                <a href ="Withdraw"><div class="card">
                    <img src="../images/withdrawal.png" class = "pic">
                    <h5>Withdraw</h5>

                </div></a>

                <a href="Deposit"><div class="card">
                    <img src="../images/deposit.png" class = "pic">
                    <h5>Deposit</h5>

                </div></a>

                <a href="Balance Enquery"><div class="card">
                    <img src="../images/Balance.png" class = "pic">
                    <h5>Balance Enquiry</h5>

                </div></a>

                <a href="Counter Queries"><div class="card">
                    <img src="../images/enquiry.png" class = "pic">
                    <h5>Counter Queries</h5>

                </div></a>

            </div>
        </div>

    </div>
</body>
</html>