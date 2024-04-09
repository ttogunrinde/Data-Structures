
class LinkedList {
    Node head;

    // Method to remove the node following the given node
    void removeAfter(Node node) {
        if (node == null || node.next == null)
            return;
        Node temp = node.next;
        node.next = temp.next;
        temp.next = null;
    }

    // Method to create a copy of the linked list
    LinkedList copy(Node node) {
        LinkedList newList = new LinkedList();
        Node current = node;
        while (current != null) {
            newList.insert(current.data);
            current = current.next;
        }
        return newList;
    }

    // Method to remove nodes with given key
    void removeDuplicate(Node node, int key) {
        Node current = node;
        while (current != null && current.next != null) {
            if (current.next.data == key) {
                Node temp = current.next;
                current.next = temp.next;
                temp.next = null;
            } else {
                current = current.next;
            }
        }
    }

    // Method to find the maximum value in the linked list
    int max(Node node) {
        if (node == null)
            return 0;
        int max = Integer.MIN_VALUE;
        while (node != null) {
            max = Math.max(max, node.data);
            node = node.next;
        }
        return max;
    }

    // Method to insert a new node at the end
    void insert(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    // Method to print the linked list
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
