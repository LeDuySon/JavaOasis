public class ExpressionTest {

    /**
     * asdasda asdasdsa.
     * @param args helloworld
     */
    public static void main(String[] args) {
        Expression numeric1 = new Numeral(10);
        Expression numeric2 = new Numeral(3);
        Expression numeric3 = new Numeral(4);
        Expression numeric4 = new Numeral(3);
        Expression squareE1 = new Square(numeric1);
        Expression subtractE = new Subtraction(squareE1, numeric2);
        Expression multiE  = new Multiplication(numeric3, numeric4);

        Expression addE = new Addition(subtractE, multiE);
        Expression squareE2 = new Square(addE);
        System.out.println(squareE2.toString());
        System.out.println(squareE2.evaluate());

    }
}
