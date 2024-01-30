package com.javaesimerkki.poikkeus;

public class AgeVerification {
    public void verifyAge(int age) throws AgeRestrictionException {
        if (age < 18) {
            throw new AgeRestrictionException("Ikärajoitus - käyttäjä on alaikäinen. Ikä: " + age);
        } else {
            System.out.println("Ikä hyväksytty. Ikä: " + age);
        }
    }

}
