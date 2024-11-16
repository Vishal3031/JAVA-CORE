// package All modifiers with para in array;

public class QSNN2 {
    private static void m1(float []num) {
        System.out.println(num[0]);
    }
    static void m2(float []num1) {
        System.out.println(num1[0]);
    }
    protected static void m3(float []num1) {
        System.out.println(num1[0]);
    }
    public static void m4(float[] num1) {
        System.out.println(num1[0]);
    }

    public static void main(String[] args) {
       //passing array directly as an actual args
        m1(new float[]{12.3f});
        m2(new float[]{13.4f});
        m3(new float[]{23.4f});
        m4(new float[]{34.5f});
    }
}
