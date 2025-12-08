
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
}


public class Linkedlist {
    public static void main(String[] args){
        Linked ll = new Linked();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.display();
    }
}
