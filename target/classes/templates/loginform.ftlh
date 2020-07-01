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
<body>

<div class="container">
    <div class="container1">
        <div id ="insertuser">
            <h5>Register new user</h5>
            <form action="/login" method="post"  id="insert_form">
                Name:<br/>
                <input type="text" class="form-control" name="username" required/>
                <br/>
                Company Name:<br/>
                <input type="text" class="form-control" name="password" required/>
                <br/>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
    </div>
</div>
<div class="col-sm-7" id="postResultDiv">
</div>

</body>
</html>