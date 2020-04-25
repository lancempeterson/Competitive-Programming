class Node {
    int key;
    int val;
    Node next;
    Node prev;
}

class LRUCache {

    int capacity;
    HashMap<Integer,Node> map;
    final Node head = new Node();
    final Node tail = new Node();
    
    public LRUCache(int capacity) {
        map = new HashMap<>();
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        Node node = map.get(key);
        if (node != null){
            remove(node);
            add(node);
            return node.val;
        } else {
            return -1;
        }
    }
    
    public void put(int key, int value){
        Node node = map.get(key);
        if (node != null){
            remove(node);
            node.val = value;
            add(node);
        } else {
            if (map.size() == capacity){
                map.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node newNode = new Node();
            newNode.key = key;
            newNode.val = value;
            add(newNode);
            map.put(key,newNode);
        }
    }
   
    //Add Node to the Linked List
    public void add(Node node){
        Node headNext = head.next;
        node.next = headNext;
        headNext.prev = node;
        head.next = node;
        node.prev = head;
    }
    
    //Remove Node from the Linked List
    public void remove(Node node){
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */