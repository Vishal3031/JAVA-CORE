public class calling_method_by_itself {
    public static void main(String[] args) {
        System.out.println("vihaan");
        m1();
        
    }
    public static void m1(){
        System.out.println("hello vishal");
        m1();
    }
}

//result comes in loop
