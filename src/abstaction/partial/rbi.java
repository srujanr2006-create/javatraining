package abstaction.partial;

abstract class rbi {
        abstract int roi();
    }
    class hdfc extends rbi{
        int roi(){
            return 10;
        }
    }
    class sbi extends rbi{
        int roi(){
            return 6;
        }
    }
    class driver{
        public static void main(String[] args) {
            hdfc b = new hdfc();
            sbi s = new sbi();
            System.out.println( b.roi());
            System.out.println(s.roi());

        }
    }

