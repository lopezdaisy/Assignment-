
public class MMUSTLinkedIn {
    
    private Node head;
    private int size;
    
    private class Node {
        private Object data;
        private Node next;
        
        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }
    

    public void addFirst(Object data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    

    public void addLast(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
    
    
    public Object removeFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        Object data = head.data;
        head = head.next;
        size--;
        return data;
    }
    
    
    public Object removeLast() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        if (head.next == null) {
            Object data = head.data;
            head = null;
            size--;
            return data;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        Object data = current.next.data;
        current.next = null;
        size--;
        return data;
    }
    
    
    public int size() {
        return size;
    }
    
    
    public boolean isEmpty() {
        return size == 0;
    }
}
