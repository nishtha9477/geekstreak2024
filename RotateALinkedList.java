public class RotateALinkedList {
    
    public Node rotate(Node head, int k) {
        Node last = head;
        while(last.next != null){
            last=last.next;
        }
        last.next = head;
        while(k>1){
            head = head.next;
            k--;
        }
        Node temp = head;
        head = head.next;
        
        temp.next= null;
        return head;
    }
}
