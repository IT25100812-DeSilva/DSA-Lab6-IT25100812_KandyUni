package ex01;

class Tree {
    Node root;

    public Tree() {
        root = null;
    }

    public Node find(int emp) {
        Node current = root;

        while (current != null) {
            if (emp == current.empNumber) {
                return current;
            } else if (emp < current.empNumber) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
        }
        return null;
    }

    public void insert(int emp, String name) {
        Node newNode = new Node(emp, name);

        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        Node parent;

        while (true) {
            parent = current;

            if (emp < current.empNumber) {
                current = current.leftChild;
                if (current == null) {
                    parent.leftChild = newNode;
                    return;
                }
            } else {
                current = current.rightChild;
                if (current == null) {
                    parent.rightChild = newNode;
                    return;
                }
            }
        }
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.leftChild);
            localRoot.displayNode();
            inOrder(localRoot.rightChild);
        }
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node localRoot) {
        if (localRoot != null) {
            localRoot.displayNode();
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node localRoot) {
        if (localRoot != null) {
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            localRoot.displayNode();
        }
    }

    public Node findRecursive(int emp) {
        return findRecursive(root, emp);
    }

    private Node findRecursive(Node localRoot, int emp) {
        if (localRoot == null) {
            return null;
        }

        if (emp == localRoot.empNumber) {
            return localRoot;
        } else if (emp < localRoot.empNumber) {
            return findRecursive(localRoot.leftChild, emp);
        } else {
            return findRecursive(localRoot.rightChild, emp);
        }
    }

    public void deleteAll() {
        root = null;
        System.out.println("All nodes deleted.");
    }
}