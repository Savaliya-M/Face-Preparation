class Nodet {
    int data;
    Nodet left = null;
    Nodet right = null;

    Nodet(int item) {
        this.data = item;
    }
}

public class tree {
    void inorder(Nodet root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    void preorder(Nodet root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    void postorder(Nodet root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    Nodet createnode(int item) {
        Nodet newnode = new Nodet(item);
        return newnode;
    }

    void insertleft(Nodet root, int item) {
        root.left = createnode(item);
    }

    void insertright(Nodet root, int item) {
        root.right = createnode(item);
    }
}

class tree_exe {
    public static void main(String[] args) {
        tree t1 = new tree();
        Nodet root = t1.createnode(1);
        t1.insertleft(root, 12);
        t1.insertright(root, 9);
        t1.insertleft(root.left, 5);
        t1.insertright(root.left, 6);
        t1.inorder(root);
        System.out.println("");
        t1.preorder(root);
        System.out.println("");
        t1.postorder(root);
        // while (true) {
        // if (root == null){
        // return createNode(data);
        // }
        // if (data < nodet.data)
        // node->left = insert(node->left, data);
        // else if (data > node->data)
        // node->right = insert(node->right, data);
        // return node;
    }

}
// }