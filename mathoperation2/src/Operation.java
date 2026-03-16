public enum Operation {

    ADD("+", (a, b) -> a + b),
    SUBTRACT("-", (a, b) -> a - b),
    MULTIPLY("*", (a, b) -> a * b),
    DIVIDE("/", (a, b) -> {
        if (b == 0) {
            throw new ArithmeticException("debil");
        }
        return a / b;
    });

    private final String symbol;
    private final MathOperation operation;

    private Operation(String symbol, MathOperation operation) {
        this.symbol = symbol;
        this.operation = operation;
    }

    public int apply(int a, int b) {

        return operation.apply(a, b);
    }

    public String getSymbol() {

        return symbol;
    }

    public static Operation fromSymbol(String symbol) {
        for (Operation op : Operation.values()) {
            if (op.symbol.equals(symbol)) {
                return op;
            }
        }
        throw new IllegalArgumentException("unknown operation");
    }
}