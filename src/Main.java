public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Linked List after insertion:");
        list.display();

        // Delete element
        list.delete(20);

        System.out.println("Linked List after deleting 20:");
        list.display();

        

    }
}
