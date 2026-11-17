class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
      return prev;
    }
  public static void main(String[] args){
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);

    ListNode result = reverseList(head);

    while(result != null){
      System.out.println(result.val + " ");
      result = result.next;
    }
  }
}

/output
  3 2 1

// time and space complexities
  time - O(n)
  space - O(1) - no new nodes!!
  
    
    
