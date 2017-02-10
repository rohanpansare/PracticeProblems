/**
 * Created by rohanpansare on 1/27/2017.
 */

// Delete a node in a singly linked list using one pointer.
    // 1 ->2 -> 3 -> 4
    //
public class LinkedList {

    public static Node removeNode(Node head , int data){
        Node temp = head;
        if(head == null ){
            return head;
        }
        if(head.data == data){
            temp = head.next;
            head = temp;
            return head;
        }
        while(temp.next !=null ){
            if(temp.next.data == data){
                temp.next = temp.next.next;
                return head;
            }
            temp = temp.next;
        }

        return head;
    }

    public static Node removeNodeRecursive(Node head , int data){
        if(head == null){
            return head;
        }
        if(head.data == data){
            head = head.next;
            return head;
        }
        if(head.next != null && head.next.data == data){
            head.next = head.next.next;
            return head;
        }
        Node temp = removeNodeRecursive(head.next , data);
        //System.out.println(temp.data);
        return head;
    }

    public static void main(String[] args) {
//        Node[] a = new Node[3];
//        for(int i = 0 ; i < 3 ; i++){
//            a[i] = new Node();
//            a[i].data = i;
//            //a[i].next = a[i+1];
//        }
//        for(int i = 0 ; i < 3 ; i++){
//            if(i==2){
//                a[i].next = null;
//                break;
//            }
//            a[i].next = a[i+1];
//        }
//        a[0]= removeNode(a[0],2);
        Node a = new Node();
        a.data = 0;
        Node b = new Node();
        b.data = 1;
        Node c = new Node();
        c.data = 2;
        a.next = b;
        b.next = c;
        Node head;// = removeNodeRecursive(a, 2);
        head = removeNode(a,0);
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }

    }
}
class Node{
    int data;
    Node next;
}


