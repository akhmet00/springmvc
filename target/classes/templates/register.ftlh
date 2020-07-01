<!Doctype html>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <style>
        .container{
            margin-top: 10px;
            max-width: 750px;
            margin-right: 350px;
        }
        .container1 {
            margin-top: 10px;
            max-width:750px;
        }
    </style>

</head>

<div class="container">
    <div class="container1">
            <h5>Register new user</h5>
        <form action="/registerUser"  method="post" id="insert_form">
                User Name:<br/>
                <input type="text" class="form-control" name="userName" required/>
                <br/>
                Password:<br/>
                <input type="text" class="form-control" name="password" required/>
                <br/>
                Company name:<br/>
            <input type="text" class="form-control" name="companyname" required/>
            <br/>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form><br>

        <form action="/login">
            <button type="submit" class="btn btn-primary">Go to Log in page</button>
        </form>
    </div>
</div>

<div class="col-sm-7" id="postResultDiv">
</div>

</body>
</html>