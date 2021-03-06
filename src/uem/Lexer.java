package uem;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;
import uem.antlr.GraceLexer;

import java.io.IOException;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;

public class Lexer {
    public GraceLexer lexFromCode(String code) throws IOException {
        return new GraceLexer(new ANTLRInputStream(new StringReader(code)));
    }

    public List<String> getTokens(GraceLexer lexer) {
        LinkedList<String> tokens = new LinkedList<>();
        Token t = lexer.nextToken();
        do {
            if (t.getType() == -1) {
                tokens.add("EOF");
            }else if (t.getType() != GraceLexer.WS) {
                tokens.add(lexer.ruleNames[t.getType() - 1]);
            }
            t = lexer.nextToken();
        } while (t.getType() != -1);
        return tokens;
    }

}
