// package All modifiers with para in array;

public class QSNN3 {
    private static void m1(boolean []B, float[] f, double d[]) {
        System.out.println(B[0]+" "+f[0]+" "+d[0]+"\n");
    }
    static void m2(boolean b[], float[] F, double[] D) {
        System.out.println(b[0]+" "+F[0]+" "+D[0]+"\n");
    }
    protected static void m3(float[] F, double D[], boolean []b) {
        System.out.println(F[0]+" "+D[0]+" "+b[0]+"\n");
    }
    public static void m4(double[] C, float []g, boolean[] A) {
        System.out.println(C[0]+" "+g[0]+" "+A[0]+"\n");
    }
    public static void main(String[] args) {
        m1(new boolean[]{true}, new float[]{12.4f}, new double[]{23.43d});  //I initialize in actual args
        m2(new boolean[]{true}, new float[]{12.4f}, new double[]{23.43d});
        m3(new float[]{12.4f}, new double[]{23.43d},new boolean[]{true});
        m4(new double[]{123.3d}, new float[]{43.54f}, new boolean[]{false});
    }
}
