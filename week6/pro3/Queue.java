public class Queue {
    private int[] elements;
    private int size;

    public Queue() {
        elements = new int[8];
    }

    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = v;
    }

    public int dequeue() {
        if (empty()) {
            return 0;
        }
        int result = elements[0];
        System.arraycopy(elements, 1, elements, 0, --size);
        return result;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
