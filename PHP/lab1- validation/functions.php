<?php
require_once 'config.php';
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $name = $_POST["name"];
    $email = $_POST["email"];
    $message = $_POST["message"];
    
    
    if (empty($_POST["name"])) {
        echo "Name is required";
    } else if (empty($_POST["email"])) {
        echo "Email is required";
    } else if (empty($_POST["message"])) {
        echo "Message is required";
    }else {
        if (strlen($name) > MAX_NAME_LENGTH) {
            echo "Name is not vaild.";
        } else if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
            echo "Email is not vaild.";
        } else if (strlen($message) > MAX_MESSAGE_LENGTH) {
            echo "Message legenth has to be less 225.";
        }
else {
            $afterSubmit="<h3>". THANK_YOU_MESSAGE ."</h3><b>Name: </b>" . $name . "<br><b>Email: </b>" . $email . "<br><b>Message: </b>" . $message;
        }
    }
    function clearForm() {
        $name = "";
        $email = "";
        $message = "";
    }
}
?>