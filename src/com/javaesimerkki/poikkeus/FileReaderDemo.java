package com.javaesimerkki.poikkeus;

import java.io.*;

public class FileReaderDemo {
    public void readFile(String filePath) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Tiedostoa ei löytynyt: " + filePath);
        } catch (IOException e) {
            System.out.println("Virhe tiedoston lukemisessa.");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Virhe tiedoston sulkemisessa.");
            }
        }
    }
}

