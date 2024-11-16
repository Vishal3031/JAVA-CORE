public class ways_of_declaring_anotherUser_mainMethod {
    public static void main(String[] args) {    //JVM finds only this main method who have String array Type arguments
        System.out.println("hello vishal");
        main();
        main("vihaan");
    }
    public static void main(){
        System.out.println("hello vihaan");
    }
    public static void main(String args) {
        System.out.println("hello bishu");
    }
}
