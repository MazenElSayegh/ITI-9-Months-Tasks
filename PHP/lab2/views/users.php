<?php 

$users = convert_file_to_array();
$count = get_count();
echo "<h2> There are $count users </h2>";
foreach($users as $user){
    $user_details = explode(",",$user);
      echo "New User <br/>";
      echo str_repeat("*", 20);
        echo "<Div>";
    foreach($user_details as $value ){
      echo "<h3> $value </h3>"; 
    }
      echo "</div>";
}
