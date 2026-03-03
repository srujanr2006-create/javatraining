package strings.stringBufferAndBuilder;

public class stringbufferbuildertest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("hello");
        for (int i = 0; i < 1000000; i++) {
            sbf.append("world");
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("time taken by the sbf: " + (stopTime - startTime) + "ms");

        // stringbuilder
        startTime = System.currentTimeMillis();
        StringBuilder sbl = new StringBuilder(" hello");
        for(int i = 0; i < 1000000; i++) {
            sbf.append("world");
        }
        stopTime = System.currentTimeMillis();
        System.out.println("time taken by the sbl: " + (stopTime - startTime) + "ms");

    }
}