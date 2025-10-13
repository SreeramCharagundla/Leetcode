import java.util.HashMap;
import java.util.Map;

class Node{
    int val;
    Node next;
    Node random;
    public Node(int val){
        this.val=val;
    }
}

public class Solution {
    
    public static Node copyRandomList(Node head) {
        
        Map<Node,Node> oldToCopy = new HashMap<>();
        oldToCopy.put(null,null);

        Node curr = head;
        while(curr!=null){
            Node copy = new Node(curr.val);
            oldToCopy.put(curr,copy);
            curr = curr.next;
        }

        curr = head;

        while(curr!=null){
            Node copy = oldToCopy.get(curr);
            copy.next = oldToCopy.get(curr.next);
            copy.random = oldToCopy.get(curr.random);
            curr=curr.next;
        }

        return oldToCopy.get(head);

    }
    
    public static void main(String[] args) {
        
        Node[] nodes = new Node[5];
        nodes[0] = new Node(7); 
        nodes[1] = new Node(13); 
        nodes[2] = new Node(11); 
        nodes[3] = new Node(10); 
        nodes[4] = new Node(1); 

        // setting node.next pointers
        for(int i=0;i<nodes.length-1;i++){
            nodes[i].next = nodes[i+1];
        }

        // setting node.random pointers
        Integer[] randomIndices = {null,0,4,2,0};
        for(int i=0;i<nodes.length;i++){
            if(randomIndices[i]!=null){
                nodes[i].random = nodes[randomIndices[i]];
            }
        }

        Node head = nodes[0];

        Node copiedHead = copyRandomList(head);

        System.out.println("Original Linked List:");
        printList(head);
        System.out.println("\nCopied list:");
        printList(copiedHead);

    }
    
    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            int randomVal = (curr.random != null) ? curr.random.val : -1;
            System.out.print("[" + curr.val + ", random=" + randomVal + "] -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
