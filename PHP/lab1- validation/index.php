<?php
require_once 'functions.php';
$parameter= isset($_GET["page"]) ? $_GET["page"] : "";
if($parameter=="contact"){
    require_once 'server.php';
}
?>

<html>
<head>
    <title>Contact Us</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <h3>Contact Us</h3>
    <div id="after_submit"><?php echo (isset($afterSubmit)) ?$afterSubmit : ""; ?></div>
    <form id="contact_form" action="#" method="POST" enctype="multipart/form-data">

        <div class="row">
            <label class="required" for="name">Your name:</label><br />
            <input id="name" class="input" name="name" type="text" value="<?php echo (isset($name)) ? $name : ''; ?>" size="30" /><br />

        </div>
        <div class="row">
            <label class="required" for="email">Your email:</label><br />
            <input id="email" class="input" name="email" type="text" value="<?php echo (isset($email)) ? $email : ''; ?>" size="30" /><br />

        </div>
        <div class="row">
            <label class="required" for="message">Your message:</label><br />
            <textarea id="message" class="input" name="message" rows="7" cols="30"><?php echo (isset($message)) ? $message : ''; ?></textarea><br />

        </div>

        <input id="submit" name="submit" type="submit" value="Send email" />
        <input id="clear" name="clear" onclick="clearForm()" type="reset" value="clear form" />
    </form>
    <script>
        
    </script>
</body>
</html>
