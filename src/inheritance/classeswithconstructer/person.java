package inheritance.classeswithconstructer;

import org.w3c.dom.ls.LSOutput;

public class person {
    String firstName;
    String lastName;

    person(String firstName,String lastNamme){
        this.firstName = firstName;
        this.lastName = lastNamme;
    }

}

class student extends person {
    int usn;

    student(String firstName, String lastName, int usn) {
        super(firstName, lastName);
        this.usn = usn;

    }

    void printdetails() {
        System.out.println("student name is" + firstName + lastName);
        System.out.println("student usn is" + usn);
    }
}
class Driver{
    public static void main(String[] args) {
        student s1 = new student("srujan", "rokkad", 111);
        s1.printdetails();
    }

    }
