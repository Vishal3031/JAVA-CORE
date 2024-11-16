public class Qsnn14 {
    public static int m1(int B) {
        System.out.print(B);
        System.out.println("hello vishal");
        return B;
    }

    public static void main(String[] args) {
        //int C= m1(10) + m1(15);     //10 hello vishal, 15 hello vishal, 10
        int C= m1(10) + m1(15);     //10 hello vishal, 15 hello vishal, 25

        System.out.println(C);
    }
}
