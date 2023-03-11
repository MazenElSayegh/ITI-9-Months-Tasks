<?php

function toCelesius($f) {
    $c = (($f-32)*5)/9;
    return number_format($c, 1, '.', '' );
}

?>