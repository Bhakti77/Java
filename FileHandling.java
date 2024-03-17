/*ava FileWriter and FileReader classes are used to write and read data from text files 
(they are Character Stream classes)*/

//FileWriter is useful to create a file writing characters into it. 
//This class inherits from the OutputStream class.

/*In Java, the FileReader class is designed to read characters, not entire lines. If you want to read and process
 entire lines from a file, it's recommended to use BufferedReader in conjunction with FileReader,
as shown in the example I provided earlier. This approach is more efficient and convenient for reading text files line by line. */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

    public static void main(String[] args) throws IOException {
        
        //FILEREADER,FILEWRITER and BUFFEREDREADER
        // FileWriter fw = new FileWriter("C:/Users/bhakt/Java/xyz.txt");
        // FileReader fr = new FileReader("C:/Users/bhakt/Java/xyz.txt");
        // BufferedReader br = new BufferedReader(fr);

        // fw.write("File Handling practice\n It's good\n end");

        // System.out.println("Written successfully");

        // String line;
        // while ((line = br.readLine()) != null){
        //     System.out.println(line);
        // }
        // System.out.println("Reading done");

        // fw.close();
        // br.close();

        //Creating new file
        File file1 = new File("C:/Users/bhakt/Java/abc.txt");
        try{
            if (file1.createNewFile()){
                System.out.println("File created");
            }
            }
        catch (IOException io){

            System.err.println(io.getMessage());

        }

        System.err.println("Error");
       

    }   
}
