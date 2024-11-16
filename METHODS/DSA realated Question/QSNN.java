//WAJP create a mthod which is going to check the char is upper case character or not...

import java.util.Scanner;
class QSNN {
    public static void m1() {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a character to check the number is upper case or not:");
        char ch=obj.next().charAt(0);

        if(ch>=65 && ch<=90) {    //also you can use type-casting operator
            System.out.print("it is upper case character: "+ch);
        }
        else{
            System.out.print("it is non-upper case character");
        }
    }

    public static void main(String[] args) {
        m1();
    }
}



