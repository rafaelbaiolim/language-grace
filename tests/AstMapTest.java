import org.junit.Test;
import uem.Lexer;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class AstMapTest {
    Lexer myUnit = new Lexer();
    HashMap<String, String[]> testEqualsVarLex = new HashMap<>();
    HashMap<String, String[]> testNotEqualsVarLex = new HashMap<>();

    enum TypeTest {
        EQUALS,
        NOT_EQUALS
    }

    protected void assertEq(String filename, String[] wantedTokens, TypeTest typeTest) throws IOException {
        String recived = Arrays.toString(wantedTokens);
        String wanted = Arrays.toString(myUnit.getTokens(
                myUnit.lexFromCode(tests.TestUtils.GetFileContent(filename)))
                .toArray());

        switch (typeTest) {
            case EQUALS:
                assertEquals(recived, wanted);
                break;
            case NOT_EQUALS:
                assertNotEquals(recived, wanted);
                break;
        }
    }


    @Test
    public void testLexVarAssign() throws IOException {
    }
}