package DataStructures.linkedlist.singly;

class node1{
    int data;
    node1 next;
    node1(int data){
        this.data=data;
        this.next=null;
    }
}
public class node {
    node1 head;

    node(){
        head=null;
    }
    void insertHead(int val){
        node1 n =new node1(val);
        n.next=head;
        head=n;

    }
    void insertTAil(int val){
        node1 n=new node1(val);
        if(head==null){
            head=n;
            return;
        }
        node1 temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
    }
    void deleteATHead(){
        if(head==null){
            System.out.println("There are no elements");
        }
        node1 toDelete=head;
        head=head.next;
        toDelete=null;
    }

    void deletebyVal(int val) {
        if (head==null){
            return;
        }
        if (head.data==val){
            deleteATHead();
            return;

        }
        node1 temp = head;
        while (temp.next.data != val) {
            temp = temp.next;
        }
        if (temp.next==null){
            System.out.println(" value not found");
        }
        node1 toDelete = temp.next;
        temp.next = temp.next.next;
        toDelete = null;
    }
    void display(){
        node1 temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
//        System.out.println("null");
    }
}
class Driver{
    public static void main(String[] args) {
        node sll=new node();
        sll.insertHead(10);
        sll.insertHead(20);
        sll.insertHead(30);
        sll.insertHead(40);
        sll.insertHead(50);
        sll.display();
        sll.insertTAil(60);
        System.out.println();
        sll.display();
        sll.deleteATHead();
        System.out.println();
        sll.display();
        sll.deletebyVal(30);
        System.out.println();
        sll.display();
    }
}