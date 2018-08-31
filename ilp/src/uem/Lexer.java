package uem;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;
import uem.antrl.IlpLex;

import java.io.IOException;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;

public class Lexer {
    public IlpLex lexFromCode(String code) throws IOException {
        return new IlpLex(new ANTLRInputStream(new StringReader(code)));
    }

    public List<String> getTokens(IlpLex lexer) {
        LinkedList<String> tokens = new LinkedList<>();
        Token t = lexer.nextToken();
        do {
            if (t.getType() == -1) {
                tokens.add("EOF");
            } else if (t.getType() != IlpLex.WS) {

                tokens.add(lexer.ruleNames[t.getType() - 1]);
            }
            t = lexer.nextToken();
        } while (t.getType() != -1);
        return tokens;
    }

}
