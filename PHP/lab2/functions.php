<?php
require_once 'config.php';

function validate_form(){
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
            print_confirmation_page();
        }
    }
}
}
function clearForm() {
        $name = "";
        $email = "";
        $message = "";
}

function remeber_variable($var) {
    if (isset($_POST[$var]) && !empty($_POST[$var])) {
        return $_POST[$var];
    } else {
        return "";
    }
}

function print_confirmation_page() {
    echo "<center><h2>" . THANK_YOU_MESSAGE . "</H2></center>";
    echo str_repeat("*", 50);
    foreach ($_POST as $key => $value) {
        echo "<br/><strong> $key </strong> : $value";
        }
}

function save_to_file() {
    $fp = fopen(_Saving_File_, "a+");
    $written_string = implode(" , ", $_POST);
    $written_string_eol= $written_string.PHP_EOL;
    $submit_date = date("F j Y g:i a");
    $submit_ip = $_SERVER["REMOTE_ADDR"];
    $all_data = "$written_string , $submit_date , $submit_ip";
    fwrite($fp, $all_data.PHP_EOL);
    fclose($fp);
}

function convert_file_to_array() {
    return file(_Saving_File_);
}

function get_count(){
    $users = convert_file_to_array();
    return count($users);
}

?>