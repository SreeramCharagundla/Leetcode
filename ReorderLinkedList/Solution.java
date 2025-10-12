public class Solution {

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val=val;}
        ListNode(int val,ListNode next){
            this.val=val;
            this.next = next;
        }
    }

    public void reorderList(ListNode head){
        
        if(head==null || head.next==null) return;

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        slow.next=null;
        second = reverseList(second);
        ListNode first = head;

        while(second!=null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while(head!=null){
            ListNode nextTemp = head.next;
            head.next = prev;
            prev = head;
            head = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        // head.next.next.next.next = new ListNode(5);

        Solution solution = new Solution();
        solution.reorderList(head);

        //Printing the reordered List
        ListNode current = head;
        while(current!=null){
            System.out.print(current.val+" ");
            current=current.next;
        }
    }

}
