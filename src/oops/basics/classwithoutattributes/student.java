package oops.basics.classwithoutattributes;

public class student {
    String name;
    int usn;

    student(String name,int usn){
       this.name = name;
        this.usn = usn;

    }
    void printdetails(){
        System.out.println("student nmae is: " + name);
        System.out.println("student usn is: " + usn);
    }
}

class Driver{
    public static void main(String[] args) {
        student s1 = new student("srujan",111);
        student s2 = new student("sujith",113);

        s1.printdetails();
        s2.printdetails();

    }
}



