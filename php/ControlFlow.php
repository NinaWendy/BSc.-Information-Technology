<?php
    echo "a: [" . (20 > 9) . "]<br />";
    echo "b: [" . (5 == 6) . "]<br />";
    echo "c: [" . (1 == 0) . "]<br />";
    echo "d: [" . (1 == 1) . "]<br />";

    if ($bank_balance < 100){
    $money = 1000;
    $bank_balance += $money;
    }
    elseif ($bank_balance > 200){
    $savings+= 100;
    $bank_balance -= 100;
    }
    else{
    $saving+= 50;
    $bank_balance -= 50;
    }
    switch ($page)
{
case "Home":
echo "You selected Home";
break;
case "About":
echo "You selected About";
break;
case "News":
echo "You selected News";
break;
case "Login":
echo "You selected Login";
break;
case "Links":
echo "You selected Links";
break;
default: echo "Unrecognized selection";
break;
}

echo $fuel <= 1 ? "Fill tank now" : "There's enough fuel";

$count = 0;
while (++$count <= 12)
echo "$count times 12 is " . $count * 12 . "<br />";
$count = 1;
do
echo "$count times 12 is " . $count * 12 . "<br />";
while (++$count <= 12);

//Breaking out of a loop
$fp = fopen("text.txt", 'wb');
for ($j = 0 ; $j < 100 ; ++$j)
{
$written = fwrite($fp, "data");
if ($written == FALSE) break;
}
fclose($fp);
?>