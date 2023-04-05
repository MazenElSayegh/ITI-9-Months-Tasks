<?php

function createEmployee($dataArr, $xmlDoc)
{
  $root = $xmlDoc->documentElement;
  $employee = $xmlDoc->createElement("employee", " ");
  $name = $xmlDoc->createElement("name", $dataArr["name"]);
  $address = $xmlDoc->createElement("address", $dataArr["address"]);
  $email = $xmlDoc->createElement("email", $dataArr["email"]);
  $phone = $xmlDoc->createElement("phone", $dataArr["phone"]);

  $employee->appendChild($name);
  $employee->appendChild($phone);
  $employee->appendChild($address);
  $employee->appendChild($email);
  $root->appendChild($employee);
}

function displayEmployee($employee)
{
  $dataArr = [];
  $dataArr["name"] = $employee
    ->getElementsByTagName("name")
    ->item(0)->nodeValue;
  $dataArr["address"] = $employee
    ->getElementsByTagName("address")
    ->item(0)->nodeValue;
  $dataArr["email"] = $employee
    ->getElementsByTagName("email")
    ->item(0)->nodeValue;
  $dataArr["phone"] = $employee
    ->getElementsByTagName("phone")
    ->item(0)->nodeValue;

  return $dataArr;
}
