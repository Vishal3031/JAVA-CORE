import java.io.*;

class Writing_on_files {
    public static void main(String[] args) {
        
        try{
            FileWriter obj=new FileWriter("D:\\POGRAMMING\\JAVA PRACTICE\\Vishal Kumar\\Part 3\\File_Handling\\Writing_On_File.txt");
            try{
                obj.write("Hello guys my name is vishal kumar and nice to meet you !");
            }
            finally {    //finally block is basically use with try catch block bcz this block is run in any situation
                obj.close();    //this close method is use for close the current network connection, currect file project... in this i close the current writing project bcz any one can access it
            }
            System.out.println("Writting statement in file successfully:");
        }
        catch(IOException e){
            System.out.println("Something is Wrong inside the try block of program");
        }

    }
}
