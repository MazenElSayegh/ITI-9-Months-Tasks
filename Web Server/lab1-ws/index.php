<?php

// require_once 'vendor/autoload.php';

$allCitiesJSON = json_decode(file_get_contents("./city.list.json"),true);
$egyptianCities = [];

foreach($allCitiesJSON as $city){
    if($city['country']=="EG"){
        $egyptianCities[] = $city;
    }
}

require_once("./views/weather.php");
// require_once("./curl.php");
require_once("./guzzel.php");

?>


