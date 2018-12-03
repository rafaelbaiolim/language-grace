package uem.semantic;

import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;

public class ErrorReport extends DefaultErrorStrategy {

    public void reportNoViableAlternative(Parser recognizer, NoViableAltException e) {
        recognizer.notifyErrorListeners(e.getOffendingToken(),
                "no viable alternative found for input: " + e.getStartToken().getText(),
                e);
    }

}