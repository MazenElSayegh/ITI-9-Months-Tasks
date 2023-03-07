var frm = document.getElementById("frm");
frm.addEventListener("submit", validateForm);
var usname = document.getElementById("name");
var mobile = document.getElementById("mobile");

function printError(elemId, hintMsg) {
  document.getElementById(elemId).innerHTML = hintMsg;
}

function validateForm(e) {
  // e.preventDefault();
  //   var email = document.getElementById("email");
  //   var address = document.getElementById("address");

  // Defining error variables with a default value
  var nameErr = (mobileErr = true);
  // Validate name
  if (usname.value == "") {
    printError("nameErr", "Please enter your name");
  } else {
    var regex = /^[A-Za-z ]{8,30}$/;
    if (regex.test(usname.value) === false) {
      printError("nameErr", "Please enter a valid name");
    } else {
      printError("nameErr", "");
      nameErr = false;
    }
  }

  if (mobile.value == "") {
    printError("mobileErr", "Please enter your mobile number");
  } else {
    var regex = /^[0-9]{10,15}$/;
    //   console.log(pass.value);
    if (regex.test(mobile.value) === false) {
      printError("mobileErr", "Please enter a valid mobile number");
    } else {
      printError("mobileErr", "");
      mobileErr = false;
    }
  }
  if ((mobileErr || nameErr) == true) {
    e.preventDefault();
    // return false;
  } else {
    return true;
  }
}
// document.getElementById("frm").onsubmit = validateForm;
