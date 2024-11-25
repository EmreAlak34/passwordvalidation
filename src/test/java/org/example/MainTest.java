package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MainTest {

    @Test
    void test_minLength() {
        // Test: gültiges Passwort mit mehr als 8 Zeichen
        boolean actual = Main.minLength("DiesesPasswortistgut293");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);

        // Test: ungültiges Passwort mit weniger als 8 Zeichen
        actual = Main.minLength("nope");
        expected = false;
        Assertions.assertEquals(expected, actual);

        // Test: Passwort mit  6 Zeichen
        actual = Main.minLength("zukurz");
        expected = false;
        Assertions.assertEquals(expected, actual);

        // Test: Passwort mit 10 Zeichen
        actual = Main.minLength("PasswortOk");
        expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test_gotDigits() {
        boolean actual = Main.gotDigits("MeinPasswort9");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);

        actual = Main.gotDigits("Hamburg");
        expected = false;
        Assertions.assertEquals(expected, actual);

        actual = Main.gotDigits("0123");
        expected = true;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void test_hasUpperAndLowerCase() {
        boolean actual = Main.hasUpperAndLowerCase("HalloleLeute32");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);

        actual = Main.hasUpperAndLowerCase("schalke04");
        expected = false;
        Assertions.assertEquals(expected, actual);

        actual = Main.hasUpperAndLowerCase("DEUTSCHLAND");
        expected = false;
        Assertions.assertEquals(expected, actual);

        actual = Main.hasUpperAndLowerCase("MeinAccount");
        expected = true;
        Assertions.assertEquals(expected, actual);
    }
    void test_isWeakPassword() {
        Assertions.assertTrue(Main.isWeak("0000"));
        Assertions.assertTrue(Main.isWeak("1234"));
        Assertions.assertTrue(Main.isWeak("password"));
        Assertions.assertFalse(Main.isWeak("StrongPassword2024"));
        Assertions.assertFalse(Main.isWeak("MySuperSecurePwd1"));
    }
    void test_hasSpecialCharacters() {
        Assertions.assertTrue(Main.hasSpecialCharacters("Hello@123")); // Contains '@'
        Assertions.assertTrue(Main.hasSpecialCharacters("Password!")); // Contains '!'
        Assertions.assertTrue(Main.hasSpecialCharacters("Java#Rules")); // Contains '#'
        Assertions.assertFalse(Main.hasSpecialCharacters("NoSpecials")); // No special characters
        Assertions.assertFalse(Main.hasSpecialCharacters("JustLetters123")); // No special characters
    }


}