#!/bin/bash
alreadyInstalled=`echo $CLASSPATH | grep antlr-4.7.1`;

if [ -z $alreadyInstalled ]; then
    cd /usr/local/lib && 
    curl -O http://www.antlr.org/download/antlr-4.7.1-complete.jar &&
    export CLASSPATH=".:/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH" 
    alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
    alias grun='java org.antlr.v4.gui.TestRig'
else 
    echo "Esta versão do antrl já está instalda. abraço :D "
    exit;
fi
