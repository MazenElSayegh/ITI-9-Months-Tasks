<?php

require_once "functions.php";

session_start();
$index=isset($_SESSION['index'])?$_SESSION['index'] :null;
$xmlDoc = new DOMDocument();
$xmlDoc->load("employee.xml");

$employees = $xmlDoc->getElementsByTagName("employee");
$employeesArr = [];

if(array_key_exists('next',$_POST)){
  $employees=nextEmployee($index,$employees);
}
elseif(array_key_exists('previous',$_POST)){
  $employees=previousEmployee($index,$employees);
  // displayEmployee($employees);
}
elseif (array_key_exists('insert', $_POST)) {
    
  createEmployee($_POST, $xmlDoc);
  $xmlDoc->save("employee.xml");
  $index = ++$_SESSION['index'];
  $employee = displayEmployee($employees->item($index));

}
elseif (array_key_exists('update', $_POST)) {

  updateEmployee($_POST, $employees, $index);
  $xmlDoc->save("employee.xml");
  $employee = displayEmployee($employees->item($index));
  
}
elseif (array_key_exists('delete', $_POST)) {

  deleteEmployee($index, $employees);
  $xmlDoc->save("employee.xml");
  $employee = displayEmployee($employees->item($index));

}
else {

  $employee = displayEmployee($employees->item($index));
  $_SESSION['index'] = $index;

}

require_once './form.php';
