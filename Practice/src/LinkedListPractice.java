public class LinkedListPractice {
    public class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
            this.next=null;
        }
    }
    public Node first;
    public Node last;
    public int size;
    //Constructors-----------------
    public LinkedListPractice() {
        this.first=null;
        this.last=null;
        this.size=0;
    }
    //Methods--------------------
    public boolean isEmpty() {
        return first == null;
    }
    public void addLast(int item) {
        var node = new Node(item);
        //System.out.println("adding item: "+item);
        if (isEmpty())
            first = last = node;
        else {
            last.next=node;
            last = node;
        }
        size++;
    }


}