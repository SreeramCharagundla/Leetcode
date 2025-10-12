class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){ this.val = val; }
    ListNode(int val, ListNode next){ this.val = val; this.next = next; }
}

public class Solution {

    
    static ListNode mergeSortedLists(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                tail.next = list1;
            }else{
                tail.next = list2;
            }
            tail = tail.next;
        }

        tail.next = (list1==null)?list2:list1;

        return dummy.next;
    }

    static void printList(ListNode head){
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + (cur.next != null ? " " : ""));
            cur = cur.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // List 1: 1 -> 2 -> 4
        ListNode n4 = new ListNode(4);
        ListNode n2 = new ListNode(2, n4);
        ListNode n1 = new ListNode(1, n2);

        // List 2: 1 -> 3 -> 4
        ListNode m4 = new ListNode(4);
        ListNode m3 = new ListNode(3, m4);
        ListNode m1 = new ListNode(1, m3);

        System.out.println("List 1:");
        printList(n1);
        System.out.println("List 2:");
        printList(m1);

        // Correct invocation:
        ListNode merged = mergeSortedLists(n1, m1);

        System.out.println("Merged:");
        printList(merged);
    }
}
