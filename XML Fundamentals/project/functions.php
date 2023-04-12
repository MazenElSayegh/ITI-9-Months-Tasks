<?php

function createEmployee($dataArr, $xmlDoc)
{
  if (!empty($dataArr)) {
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
}

function displayEmployee($employee)
{
  $dataArr = [];
  if ($employee != null) {
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
  }

  return $dataArr;
}

function nextEmployee($index, $employees)
{
    if (!empty($employees)) {

        $index = ++$_SESSION['index'];

        if ($index < count($employees)) {
        
            return displayEmployee($employees->item($index));

            } else {

                $_SESSION['index'] = $index = 0;
                return displayEmployee($employees->item($index));
        }
    }  
}

function previousEmployee($index, $employees)
{

    if (!empty($employees)) {

        $index = --$_SESSION['index'];

    if ($index < 0) {

        $index = $_SESSION['index'] = $employees->length-1 ;
        return displayEmployee($employees->item($index));

        } else {

            return displayEmployee($employees->item($index));
        }
    } 
}

function deleteEmployee($index, $employees)
{
    if (!empty($employees)) {

        $employee = $employees->item($index);
        $employee->parentNode->removeChild($employee);
        $index = --$_SESSION['index'];
        if ($index < 0) {
            $index = $_SESSION['index'] = 0;
        }

    }

}

function updateEmployee($dataArr, $employees, $index)
{
  if (!empty($dataArr)) {
      $employee = $employees->item($index);
      $employee->getElementsByTagName('name')->item(0)->nodeValue = $dataArr['name'];
      $employee->getElementsByTagName('phone')->item(0)->nodeValue = $dataArr['phone'];
      $employee->getElementsByTagName('address')->item(0)->nodeValue = $dataArr['address'];
      $employee->getElementsByTagName('email')->item(0)->nodeValue = $dataArr['email'];
  }
}
