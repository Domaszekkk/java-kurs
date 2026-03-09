public class Node <T>{
    private final T value;
    private Node <T> next;

    public Node(Node<T> next, T value) {
        this.next = next;
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}