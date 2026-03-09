public class Stack<T> {
    private Node<T> head;
    private int size;

    public void push(T value) {
        head = new Node<>(head, value);
        size++;
    }

    public T pop() {
        T value = head.getValue();
        head = head.getNext();
        size--;
        return value;
    }

    public void addFirst(T value) {

        Node<T> newNode = new Node<>(null, value);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        Node<T> temp = head;

        while (temp.getNext() != null) {
            temp = temp.getNext();
        }

        temp.setNext(newNode);
        size++;
    }

    public void remove(T value) {

        if (head == null) {
            return;
        }

        if (head.getValue() == value) {
            head = head.getNext();
            size--;
            return;
        }

        Node<T> temp = head;

        while (temp.getNext() != null) {

            if (temp.getNext().getValue() == value) {
                temp.setNext(temp.getNext().getNext());
                return;
            }

            temp = temp.getNext();
            size--;
        }
    }

    public int size() {
        return size;
    }
}