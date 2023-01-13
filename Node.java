import java.util.*;

public class Node {
    int data;
    Node next = null, head = null, tail = null;

    Node(int value) {
        data = value;
        next = null;
    }

    Node() {
    }

    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void insert(int d) {
        Node new_node = new Node(d);
        if (head == null) {
            head = new_node;
            tail = new_node;
        } else {
            tail.next = new_node;
            tail = new_node;
        }
    }

    void insert_last(int d) {
        Node new_node = new Node(d);
        if (head == null) {
            head = new_node;
            tail = new_node;
        } else {
            new_node.next = head;
            head = new_node;
        }
    }

    void delete() {
        if (head == null || head.next == null) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
    }

    void delete_last() {
        if (head == null || head.next == null) {
            head = null;
            tail = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            tail = temp;
            temp.next = null;
        }
    }

    public static void main(String[] args) {
        Node l = new Node(66);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != -1) {
            l.insert(n);
            n = sc.nextInt();
        }
        l.display();
        System.out.println("After inserting node at beginning");
        l.insert_last(9898);
        l.display();
        System.out.println("After deleting last node");
        l.delete_last();
        l.display();
    }
}
