//WAJP to create a method check the person is eligible to vote or not..
import java.util.Scanner;
class QSNN5 {
    public static void M1() {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int num=obj.nextInt();
        if(num>=18) {
            System.out.print("you are eligible to vote !");
        }else {
            System.out.println("you are not eligible to vote !");
        }
    }
    public static void main(String[] args) {
        M1();
    }
}
