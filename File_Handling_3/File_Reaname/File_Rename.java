// package File_Reaname;
import java.io.*;
public class File_Rename {
    public static void main(String[] args) {
        File obj=new File("D:\\POGRAMMING\\JAVA PRACTICE\\Vishal Kumar\\Part 3\\File_Handling\\File_Reaname\\renameThis.txt");
        File obj1=new  File("D:\\POGRAMMING\\JAVA PRACTICE\\Vishal Kumar\\Part 3\\File_Handling\\File_Reaname\\RENAMED.txt");

        if(obj.exists()) {
            System.out.print(obj.renameTo(obj1));
        }else{
            System.out.print("file not found");
        }
    }
}
