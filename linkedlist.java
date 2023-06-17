import java.util.*;

class node {
    int data;
    node next;

    node(int in) {
        data = in;
    }
}

public class linkedlist {
    static node head;

    void inatbeg(int dd) {
        node n = new node(dd);
        n.next = head;
        head = n;
    }

    void inatlast(int dd) {
        node n = new node(dd);
        if (head == null) {
            n.next = head;
            head = n;
        } else {

            node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = n;
        }
    }

    void dellast() {
        if (head == null) {
            System.out.println("no node available to delete");
        } else if (head.next == null) {
            head = null;
        } else {
            node ptr = head;
            while (ptr.next.next != null) {
                ptr = ptr.next;
            }
            ptr.next = null;
        }
    }

    void delfirst() {
        if (head == null) {
            System.out.println("no node available to delete");
        } else {
            head = head.next;
        }
    }

    void display() {
        node ptr = head;
        while (ptr != null) {
            System.out.println(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println("************");
        System.out.println();
    }

    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int len = a + b;

        for (int i = 0; i < len; i++) {
            int val = sc.nextInt();
            l.inatlast(val);
        }

        for (node temp = head; temp != null; temp = temp.next) {
            for (node temp1 = temp.next; temp1 != null; temp1 = temp1.next) {
                if (temp.data > temp1.data) {
                    int t = temp.data;
                    temp.data = temp1.data;
                    temp1.data = t;
                }
            }
        }

        l.display();
    }
}
