<?php       
     if($_GET){
      $cityid = $_GET ;
      $api = __API . $cityid["cities"] . __API_key;
      
      $ch = curl_init();
      curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1);
      curl_setopt($ch, CURLOPT_URL, $api);
      curl_setopt($ch, CURLOPT_FOLLOWLOCATION, 1);
      $data = curl_exec($ch);
      curl_close($ch);
      
      $data_arr = json_decode($data, true);

    echo
    "<h2>" . $data_arr['name'] . " Whether Status </h2>
    <p>" . date("l g:i A") . "</p><p>" . date("jS F, Y") . "</p>
    <p>" . $data_arr['weather'][0]['description'] . "</p>
    <p>" . toCelesius($data_arr['main']['temp_min']) . "°C " . toCelesius($data_arr['main']['temp_max']) . "°C" . "</p>
    <p>" . "Humidity: " . $data_arr['main']['humidity'] . " % </p>
    <p>" . "Wind: " . $data_arr['wind']['speed'] . " Km/h </p>";
     }
    ?>