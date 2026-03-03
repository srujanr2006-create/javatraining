package oops.basics.classwithoutattributes;

import org.w3c.dom.ls.LSOutput;

public class demo {
    void printDemo(){
        System.out.println("Demoo");
    }
}

class driverCode{
    public static void main(String[] args) {
        demo obj = new demo();
        obj.printDemo();
    }
}
