package oops.basics.classwithoutattributes;
//class
public class studentmarks {
    String name;
    int usn, sub1, sub2, sub3;
//contructer
    studentmarks(String name,int usn,int sub1,int sub2,int sub3){//parameterised constructer
        this.name = name;
        this.usn = usn;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }
    //printer
    void printdetails(){
        System.out.println("student name is:" + this.name);
        System.out.println("student usn is:" + this.usn);
        System.out.println("student marks in sub1:" + this.sub1);
        System.out.println("student marks in sub2:" + this.sub2);
        System.out.println("student marks in sub3:" + this.sub3);

    }

}
//main function
class driver{
    public static void main(String[] args) {
        studentmarks srm1 = new studentmarks("srujan",112,60,90,70);
        studentmarks srm2 = new studentmarks("suraj",113,30,90,50);
        studentmarks srm3 = new studentmarks("sumith",114,90,50,90);
        studentmarks srm4= new studentmarks("sagar",116,50,40,50);
//call function
        srm1.printdetails();
        srm2.printdetails();
        srm3.printdetails();
        srm4.printdetails();
    }


}
