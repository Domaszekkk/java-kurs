public class Test {

    public static void main(String[] args) {

        Stack <String> stack = new Stack<>();

        stack.push("1");
        stack.push("2");

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Stack <Pair<String, Integer>> stack2 = new Stack<>();

        stack2.push(new Pair<>("wartosc", 5));
        stack2.push(new Pair<>("wartosc2", 6));
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());

        Stack<Triple<String, Integer, Pair<String, Integer>>> stack3 = new Stack<>();
        stack3.push(new Triple<>("wartosc3", 7, new Pair<>("arka gdynia", 69)));
        System.out.println(stack3.pop().pair());
    }
}