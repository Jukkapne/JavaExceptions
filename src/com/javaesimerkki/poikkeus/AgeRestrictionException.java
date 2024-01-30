package com.javaesimerkki.poikkeus;

// Määritellään luokka AgeRestrictionException, joka perii Exception-luokan.
// Tämä mahdollistaa oman poikkeustyypin luomisen.
public class AgeRestrictionException extends Exception {
    
    // Konstruktori, joka ottaa vastaan viestin (String) ja välittää sen
    // ylemmälle Exception-luokalle käyttäen super-kutsua.
    // Tämä viesti näytetään, kun poikkeus heitetään ja tulostetaan.
    public AgeRestrictionException(String message) {
        super(message);
    }
}
