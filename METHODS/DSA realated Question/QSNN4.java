//WAJP create a method which is going to check that number is even or odd..
import java.util.Scanner;
class QSNN4 {
    public static void M1() {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=obj.nextInt();
        if(num%2==0) {
            System.out.print("your number is even: "+num);
        }else {
            System.out.println("number is odd: "+num);
        }
    }
    public static void main(String[] args) {
        M1();
    }
}