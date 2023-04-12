<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>XML Form</title>
    </head>
    <body class="container">
        <form method="post" action="index.php" enctype="multipart/form-data">
            <div class="mb-3">
                <label for="exampleInputName1" class="form-label">Full name</label>
                <input type="text" class="form-control" id="exampleInputName1" aria-describedby="nameHelp" name="name" value=" <?php echo $employee['name'] ?? "" ?>">
            </div>
            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">Email</label>
                <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="email" value=" <?php echo $employee['email'] ?? "" ?>">
                <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
            </div>
            <div class="mb-3">
                <label for="exampleInputPhone1" class="form-label">Phone</label>
                <input type="text" class="form-control" id="exampleInputPhone1" aria-describedby="PhoneHelp" name="phone" value=" <?php echo $employee['phone'] ?? "" ?>">
            </div>
            <div class="mb-3">
                <label for="exampleInputAddress1" class="form-label">Address</label>
                <input type="text" class="form-control" id="exampleInputAddress1" aria-describedby="AddressHelp" name="address" value=" <?php echo $employee['address'] ?? "" ?>">
            </div>
            <div class="flex justify-between">
                <div class="w-full flex flex-row justify-between items-center ">
                    <input class="btn btn-primary mx-4 text-dark" type="submit" value="Previous" name="previous">
                    <input class="btn btn-danger mx-1 text-dark" type="submit" value="Delete" name="delete">
                    <input class="btn btn-success mx-1 text-dark" type="submit" value="Insert" name="insert">
                    <input class="btn btn-warning mx-1 text-dark" type="submit" value="Update" name="update">   
                    <input class="btn btn-primary mx-4 text-dark" type="submit" value="Next" name="next">
                </div>
            </div>
    </form>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    </body>
</html>