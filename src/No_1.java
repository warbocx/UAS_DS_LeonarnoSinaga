import java.util.ArrayDeque;

public class No_1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> stackQueue = new ArrayDeque<>();

        // Insertion (Push) pada stack
        stackQueue.push(1);
        stackQueue.push(2);
        stackQueue.push(3);

        // Show stack
        System.out.println("Isi Stack: " + stackQueue);

        // Deletion (Pop) pada stack
        int deletedStack = stackQueue.pop();
        System.out.println("Yang dihapus dari Stack: " + deletedStack);
        System.out.println("Stack setelah dihapus: " + stackQueue);
        System.out.println();

        // Insertion (Offer) pada queue
        stackQueue.offer(4);
        stackQueue.offer(5);
        stackQueue.offer(6);

        // Show queue
        System.out.println("Isi Queue: " + stackQueue);

        // Deletion (Poll) pada queue
        int deletedQueue = stackQueue.poll();
        System.out.println("Yang dihapus dari Queue: " + deletedQueue);
        System.out.println("Queue setelah dihapus: " + stackQueue);
    }
}
