//package DataStructures.linkedlist.singly;
//
//class node2
//{
//    int data;
//    node2 next;
//    node2 prev;
//    node2(int data){
//        this.data=data;
//        this.prev =null;
//        this.next=null;
//    }
//}
//public class DLL {
//    node2 head;
//
//    DLL(){
//        head=null;
//    }
//    void insertHead(int val){
//        node2 n =new node2(val);
//        if (head!=null) {
//            n.next = head;
//            head.prev = n;
//        }
//        head=n;
//    }
//    void insertTAil(int val){
//        node2 n=new node2(val);
//        if(head==null){
//            head=n;
//            return;
//        }
//        node2 temp=head;
//       while(temp.next!=null){
//           temp = temp.next;
//       }
//       temp.next=n;
//       n.prev = temp;
//    }
//    void deleteATHead(){
//        if(head==null){
//            return;
//        }
//        node2 toDelete = head;
//        head=head.next;
//        if(head!=null){
//            head.prev = null;
//        }
//        toDelete = null;
//    }
//
//    void deletebyVal(int val) {
//        if (head==null){
//            return;
//        }
//        if (head.data==val){
//            deleteATHead();
//            return;
//
//        }
//        node2 temp = head;
//        while (temp.next.data != val) {
//            temp = temp.next;
//        }
//        if (temp==null){
//            System.out.println(" value not found");
//            return;
//        }
//        if(temp.prev!=null){
//            temp.prev.next = temp.prev;
//        }
//        node2 toDelete = temp.next;
//        temp.next = temp.next.next;
//        toDelete = null;
//    }
//    void display(){
//        node2 temp = head;
//
//        while(temp != null){
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
////        System.out.println("null");
//    }
//}
//class Driver2{
//    public static void main(String[] args) {
//        node sll=new node();
//        sll.insertHead(10);
//        sll.insertHead(20);
//        sll.insertHead(30);
//        sll.insertHead(40);
//        sll.insertHead(50);
//        sll.display();
//        sll.insertTAil(60);
//        System.out.println();
//        sll.display();
//        sll.deleteATHead();
//        System.out.println();
//        sll.display();
//        sll.deletebyVal(30);
//        System.out.println();
//        sll.display();
//    }
//}
