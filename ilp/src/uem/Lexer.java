package uem;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;
import uem.antlr.IlpLexer;

import java.io.IOException;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;

public class Lexer {
    public IlpLexer lexFromCode(String code) throws IOException {
        return new IlpLexer(new ANTLRInputStream(new StringReader(code)));
    }

    public List<String> getTokens(IlpLexer lexer) {
        LinkedList<String> tokens = new LinkedList<>();
        Token t = lexer.nextToken();
        do {
            if (t.getType() == -1) {
                tokens.add("EOF");
            }else if (t.getType() != IlpLexer.WS) {
                tokens.add(lexer.ruleNames[t.getType() - 1]);
            }
            t = lexer.nextToken();
        } while (t.getType() != -1);
        return tokens;
    }

}
