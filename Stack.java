
public class Stack {
    
    private Node top;
    private int size;
    
    private class Node {
        private Object data;
        private Node next;
        
        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public void push(Object data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }
    
    public Object pop() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        Object data = top.data;
        top = top.next;
        size--;
        return data;
    }
    
    public Object peek() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        return top.data;
    }
    
    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
}
