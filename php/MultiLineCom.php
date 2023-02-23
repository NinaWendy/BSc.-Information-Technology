<?php
$author = "Alfred E Newman";
$text = "This is a Headline
This is the first line.
This is the second.
Written by $author.";
echo "This is a Headline
This is the first line.
This is the second.
Written by $author.";
//Heredoc
echo <<<_END
This is a Headline
This is the first line.
This is the second.
- Written by $author.
_END;
?>