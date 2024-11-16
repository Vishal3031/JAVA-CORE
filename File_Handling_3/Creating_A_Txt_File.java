//creating a file, 

// import java.io.File;    //package
import java.io.*;          //package

class Creating_A_Txt_File {
    public static void main(String[] args)  //throws IOException //we can also use this instead of try_catch//this exception handled by JVM
    {
        //Here "File" is a class which comes inside I/O packages...
        File create=new File("D:\\POGRAMMING\\JAVA PRACTICE\\Vishal Kumar\\Part 3\\File_Handling\\created_File.pdf");  //when you inserted path here then make sure that path is in dual backward slash...

        try{   //we use this bcz if the file not found, and compiler not taking any risk
            if(create.createNewFile()) {   //CreateNewFile is a method, we use this for creating new file inside java programm
                System.out.print("File Successfull created");
            } else {
                System.out.print("file Already Exists");
            }
        }
        catch(IOException ref) {   //this exception we use when we work inside I/O package.... we use this inside try catch bcz if file is not their then what he gives you msg inside console.....   
            System.out.print("file not Found");
        }
    }
}