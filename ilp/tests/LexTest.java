package tests;

import org.junit.Test;
import uem.Lexer;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LexTest {
    Lexer myUnit = new Lexer();
    HashMap<String, String[]> testVarLex = new HashMap<>();

    private void fillTestVarLex() {
        this.testVarLex.put("var1.lex.test",
                new String[]{"T_VAR", "ID", "T_EQUAL", "ID","T_PLUS","NUMBER_LITERAL","T_SEMICOLON"}
        );

        this.testVarLex.put("var2.doc.lex.test",
                new String[]{
                        "T_VAR", "ID", "T_COMMA", "ID", "T_EQUAL", "NUMBER_LITERAL",
                        "T_COMMA", "ID", "T_EQUAL", "NUMBER_LITERAL", "T_PLUS", "ID", "T_COLON",
                        "T_INT", "T_SEMICOLON",

                        "T_VAR", "ID","T_COMMA","ID","T_EQUAL", "STRING_LITERAL",
                        "T_COLON", "T_STRING","T_SEMICOLON",

                        "T_VAR","ID","T_COMMA","ID","T_EQUAL",
                        "T_TRUE","T_COLON","T_BOOL", "T_SEMICOLON",

                        "T_VAR","ID", "T_COMMA", "ID","T_LEFT_SQUARE","NUMBER_LITERAL",
                        "T_RIGHT_SQUARE", "T_COMMA","ID","T_LEFT_SQUARE","NUMBER_LITERAL","T_RIGHT_SQUARE",
                        "T_EQUAL", "T_LEFT_CURLY_BRACE","NUMBER_LITERAL","T_COMMA",
                        "NUMBER_LITERAL","T_COMMA","NUMBER_LITERAL","T_RIGHT_CURLY_BRACE",
                        "T_COLON", "T_INT","T_SEMICOLON"
                }
        );
    }

    @Test
    public void testLexVarAssign() throws IOException {
        this.fillTestVarLex();
        this.testVarLex.forEach((filename, wantedTokens) -> {
            try {
                assertEquals(
                        Arrays.toString(wantedTokens),
                        Arrays.toString(myUnit.getTokens(myUnit.lexFromCode(tests.TestUtils.GetFileContent(filename))).toArray())
                );
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }
}