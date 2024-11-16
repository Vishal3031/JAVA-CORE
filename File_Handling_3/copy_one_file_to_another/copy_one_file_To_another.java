// package copy_one_file_to_another;
import java.io.*;
// import java.io.FileInputStream;
// import java.io.FileOutputStream;

public class copy_one_file_To_another {
    public static void main(String[] args) throws IOException{
        FileInputStream obj=new FileInputStream("D:\\POGRAMMING\\JAVA PRACTICE\\Vishal Kumar\\Part 3\\File_Handling\\copy_one_file_to_another\\Writing_On_File.txt");
        FileOutputStream obj1=new FileOutputStream("D:\\\\POGRAMMING\\\\JAVA PRACTICE\\\\Vishal Kumar\\\\Part 3\\\\File_Handling\\\\copy_one_file_to_another\\\\Copying_Writing_On_File.txt");

        int i;
        while((i=obj.read())!=-1) {
            obj1.write((char)i);
        }
        System.out.print("data copied successfull !");
    }
}
