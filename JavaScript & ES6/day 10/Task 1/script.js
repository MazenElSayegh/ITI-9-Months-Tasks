
function validateForm(){
    var us=document.getElementById("us");
    var pass=document.getElementById("pass");

    function printError(elemId, hintMsg) {
        document.getElementById(elemId).innerHTML = hintMsg;
    }

    // Defining error variables with a default value
    var usErr = passErr = true;
    // Validate name
    if (us.value == "") {
    printError("usErr", "Please enter your username");
    } else {
    var regex = /^[A-Za-z][A-Za-z0-9_]{7,29}$/;
    if (regex.test(us.value) === false) {
        printError("usErr", "Please enter a valid username");
    } else {
        printError("usErr", "");
        usErr = false;
    }
    }

    if(pass.value=="") {
        printError("passErr","Please enter your password");
    } else {
        // var regex = /(?=.[a-z])(?=.[A-Z])(?=.*[0-9])(?=.{8,})/;
        var regex= /(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.{8,})/;
        console.log(pass.value);
        if(regex.test(pass.value)===false){
            printError("passErr","Please enter a valid password")
        } else {
            printError("passErr","");
            passErr= false;
        }
    }


    // Prevent the form from being submitted if there areany errors
    if ((usErr || passErr ) == true) {
        return false;
    } else {
        // Creating a string from input data for preview
        var dataPreview = "You've entered the following details: \n" + "Username: " + us.value + "\n" + "Password: " + pass.value ;
        // Display input data in a dialog box before submitting the form
        alert(dataPreview);
    }
};

document.getElementById("btn").onclick = validateForm;


