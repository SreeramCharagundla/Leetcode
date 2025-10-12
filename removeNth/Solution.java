package removeNth;

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

    private void removeNthfromEnd(ListNode head, int n) {
        int len=0;
        ListNode curr = head;
        while(curr!=null){
            len+=1;
            curr=curr.next;
        }

        if(len==1 && n==1){
            head=null;
            return;
        }else if(len==n){
            head=head.next;
            return;
        }

        int j = len - n + 1;
        curr = head;

        for(int i=0;i<(j-1);i++){
            curr = curr.next;
        }

        curr.next = curr.next.next;
        
        return;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        
        int n = 2;

        Solution solution = new Solution();
        solution.removeNthfromEnd(head,n);

        //Printing the reordered List
        ListNode current = head;
        while(current!=null){
            System.out.print(current.val+" ");
            current=current.next;
        }
    }
}
