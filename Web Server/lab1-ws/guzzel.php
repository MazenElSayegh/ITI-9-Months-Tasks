<?php
require_once 'vendor/autoload.php';
if($_GET){

    $appkey = "cd6966ae83bcefae7fa3c68e02265cbf";
    $cityid = $_GET['cities'];
    $api = __API . $cityid . __API_key;
    $client = new \GuzzleHttp\Client();

    $response = $client->request("GET",$api);

    $data_arr = json_decode($response->getBody(),true);


    echo
    "<h2>" . $data_arr['name'] . " Whether Status </h2>
    <p>" . date("l g:i A") . "</p><p>" . date("jS F, Y") . "</p>
    <p>" . $data_arr['weather'][0]['description'] . "</p>
    <p>" . toCelesius($data_arr['main']['temp_min']) . "°C " . toCelesius($data_arr['main']['temp_max']) . "°C" . "</p>
    <p>" . "Humidity: " . $data_arr['main']['humidity'] . " % </p>
    <p>" . "Wind: " . $data_arr['wind']['speed'] . " Km/h </p>";
}
?>