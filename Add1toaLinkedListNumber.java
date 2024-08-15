import javafx.scene.Node;

public class Add1toaLinkedListNumber {
    public Node addOne(Node head) {
        if( head == null){
            return null;
        }
        int carry = addHelper(head);
        if(carry ==1){
            Node newNode = new Node(1);
            newNode.next = head;
            head = newNode;
        }
        return head;
    }
    int addHelper(Node temp){
        if(temp == null){
            return 1;
        }
        int carry = addHelper(temp.next);
        if(carry == 0){
            return 0;
        }
        temp.data += carry;
        
        if(temp.data < 10){
            return 0;
        }
        temp.data = 0;
        return 1;
    }
    
}
