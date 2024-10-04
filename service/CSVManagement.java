package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import people.Person;

public class CSVManagement {

    // fileName: dirPath +file separator + filename
    public List<Person> readCSV(String fileName) throws IOException {
        // use BufferedReader
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        List<Person> persons = new ArrayList<>();
        String line = "";
        while((line = br.readLine()) != null) {
            System.out.println(line);

            // lineData[0], lineData[1], lineData[2]
            String[] lineData = line.split(",");

            // put the extracted line data into a Person object
            Person p = new Person(lineData[0], lineData[1], Integer.parseInt(lineData[2].trim()));
            persons.add(p);
        }

        br.close();
        fr.close();

        return persons;

    }

    public void writeCSV(String fullDirPathFileName, List<Person> persons) throws IOException {
        // Use BufferedWriter

        FileWriter fw = new FileWriter(fullDirPathFileName, false);
        BufferedWriter bw = new BufferedWriter(fw);

        for(Person p: persons) {
            bw.append(p.getName());
            bw.append(",");
            bw.append(p.getRegion());
            bw.append(",");
            bw.append(String.valueOf(p.getYearOfBirth()));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        fw.close();
    }
}
