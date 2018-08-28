<?php

$reservados = "bool else false for if int read return skip stop string true var while write ( ) [ ] { } , ; + - * / % == != > >= <";
$exp_res = explode(" ",$reservados);
$names = [];
$tokens = [];

foreach($exp_res as $reservado){
    if(preg_match("#[aA-zZ][aA-zZ0-9]*#",$reservado)){
        if($reservado == "[" 
            || $reservado == "]" 
            || $reservado == "bool" 
        )
        {
            $names[] = getSpecialType($reservado);continue;
        }
        $names[] = template($reservado);
    }else{
        $names[] = getSpecialType($reservado);
    }
}

echo implode(PHP_EOL,$names);
echo PHP_EOL;


// echo implode(PHP_EOL,$tokens);
// echo PHP_EOL;

// ********** Functions ********** 

function getSpaces($str){
    $tot = 19;
    $space = " ";
    $rest = $tot - strlen($str);
    
    $space = str_repeat(" ",$rest);
    return $space;
}

function template($str,$symbol = null){
    global $tokens;
    $uper = strtoupper($str);
    $tokens[] = "%token T_{$uper}";
    if($symbol != null){
        $str = $symbol;
    }
    return "\"{$uper}\"".getSpaces($str).": '$str';";
}
// "RIGHT_CURLY_BRACE"     
//types:( ) [ ] { } , ; + - * / % == != > >= <
function getSpecialType($r){
    $name = null;
    switch($r){
        case $r == "(": return template("LEFT_PAREN","(");
        case $r == ")": return template("RIGHT_PAREN",")");
        case $r == "[": return template("LEFT_SQUARE","[");
        case $r == "]": return template("RIGHT_SQUARE","]");
        case $r == "{":  return template("LEFT_CURLY_BRACE","{");
        case $r == "}": return template("RIGHT_CURLY_BRACE","}");
        case $r == ",": return template("COMMA",",");
        case $r == ";": return template("SEMICOLON",";");
        case $r == "+": return template("PLUS","+");
        case $r == "-": return template("MINUS","-");
        case $r == "*": return template("ASTERISK","*");
        case $r == "/": return template("SLASH","/");
        case $r == "%": return template("PERCENT","%");
        case $r == "==": return template("EQUAL","=="); 
        case $r == "!=": return template("DIFFERENT","!="); 
        case $r == ">": return template("GREATER",">");
        case $r == ">=": return template("GREATER_OR_EQUAL",">="); 
        case $r == "<": return template("LOWER","<");
        case $r == "<": return template("LOWER_OR_EQUAL",";");
        case $r == "bool": return template("BOOL","true | false");
    }
}
