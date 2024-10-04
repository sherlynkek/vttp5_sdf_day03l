package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVManagement {

    // fileName: dirPath +file separator + filename
    public void readCSV(String fileName) throws IOException {
        // use BufferedReader
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        String line = "";
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
        fr.close();

    }

    public void writeCSV(String fileName) {

    }
}
