<?php
    //String
    $username = "Fred Smith";
    echo $username ."</br>";

    //Integer
    $count = 16.4;
    echo $count ."</br>";

    //Array
    $team = array('John','James','Jane',"Mary");
    echo $team[1];
    var_dump($team);
    print_r($team);
    foreach ($team as $valu){
        echo $valu. "</br>";
    }
    //Multidimensional array
    $soccer = array(
                    array('John', 'James','Jacob'),
                    array('Peter', 'Paul','Pius'),
                    array('Amanda','Abigael','Ana')
    );
    echo "This is ". $soccer[2][2] ."</br>";
    print_r($soccer);
    //sizeof or count method
    for($row =0; $row < sizeof($soccer); $row++){
        echo "<ul>";
        for($col =0; $col <3; $col++){
            echo "<li>". $soccer[$row][$col]."</li>";
        }
        echo "</ul>";
    }
?>  