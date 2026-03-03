package strings;

public class stringhimmutable {
    public static void main(String[] args) {
        String s1 = "hello";
        s1.concat("world");
        System.out.println(s1);

        String s2 = s1.concat("world");
        System.out.println(s1);
        System.out.println(s2);
    }
}
