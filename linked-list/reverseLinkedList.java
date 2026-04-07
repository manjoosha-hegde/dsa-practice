class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class reverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode curr = head, prev = null, tmp;

        while (curr != null) {
            tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }

        return prev;
    }

    // ✅ MAIN METHOD
    public static void main(String[] args) {

        // Create linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        reverseLinkedList obj = new reverseLinkedList();
        ListNode reversedHead = obj.reverseList(head);

        // Print reversed list
        System.out.print("Reversed List: ");
        while (reversedHead != null) {
            System.out.print(reversedHead.val + " -> ");
            reversedHead = reversedHead.next;
        }
        System.out.println("null");
    }
}