// package Non_Static_Context;

public class Non_Static_Context {
    static String str="my name is vishal";   //static memeber (belong to the class, not instances)
    String str1="i'm from mirganj";      //non-static member (belong to each intance of the class)

    static void m1() {     //static method (class method)
        System.out.println("inside static method: ");      
        System.out.println("calling static variable: "+str+"\n\n");      //this is a static context, so we can only directly access static members

    //we can't access non-static inside satatic by directly
        //System.out.println("calling non-static variable: "+str1);     //Error

    }
    void m2() {      //non-static method (instance method)
            System.out.println("inside non-static method: ");
            System.out.println("calling static variable: "+str);      //accessing the static member directly
            System.out.println("calling non-static variable: "+str1);     //accessing the non-sattic member directly
    }

    public static void main(String[] args) {
        //calling static method inside static main method
            m1();

        //calling non-static method by creating instance of the class
            Non_Static_Context obj=new Non_Static_Context();
            obj.m2();
    }
}
