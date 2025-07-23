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
        int length=0;
        ListNode current = head;
        while(current!=null){
            length++;
            current=current.next;
        }

        if(length==1 && n==1){
            head=null;
            return;
        }else if(length==n){
            head=head.next;
            return;
        }
        
        int j = length-n+1;
        System.out.println("j="+j);
        current = head;
        
        for(int i=0;i<(j-2);i++){
            System.out.println("at i="+i);
            System.out.println("curr val = "+current.val);
            current=current.next;
        }

        ListNode tempNode = current.next.next;
        current.next = tempNode;
        
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
