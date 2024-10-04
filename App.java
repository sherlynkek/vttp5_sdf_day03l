import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import service.CSVManagement; 

public class App {

    public static void main(String[] args) throws IOException {

        // args[0] args[1] args[2]
        // args[0] "c:\data"
        // args[1] myfile.txt
        // windows: c:\data\myfile.txt

        String dirPath = args[0];
        String fileName = args[1];
        
        // e.g. c:\data\myfile.txt
        String dirPathFileName = dirPath + File.separator + fileName;


        // check if directory exists
        // if directory does not exist, create the directory
        File directory = new File(dirPath);

        if (directory.exists()) {
            System.out.println("Directory " + directory.toString() + " had been already created.");
        } else {
            directory.mkdir();
        }

        // check if the file exists
        // if file does not exist, create the file
        File file = new File(dirPathFileName);

        if (file.exists()) {
            System.out.println("File " + file.toString() + " already created.");
        } else {
            file.createNewFile();
        }

        // Example 1
        // Use FileWriter
        // 1. Use console to read in a string of text (sentence)
        // 2. Use FileWriter to write the content to the file
/*      Console console = System.console();
        String keyboardInput =console.readLine("Enter/Input a sentence: ");

        FileWriter fw = new FileWriter(file, true);
        fw.write(keyboardInput);
        fw.flush();
        fw.close();

        // Use FileReader to read the file
        FileReader fr = new FileReader(file);
        int dataRead = fr.read();
        while(dataRead != -1) {
            System.out.print((char) dataRead);
            dataRead = fr.read();
        }
        fr.close(); */


        /* // Example 2
        // Use BufferedWrite to write to file
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.append(keyboardInput);
        bw.flush();
        bw.close();

        // Use BufferedReader to read the file content
        try (FileReader fr = new FileReader(file)) {
            try (BufferedReader br = new BufferedReader(fr)) {
                String line = "";
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
             }
         }
        } */
        // br.close();
        // fr.close();

        /* // Example 3
        // Use FileOutputStream to write to file
        FileOutputStream fos = new FileOutputStream(file, true);
        byte[] byteContent = keyboardInput.getBytes();
        fos.write(byteContent);
        fos.flush();
        fos.close();

        // Use FileInputStream to read the file content
        FileInputStream fis = new FileInputStream(file);
        int contentRead = 0;
        while ((contentRead = fis.read()) != -1) {
            System.out.print((char) contentRead);
        }
        fis.close(); */

        /* // Example 4 (Decorator pattern)
        // Use FileOutputStream and DataOutputSteam to write to file
        FileOutputStream fos = new FileOutputStream(file);
        DataOutputStream dos = new DataOutputStream(fos);
        byte[] contents = keyboardInput.getBytes();
        dos.write(contents);
        dos.flush();
        dos.close();
        fos.close();

        // Use FileInputStream and InputDataStream to read the content
        FileInputStream fis = new FileInputStream(file);
        DataInputStream dis = new DataInputStream(fis);
        int byteContent = 0;
        while ((byteContent = dis.read()) != -1) {
            System.out.print((char) byteContent);
        }
        dis.close();
        fis.close(); */

        CSVManagement csv = new CSVManagement();
        csv.readCSV(dirPathFileName);
    }
        
}
