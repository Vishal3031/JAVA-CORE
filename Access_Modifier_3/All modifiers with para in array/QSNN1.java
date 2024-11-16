//way of declaration of array with all access modifier...
class QSNN1 {
    private static void m1(int a[]) {
        for(int obj: a) {
            System.out.println(obj);
        }
        System.out.print("\n\n\n");
    }
    static void m2(int a[]) {
        for(int i=0; i<=a.length-1;i++) {
            System.out.println(a[i]);
        }
        System.out.print("\n\n\n");

    }
    protected static void m3(int c[]){
        int i=0;
        while(i<=c.length-1) {
            System.out.println(c[i]);
            i++;
        }
        System.out.println("\n\n\n");
    }
    public static void m4(int[] d){
        int j=0;
        do { 
            System.out.println(d[j]);
            j++;
        } while(j<=d.length-1);
    }
    

    public static void main(String[] args) {
        // int a[]={12,23,43,12,34};
        //int a=new int[5];

        int a[];
        a=new int[5];
        a[0]=2;
        a[1]=3;
        a[2]=10;
        a[3]=40;
        a[4]=50;

        m1(a);
        m2(a);
        m3(a);
        m4(a);
    }
}