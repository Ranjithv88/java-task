import java.io.*;

public class FileHandling {
     public static void main(String[] args) {
         String data = "Hello, this is a Java file handling test.";
         try (BufferedWriter writer = new BufferedWriter(new FileWriter("testfile.txt"))) {
             writer.write(data);
             System.out.println("Data written to file.");
         } catch (IOException e) {
             e.printStackTrace();
         }
         try (BufferedReader reader = new BufferedReader(new FileReader("testfile.txt"))) {
             String line;
             while ((line = reader.readLine()) != null) {
                 System.out.println("File content: " + line);
             }
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
}

