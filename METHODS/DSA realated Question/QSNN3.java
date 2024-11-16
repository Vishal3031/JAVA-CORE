//WAJP to create a method which is going to print square of a number...

import java.util.Scanner;
class QSNN3 {
    public static void m3() {
        System.out.println("enter a number for finding square");
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();

        System.out.print("Square of a number is: "+num*num);
    }
    public static void main(String[] args) {
        m3();
    }
}