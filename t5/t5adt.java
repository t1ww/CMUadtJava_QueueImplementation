package t5;

public class t5adt {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(new Customer("joe"));
        q.enqueue(new Customer("mom"));
        q.enqueue(new Customer("gae"));
        System.out.println(q.front());
        q.dequeue();
        System.out.println(q.front());
    }
}