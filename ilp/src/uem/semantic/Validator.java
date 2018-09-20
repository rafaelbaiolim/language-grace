package uem.semantic;

import uem.ast.stmt.SpecVar;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Validator {

    public List<Error> verify() {
        LinkedList<Error> errors = new LinkedList<>();
        HashMap<String, SpecVar> checkAlredyDecl = new HashMap<>();

        return errors;
    }
}
