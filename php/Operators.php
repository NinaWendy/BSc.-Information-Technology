<?php
    $j = 10;
    echo $j + 1 ."</br>";
    echo $j - 6 ."</br>";
    echo $j * 11 ."</br>";
    echo $j / 2 ."</br>";
    echo $j % 3 ."</br>";
    echo ++$j ."</br>";
    echo "J is".$j ."</br>";
    echo $j++ ."</br>";
    echo "J is".$j ."</br>";
    echo --$j ."</br>";
    echo $j-- ."</br>";

    $k = 2;
    echo "Assignment operators";
    echo $j=15;
    echo "</br>";
    echo $j+=5 ."</br>";
    echo $j-=3 ."</br>";
    echo $j*=8 ."</br>";
    echo $j/=5 ."</br>";
    echo $j.=$k ."</br>";
    echo "</br>";
    echo $j == 4;
    $variable= 2;
    $info2 ='Preface variables with a $ like this: $variable';
    $info ="Preface variables with a $ like this: $variable";
    echo $info;
    echo $info2;
    $count=3;
    echo "There have been $count presidents of the US";
    $bulletin .= $newsflash; //append one string to the other

?>