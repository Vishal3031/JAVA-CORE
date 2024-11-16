
// import java.io.*; 
import java.io.File;
public class Reading_File_Info_In_Console_With_Output {
    public static void main(String[] args) {
        File obj=new File("D:\\POGRAMMING\\JAVA PRACTICE\\Vishal Kumar\\Part 3\\File_Handling\\created_File.txt");
    
        if(obj.exists()) {     //use when file is already exists, then it will eneterd inside if statement otherwise skip
            System.out.println("File name is: "+obj.getName());     //use for know that file name 
            System.out.println("File location is: "+obj.getAbsolutePath());     //use for know that particular file loaction
            System.out.println("file is readable: "+obj.canRead());    //use for know, can we read that file //it return as true/false
            System.out.println("File is Writable: "+obj.canWrite());    //use for know, can we write inside that file  //it return as true/false
            System.out.println("File Size is: "+obj.length());      //use for know the length of that file
            //System.out.println("File removed: "+obj.delete());    //use for delete that file   //it return as true/false
            System.out.println("File is Exists: "+obj.exists());    //use for know the file is exists // it return as true/false
        }else {
            System.out.print("File not exists");
        }

    }
}
