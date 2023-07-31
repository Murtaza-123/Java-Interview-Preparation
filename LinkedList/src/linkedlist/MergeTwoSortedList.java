package linkedlist;

public class MergeTwoSortedList {

    public static void main(String[] args) {
        LinkedList1 linkedlist = new LinkedList1();
        linkedlist.head1 = new Node(1);
        linkedlist.head1.next = new Node(2);
        linkedlist.head1.next.next = new Node(4);
        LinkedList2 linkedlist2 = new LinkedList2();
        linkedlist2.head2 = new Node(1);
        linkedlist2.head2.next = new Node(3);
        linkedlist2.head2.next.next = new Node(4);
        LinkedList3 linkedlist3 = new LinkedList3();
        linkedlist3.mergeTwoSortedLists(linkedlist.head1, linkedlist2.head2);
        linkedlist3.traversal3();

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

class LinkedList1 {

    Node head1;

    public void insert(int data) {
        Node node = new Node(data);
        if (head1 == null) {
            head1 = node;
        } else {
            Node n = head1;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }

    }

    public void traversal1() {
        Node n = head1;
        while (n != null) {
            System.out.print(n.data + " -->");
            n = n.next;
        }
    }
}

class LinkedList2 {

    Node head2;

    public void insert(int data) {
        Node node = new Node(data);
        if (head2 == null) {
            head2 = node;
        } else {
            Node n = head2;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }

    }

    public void traversal2() {
        Node n = head2;
        while (n != null) {
            System.out.print(n.data + " -->");
            n = n.next;
        }
    }
}

class LinkedList3 {

    Node head;

    public Node mergeTwoSortedLists(Node l1, Node l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.data <= l2.data) {
            l1.next = mergeTwoSortedLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoSortedLists(l2.next, l1);
            return l2;
        }
    }

    public void traversal3() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " -->");
            n = n.next;
        }
    }
}
