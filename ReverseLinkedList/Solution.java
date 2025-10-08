

class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){this.val = val;}
    ListNode(int val, ListNode next){this.val=val; this.next=next;}
}


public class Solution {
    
    
    static ListNode ReverseLL(ListNode head){
        ListNode previous = null;
        ListNode current = head;

        while(current!=null){
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }
    
    public static void main(String[] args) {
        ListNode n4 = new ListNode(4);
        ListNode n3 = new ListNode(3,n4);
        ListNode n2 = new ListNode(2,n3);
        ListNode n1 = new ListNode(1,n2);

        ListNode abc = n1;
        while (abc != null) {
            System.out.print(abc.val + " ");
            abc = abc.next;
        }

        ListNode revList = ReverseLL(n1);
        
        System.out.println();
        System.out.println("Printing reverse now");
        System.out.println();
        ListNode curr = revList;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
