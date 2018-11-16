package uem.validator;

import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;

public class ErrorReport extends DefaultErrorStrategy {

    public void reportNoViableAlternative(Parser recognizer, NoViableAltException e) {
        recognizer.notifyErrorListeners(e.getOffendingToken(),
                "nenhuma alternativa encontrada para a entrada: " + e.getStartToken().getText(),
                e);
    }

}