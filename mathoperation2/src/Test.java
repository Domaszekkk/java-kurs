public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        String symbol = "*";
        Operation operation = Operation.fromSymbol(symbol);
        int result = calculate(a, b, operation::apply);
        System.out.println(result);
    }

    public static int calculate(int a, int b, MathOperation operation) {
        return operation.apply(a, b);
    }
}