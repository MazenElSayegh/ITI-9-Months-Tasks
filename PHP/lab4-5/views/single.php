<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>GlassInStyle</title>
    <link rel="stylesheet" href="views/style.css">
</head>

<body>
  <div id="container">
    <div class="product-img">
    <?php
    $index=isset($_GET["id"])?$_GET["id"]:"";
    $items=$db->get_all_records();
    echo "<img src=./images/".$items[$index]["photo"]."></div>";
    echo"<div class=product-info><div class=product-text><h1>".$items[$index]["product_name"]."</h1>";
    echo "<ul>";
    echo "<li>Type: ".$items[$index]["product_name"]."</li>";
    echo "<li>Code: ".$items[$index]["product_code"]."</li>";
    echo "<li class=product-price-btn>Price: ".$items[$index]["list_price"]."</li>";
    echo "<li>Rating: ".$items[$index]["rating"]."</li>";
    echo "<button type=button><a href='".$_SERVER["PHP_SELF"]."?current=0'>Return</a></button>";
    ?>
        </ul>
      </div>
    </div>
  </div>
</body>
</html>