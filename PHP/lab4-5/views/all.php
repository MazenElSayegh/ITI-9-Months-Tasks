<?php
$current_index=isset($_GET["current"]) && is_numeric($_GET["current"])?$_GET["current"]:0;
$items=$db->get_all_records_paginated(array(),$current_index);
$next_index=$current_index + __RECORDS_PER_PAGE__ < 6?$current_index + __RECORDS_PER_PAGE__ :0;
$previous_index=$current_index - __RECORDS_PER_PAGE__ >0?$current_index - __RECORDS_PER_PAGE__:0;
if(isset($_GET['search'])){
    $arrOfProducts = $db->search('product_name' , $_GET['search'] );
        $items = $arrOfProducts;
    }
    if(isset($_GET['delete'])){
        $allItems=$db->get_all_records();
        $db->delete($allItems[$_GET['delete']]['id']);
        }

    echo "<div id=container><div id=formCont><form action=".$_SERVER['PHP_SELF']." method=GET>";
    echo "<input type=search name=search placeholder=Product Name>";
    echo "<button type=submit>Search</button></form></div>";
    
?>

<html>
  <head>
<link rel="stylesheet" href="views/allstyle.css">
      </head>
<div>
<table>
    <tr>
        <th>Item ID</th>
        <th>Item name</th>
        <th>Details</th>
        <th>Edit</th>
    </tr>
</html>

<?php
    $index=$current_index;
    foreach($items as $item){

        echo "<tr><td>".$item["id"]."</td>";
        echo "<td>".$item["product_name"]."</td>";
        echo "<td><a href='".$_SERVER["PHP_SELF"]."?id=".$index."'>view</a></td>";
        echo "<td><a href='".$_SERVER["PHP_SELF"]."?delete=".$index."'>Remove</a></td></tr>";
        $index++;
    }
    echo "</table></div>";
    echo "<div id=btns>";
    echo "<button type=button><a href='".$_SERVER["PHP_SELF"]."?current=".$previous_index."'>Previous</a></button>";
    echo "<button type=button><a href='".$_SERVER["PHP_SELF"]."?current=".$next_index."'>Next</a></button></div></div>";
?>