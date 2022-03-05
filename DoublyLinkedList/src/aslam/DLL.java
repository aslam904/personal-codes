package aslam;
    public class DLL {
        class Node{
            public int data;
            public Node prevNode;
            public Node nextNode;
            public Node(int data) {
                this.data = data;
            }
        }
        Node headNode, tailNode = null;
        public void addDLLNode(int data) {
            Node newDLLNode = new Node(data);
            if(headNode == null) {
                headNode = tailNode = newDLLNode;
                System.out.println("headnode is now "+headNode.data);
                System.out.println("tailnode is now "+tailNode.data);
                headNode.prevNode = null;
                //System.out.println("headnode.prev is now "+headNode.prevNode.data);
                tailNode.nextNode = null;
                //System.out.println("headnode.next is now "+headNode.nextNode.data);
            }
            else {
                tailNode.nextNode = newDLLNode;
                System.out.println("tail.next is now "+tailNode.nextNode.data);
                newDLLNode.prevNode = tailNode;
                System.out.println("newDLLNode.prev is now "+newDLLNode.prevNode.data);
                tailNode = newDLLNode;
                System.out.println("tailnode is now "+tailNode.data);
                tailNode.nextNode = null;
                //System.out.println("tail.next is now "+tailNode.nextNode.data);
            }
        }
        public void displayNode() {
            Node currentNode = headNode;
            if(headNode == null) {
                System.out.println("Doubly Linked List is empty");
                return;
            }
            System.out.println("Nodes in Doubly Linked List: ");
            while(currentNode != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.nextNode;
            }
        }

    }

