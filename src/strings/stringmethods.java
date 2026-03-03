package strings;

public class stringmethods {
    public static void main(String[] args) {
        String s1 = "java programing";
        String s2 = new String("java programing");

        System.out.println("original string: " + s1);
        //length
        System.out.println("length: " + s1.length());

        //charAt
        System.out.println("character at index 2: " + s1.charAt(2));

        //toupperCase() and toolowerCase()
        System.out.println("upper case: " + s1.toUpperCase());
        System.out.println("lower case: " + s1.toLowerCase());

        // equals() and ==
        System.out.println("using == " + (s1==s2));
        System.out.println("using equals(): " + s1.equals(s2));

        // compareTo() --> lexicographical comarision (ASCII) comapre
        System.out.println("compareTo(): " + s1.compareTo(s2));

        //substring
        System.out.println("substring 0 to 4: " + s1.substring(0,4));

        //contain()
        System.out.println("containe 'program': " + s1.contains("program"));

        //indexOf()
        System.out.println("index of 'a' " + s1.indexOf('a'));

        //replace()
        System.out.println(" replace java to python: " + s1.replace("java", "python"));

        // trim()
        String s3 = "         hello world    ";
        System.out.println("before trim: " + s3);
        System.out.println("after trim: " + s3.trim());

        //concat()
        System.out.println("concat: " + s1.concat("language"));

        // isempty()
        String s4 = "";
        System.out.println("is empty: " + s4.isEmpty());

        //split()
        String sentence = "java is a programing language";
        String[] arr = sentence.split(" ");
        for(String i : arr){
            System.out.println(i);
        }

    }


}
