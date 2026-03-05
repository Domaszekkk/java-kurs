public class Test {

    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.addFirst(5);
        stack.addFirst(8);

        System.out.println(stack.size());
        System.out.println();
        stack.remove(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println();
        System.out.println(stack.size());
    }
}