//WAJP to create a method which is going to print average of 5 number...
import java.util.Scanner;
class QSNN2 {
    public static void M2() {
        System.out.println("Enter 5 number to find the average of these number: ");
        Scanner obj=new Scanner(System.in);
        
        int store=0;
        int num=0;
        for(int i=1; i<=5; i++) {
            int a=obj.nextInt();
            // System.out.println(a);
            store=i;
            num= num+a;
        }
        System.out.println("the average of 5 number is: "+num/store);
    }
    public static void main(String[] args) {
        M2();
    }
}