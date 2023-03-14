<?php 
$counter = new Counter();
$counter->increment_and_update();
$count = $counter->get_count();
echo "<h1>Count is $count</h1>";