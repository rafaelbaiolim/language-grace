package uem.ast.expr;

public interface BinaryExpression extends Expression {
    Expression getLeft();

    Expression getRight();
}
