package com.javaesimerkki.poikkeus;

public class App {
    public static void main(String[] args) {
       // Tiedostonlukijan demo
       FileReaderDemo fileReader = new FileReaderDemo();
       fileReader.readFile("test.txt"); // Korvaa "test.txt" todellisella tiedostopolulla

       // Ikärajan tarkistuksen demo
       AgeVerification ageVerifier = new AgeVerification();
       try {
           ageVerifier.verifyAge(17); // Kokeillaan alaikäistä ikää
       } catch (AgeRestrictionException e) {
           System.out.println(e.getMessage());
       }
    }
}
