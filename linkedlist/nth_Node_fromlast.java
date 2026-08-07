public ListNode removeNthFromEnd(ListNode head, int n) {
    if (head == null) {
        return null;
    }

    // Step 1: Find the size of the linked list
    int size = 0;
    ListNode temp = head;
    while (temp != null) {
        temp = temp.next;
        size++;
    }

    // Step 2: If removing the head node
    if (n == size) {
        return head.next;
    }

    // Step 3: Traverse to the node just before the one to be removed
    int ptf = size - n; // Position to find
    ListNode prev = head;
    int cp = 1; // Current position

    while (cp < ptf) {
        prev = prev.next; // Fixed typo: enxt -> next
        cp++;
    }

    // Step 4: Unlink the target node
    prev.next = prev.next.next;
    return head;
}







