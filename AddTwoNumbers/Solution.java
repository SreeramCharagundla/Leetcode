public class Solution {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            
        ListNode dummy = new ListNode();
        ListNode cur = dummy;

        int carry = 0;
        while(l1!=null || l2!=null || carry!=0){
            int v1 = (l1!=null)?l1.val:0;
            int v2 = (l2!=null)?l2.val:0;

            int val = v1+v2+carry;
            carry = val/10;
            val = val%10;

            cur.next = new ListNode(val);
            cur = cur.next;

            l1 = (l1!=null)?l1.next:null;
            l2 = (l2!=null)?l2.next:null;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        
        ListNode result = addTwoNumbers(l1, l2);

        
        printList(l1);
        printList(l2);
        printList(result);

    }

    
    private static void printList(ListNode head) {
        if (head == null) {
            System.out.println("[]");
            return;
        }
        ListNode curr = head;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (curr != null) {
            sb.append(curr.val);
            if (curr.next != null) {
                sb.append(", ");
            }
            curr = curr.next;
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
