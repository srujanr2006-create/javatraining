package strings.builderExample;

public class stringbuilderexample {
        static void stringAppend(){
            StringBuilder sdf = new StringBuilder("hello");
            System.out.println("original string is: " + sdf);
            sdf.append(" world");
            System.out.println("new string is " + sdf);
        }
        static void stringInsert(){
            StringBuilder sdf = new StringBuilder("hello");
            System.out.println("original string is: " + sdf);
            sdf.insert(4,"world");
            System.out.println("new string is " + sdf);
        }
        static void stringReverse(){
            StringBuilder sdf = new StringBuilder("hello");
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

