
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }}


class Linked{
    Node head;
    Linked(){
        head = null;
    }

    void insert(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
    void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data +" ");
            current = current.next;
        }
        System.out.print("null");
    }
    void remove(){
        if(head == null || head.next == null){
            head = null;
        } 
        else{
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
        }
    }
    void removeany(int val){
        Node temp = head;
        if(head.data == val){
            head = null;
            return ;
        }
        while(temp.next!= null){
            if(temp.next.data == val){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }


    }
}


public class Linkedlist {
    public static void main(String[] args){
        Linked ll = new Linked();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.display();
        ll.remove();
        System.out.println();
        ll.display();
        ll.removeany(20);
        System.out.println();
        ll.display();
    }
}
