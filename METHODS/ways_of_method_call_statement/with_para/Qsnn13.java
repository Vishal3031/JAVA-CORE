public class Qsnn13 {
    public static int m1() {
        System.out.println("hello vishal");
        return 5;
    }

    public static void main(String[] args) {
        int B= m1() + m1();     //hello vishal, hello vishal, 10
        System.out.println(B);
    }
}
