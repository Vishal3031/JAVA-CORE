// package Reading_in file;
import java.io.*;
public class Reading_file {
    public static void main(String[] args) {
        int i;
        try {
            FileReader obj=new FileReader("D:\\POGRAMMING\\JAVA PRACTICE\\Vishal Kumar\\Part 3\\File_Handling\\Writing_in_file\\Writing_On_File.txt");
            try {
                while((i=obj.read())!=-1) {
                    System.out.print((char)i);
                }
                System.out.print("\n\ncompleted reading file");
            } 
            finally {
                obj.close();
            }
            
        } catch (IOException e) {
            System.out.print("exception found in catch block");
        }
    }
}
