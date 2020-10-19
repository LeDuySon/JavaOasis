public class Square extends Expression {
    private Expression expression;

    public Square() {
    }

    public Square(Expression express) {

        this.expression = express;
    }

    @Override
    public String toString() {
        return "(" + expression.toString() + ") ^ 2";
    }

    @Override
    public double evaluate() {
        return expression.evaluate() * expression.evaluate();
    }
}
