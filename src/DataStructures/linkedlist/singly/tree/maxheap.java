package DataStructures.linkedlist.singly.tree;

public class maxheap {
    int[] arr;
    int maxsize;
    int heapsize;

    maxheap(int maxsize){
        this.maxsize = maxsize;
        this.heapsize = 0;
        this.arr = new int[maxsize];
    }
    int parent(int i){return (i-1) / 2;}
    int leftchild(int i){return 2*i +1;}
    int rightchild(int i){return 2*i + 2;}
    void heapify(int i){
        int left = leftchild(i);
        int right = rightchild(i);

        int largest = i;
        if (arr[left] > arr[largest]){
            largest = left;
        }
        if(arr[right] > arr[largest] ){
            largest = right;
        }
        if(largest !=1){
            swap(i,largest);
            heapify(largest);
        }
    }


    void swap(int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    void insert(int key){
        if(heapsize == maxsize){
            System.out.println("overflown,could not insert");
        }
        heapsize++;
        int index = heapsize - 1;
        arr[heapsize-1]=key;

        while (arr[parent(index)] < arr[index]) {
            swap(index,parent(index));
            index = parent(index);
        }
    }
    int extaractMax(){
        if(heapsize<=0){
            return-1;
        }
        int root= arr[0];
        arr[0]=arr[heapsize-1];
        heapsize--;
        heapify(0);

        return root;
    }
    void increasekey(int i,int newVal){
        arr[i]=newVal;
        while(arr[parent(i)]<arr[i]){
            i=parent(i);
        }
    }
    void removekey(int i){
        increasekey(i,Integer.MAX_VALUE);
        extaractMax();
    }
}
