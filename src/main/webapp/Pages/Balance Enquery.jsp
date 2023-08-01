<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Banking Application</title>
    <link rel="stylesheet" href="../css/mainpage_style.css">
        <link rel="stylesheet" href="../css/transactiontable.css">
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
                <h1>Balance</h1>
                <a href ="Counter Queries"><h4>Counter Queries</h4></a>
            </div>

            <div class="col2_back">
                    <br><h9>Your Current Balance is:</h9>
                    <div class="balance">
                        &#x20B9 ${balance }
                    </div>
                    <h9>Recent Transactions:</h9>



                                    <table>
                                        <thead>
                                            <tr class="table100-head">
                                                <th class="column1">Date</th>
                                                <th class="column2">Trans ID</th>
                                                <th class="column3">Description</th>
                                                <th class="column4">Amount</th>
                                                <th class="column5">Status</th>
                                                <th class="column6">Balance</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        		<tr>
                                                    <td class="column1">${transaction1.date }</td>
                                                    <td class="column2">${transaction1.id }</td>
                                                    <td class="column3">${transaction1.description }</td>
                                                    <td class="column4">${transaction1.amount }</td>
                                                    <td class="column5">${transaction1.status }</td>
                                                    <td class="column6">${transaction1.availableBalance }</td>
                                                </tr>
                                                <tr>
                                                    <td class="column1">${transaction2.date }</td>
                                                    <td class="column2">${transaction2.id }</td>
                                                    <td class="column3">${transaction2.description }</td>
                                                    <td class="column4">${transaction2.amount }</td>
                                                    <td class="column5">${transaction2.status }</td>
                                                    <td class="column6">${transaction2.availableBalance }</td>
                                                </tr>
                                                <tr>
                                                    <td class="column1">${transaction3.date }</td>
                                                    <td class="column2">${transaction3.id }</td>
                                                    <td class="column3">${transaction3.description }</td>
                                                    <td class="column4">${transaction3.amount }</td>
                                                    <td class="column5">${transaction3.status }</td>
                                                    <td class="column6">${transaction3.availableBalance }</td>
                                                </tr>
                                                <tr>
                                                    <td class="column1">${transaction4.date }</td>
                                                    <td class="column2">${transaction4.id }</td>
                                                    <td class="column3">${transaction4.description }</td>
                                                    <td class="column4">${transaction4.amount }</td>
                                                    <td class="column5">${transaction4.status }</td>
                                                    <td class="column6">${transaction4.availableBalance }</td>
                                                </tr>
                                                <tr>
                                                    <td class="column1">${transaction5.date }</td>
                                                    <td class="column2">${transaction5.id }</td>
                                                    <td class="column3">${transaction5.description }</td>
                                                    <td class="column4">${transaction5.amount }</td>
                                                    <td class="column5">${transaction5.status }</td>
                                                    <td class="column6">${transaction5.availableBalance }</td>
                                                </tr>                                                
                                                
                                        </tbody>
                                    </table>



            </div>
        </div>

    </div>
</body>

<style>
    .balance{
        margin:25px;
        font-family: Poppins-Bold;
        color: rgb(11, 105, 23);
        text-align: center;
        font-size: 4.5vw;
    }
</style>
</html>