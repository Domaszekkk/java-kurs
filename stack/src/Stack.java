public class Stack {
    private Node head;
    private int size;

    void push(int value) {
        head = new Node(head, value);
        size++;
    }

    int pop() {
        int value = head.getValue();
        head = head.getNext();
        size--;
        return value;
    }

    public void addFirst(int value) {

        Node newNode = new Node(null, value);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        Node temp = head;

        while (temp.getNext() != null) {
            temp = temp.getNext();
        }

        temp.setNext(newNode);
        size++;
    }

    public void remove(int value) {

        if (head == null) {
            return;
        }

        if (head.getValue() == value) {
            head = head.getNext();
            size--;
            return;
        }

        Node temp = head;

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