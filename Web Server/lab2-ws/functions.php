<?php 
$_DB = new MySQLHandler("products");
$_connect = $_DB->connect();

if($_connect){
    $url= $_SERVER['REQUEST_URI'];
    $url_array = explode('/',$url);
    $method = $_SERVER["REQUEST_METHOD"];

    // $entered_id= intval($url_array[4]);

    // var_dump($url_array);

    if(isset($url_array[3]) && $url_array[3] != "items"){

        http_response_code(404);
        die("Resource doesn't exist") ;
        // exit();
    }
    else if(isset($url_array[4])){
        $id= intval($url_array[4]);
        $product= json_encode($_DB->get_record_by_id($id));
        // echo "hello I'm here";
        if($product){
            // echo "<h2>Exits</h2>";
            switch($method){
                case "GET":
                    // echo "hello im here";
                    echo "<h2> $product </h2>";
                    break; 
                case "PUT":
                    $_DB->connect();
                    $data = json_decode(file_get_contents('php://input'), true);
                    $_DB->update($data,$id);
                    echo "Updated successfully";
                    break;
                case "DELETE":
                    $_DB->connect();
                    $_DB->delete($id); 
                    echo "<br>Deleted Successfully!";
                    break;
                default:
                    echo "Method not allowed";
            }
        }
        
    }
    else {
        if($method==="POST"){
             $data = json_decode(file_get_contents('php://input'), true);
             $_DB->save($data);
             echo "im here";
             echo json_encode($data);
         }
         else if($method==="GET"){
            $data =json_encode($_DB->get_data());
            echo $data;
         }
         else{
            echo "Method not allowed";
         }
    }
}
else 
{
    http_response_code(500);
    echo "Internal server error!";
}