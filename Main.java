
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        // Testing removeAfter
        list.removeAfter(list.head.next);
        System.out.println("Linked list after removing node following the second node:");
        list.printList();

        // Testing copy
        LinkedList copiedList = list.copy(list.head);
        System.out.println("Copied linked list:");
        copiedList.printList();

        // Testing removeDuplicate
        list.insert(3);
        System.out.println("Linked list before removing duplicate nodes:");
        list.printList();
        list.removeDuplicate(list.head, 3);
        System.out.println("Linked list after removing nodes with value 3:");
        list.printList();

        // Testing max
        System.out.println("Maximum value in the linked list: " + list.max(list.head));
    }
}
