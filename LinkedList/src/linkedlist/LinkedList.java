package linkedlist;

public class LinkedList {

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insert(1);
        sll.insert(1);
        sll.insert(2);
        sll.insert(3);
        sll.insert(3);
        sll.remove();
        // sll.insert(20);
        // sll.delete(10);
        sll.traverse();
    }

}

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        Node next = null;
    }

}

class SinglyLinkedList {

    Node head;

    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void traverse() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + "--> ");
            n = n.next;
        }

    }

    public void delete(int x) {
        Node n = head;
        while (n.next != null) {
            if (x == n.next.data) {
                break;
            }
            n = n.next;
        }
        n.next = n.next.next;

    }

    public Node removeDuplicates(Node head) {
        Node n = head;
        if (n == null && n.next == null) {
            return n;
        }
        while (n != null && n.next != null) {
            if (n.data == n.next.data) {
                n.next = n.next.next;
            } else {
                n = n.next;
            }
        }
        return n;
    }

    public void remove() {
        Node n = head;
        removeDuplicates(n);
    }

}
