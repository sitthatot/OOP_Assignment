public class pro3_64010889_week6 {

    public static void main(String[] args) {
        Queue queue = new Queue();

        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
        }
        while (!queue.empty()) {
            System.out.println(queue.dequeue());
        }
    }
}
