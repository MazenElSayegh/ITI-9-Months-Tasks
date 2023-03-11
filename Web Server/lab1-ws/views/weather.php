<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="./views/style.css">
</head>
<body>
    <form action="./" method="GET">
        <label for="Weather">Weather Forecast</label>

        <select name="cities" id="cities">
            <?php 
            foreach($egyptianCities as $city) {
            echo "<option value=" . $city["id"] . ">" . $city["name"] . "</option>";
            }
            ?>
        </select>
        <input value="Submit" type="submit"/>
    </form>
</body>
</html>