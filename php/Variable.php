<?php
//short open tag
    $number = 12345 * 67890;
    echo substr($number,3,1);
    define("ROOT_LOCATION","/usr/local/www/");
    echo ROOT_LOCATION;
    $dir = ROOT_LOCATION;
    echo $dir;
    echo __CLASS__;
    echo "This is line " . __LINE__ . " of file " . __FILE__;
    echo "</br>";
    //functions
    // function longdate($timestamp){
    //     return date("l F jS Y", $timestamp);
    // }
    // echo longdate(time());
    //local variables
    $temp = "The date is ";
    echo longdate($temp, time());
    function longdate($text, $timestamp){
        return $text . date("l F jS Y", $timestamp);
    }
    //global variables
    global $is_logged_in;
    //static variables
    function test(){
        static $count = 0;
        echo $count;
        $count++;
    }
    echo test();
    echo test();
?>