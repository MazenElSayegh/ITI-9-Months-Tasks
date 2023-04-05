<?php

require_once "functions.php";

$xmlDoc = new DOMDocument();
$xmlDoc->load("employee.xml");
$dataArr = [
  "name" => "Mazen",
  "address" => "Smouha",
  "email" => "mazen@gmail.com",
  "phone" => "0101234567",
];
createEmployee($dataArr, $xmlDoc);
$xmlDoc->save("employee.xml");

$employees = $xmlDoc->getElementsByTagName("employee");
$employeesArr = [];

foreach ($employees as $employee) {
  array_push($employeesArr, $employee);
}

var_dump(displayEmployee($employeesArr[0]));
