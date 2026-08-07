class linklist {

    Node head;      // Declare head here
    private int size;

    linklist(){
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add first
    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    //delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //delete laast
    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        size--;

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }


    //print
    public void printList(){
        if(head == null){
            System.out.println("Line is empty");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }

        System.out.println("Null");
    }

    public static void main(String args[]) {

        linklist list = new linklist();
        list.addFirst("M");
        list.addFirst("a");

        list.printList();

        list.addLast("list");
        list.printList();

        list.deleteFirst();
        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());

    }
}