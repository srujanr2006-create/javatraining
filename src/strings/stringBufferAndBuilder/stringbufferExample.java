package strings.stringBufferAndBuilder;

public class stringbufferExample {
    static void stringAppend(){
        StringBuffer sdf = new StringBuffer("hello");
        System.out.println("original string is: " + sdf);
        sdf.append(" world");
        System.out.println("new string is " + sdf);
    }
    static void stringInsert(){
        StringBuffer sdf = new StringBuffer("hello");
        System.out.println("original string is: " + sdf);
        sdf.insert(4,"world");
        System.out.println("new string is " + sdf);
    }
    static void stringReverse(){
        StringBuffer sdf = new StringBuffer("hello");
        System.out.println("original string is: " + sdf);
        sdf.reverse();
        System.out.println("new string is " + sdf);
    }

    public static void main(String[] args) {
        stringAppend();
        stringInsert();
        stringReverse();
    }
}
