// package Static_Non_Static_Context.Static_Context;
class Static_Contaxt {
    //static variable
    static int num=0;

    //static method
    public static void M1() {
        num++;     //direct access to static variable without using class name
        System.out.println("inside M1 method: "+num);
    }

    //static block
    static {
        System.out.println("inside the multi line static initializer");
        num=10;     //direct access to static variable
        M1();    //direct call to static method
    }
    public static void main(String[] args) {
        System.out.println("inside the main method");

        //direct access to static method
        M1();   //no need for Static_contaxt.M1(),.. you can call directly
    }
}