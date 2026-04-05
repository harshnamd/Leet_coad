class BrowserHistory {    
    public class Node{
        String a;
        Node next, prev;
        public Node(String a) {
            this.a = a;
            next = null;
            prev = null;
        }
    }    
    Node curr;
    public BrowserHistory(String homepage) {
        curr = new Node(homepage);
    }    
    public void visit(String a) {
        Node node = new Node(a);
        curr.next = node;
        node.prev = curr;
        curr = node;
    }    
    public String back(int steps) {
        while (curr.prev != null && steps-- > 0) {
            curr = curr.prev;
        }
        return curr.a;
    }    
    public String forward(int steps) {
        while (curr.next != null && steps-- > 0) {
            curr = curr.next;
        }
        return curr.a;
    }
}