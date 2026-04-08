package DataStructures.linkedlist.singly;

public class queue {

    int[] arr;
    int size;
    int front;
    int back;

    queue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        back = -1;
    }

    void push(int val) {
        if(front==1 || front>back){
            System.out.println("underflown");
            return;
        }
        front++;

    }

    void pop() {
        if (front == -1 || front > back) {
            System.out.println("underflown");
            return;
        }
        front++;
    }

    int peek() {
        if (front == -1 || front > back) {
            System.out.println("underflown");
            return -1;

        }
        return arr[front];
    }

    boolean isEmpty(){
        return (front==-1 || front > back);
    }
}
class driver {
    public static void main(String[] args) {
        queue q= new queue(5);
        q.push(4);
        q.push(5);
        q.push(3);
        q.push(6);
        q.push(9);

        System.out.println(q.peek());
q.pop();
    }
}