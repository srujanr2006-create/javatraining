package encapsulation;

public class newstudent {
    private String name;
     private int usn;

   newstudent(String name, int usn){
        this.name = name;
        this.usn = usn;

    }
    // getter() -- >  name
    String getname(){
       return name;
    }
    //getter() --> usn
    int getusn(){
       return usn;
    }
    //setter() --> nmae
    void setname(String n){
       name = n;
    }
    //setter() --> usn
    public void setUsn(int usn) {
       this.usn = usn;
    }

    void printdetails(){
        System.out.println("student nmae is: " + name);
        System.out.println("student usn is: " + usn);
    }
}

    class Driver{
        public static void main(String[] args) {
            newstudent s1 = new newstudent("srujan",111);
            newstudent s2 = new newstudent("sujith",113);

            s1.setname("abc");
            s2.setUsn(114);
            s1.printdetails();
            s2.printdetails();
            System.out.println(s1.getname());
            System.out.println(s1.getname());
        }
    }

