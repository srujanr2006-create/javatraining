package strings;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "rcb";
        String s2 = "Rcb";
        String s3 = new String("RCB");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }
}
