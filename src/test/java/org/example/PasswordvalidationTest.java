package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PasswordvalidationTest {

    @Test
    void test_minLength() {
        // Test: gültiges Passwort mit mehr als 8 Zeichen
        boolean actual = Passwordvalidation.minLength("DiesesPasswortistgut293");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);

        // Test: ungültiges Passwort mit weniger als 8 Zeichen
        actual = Passwordvalidation.minLength("nope");
        expected = false;
        Assertions.assertEquals(expected, actual);

        // Test: Passwort mit  6 Zeichen
        actual = Passwordvalidation.minLength("zukurz");
        expected = false;
        Assertions.assertEquals(expected, actual);

        // Test: Passwort mit 10 Zeichen
        actual = Passwordvalidation.minLength("PasswortOk");
        expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test_gotDigits() {
        boolean actual = Passwordvalidation.gotDigits("MeinPasswort9");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);

        actual = Passwordvalidation.gotDigits("Hamburg");
        expected = false;
        Assertions.assertEquals(expected, actual);

        actual = Passwordvalidation.gotDigits("0123");
        expected = true;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void test_hasUpperAndLowerCase() {
        boolean actual = Passwordvalidation.hasUpperAndLowerCase("HalloleLeute32");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);

        actual = Passwordvalidation.hasUpperAndLowerCase("schalke04");
        expected = false;
        Assertions.assertEquals(expected, actual);

        actual = Passwordvalidation.hasUpperAndLowerCase("DEUTSCHLAND");
        expected = false;
        Assertions.assertEquals(expected, actual);

        actual = Passwordvalidation.hasUpperAndLowerCase("MeinAccount");
        expected = true;
        Assertions.assertEquals(expected, actual);
    }
    void test_isWeakPassword() {
        Assertions.assertTrue(Passwordvalidation.isWeak("0000"));
        Assertions.assertTrue(Passwordvalidation.isWeak("1234"));
        Assertions.assertTrue(Passwordvalidation.isWeak("password"));
        Assertions.assertFalse(Passwordvalidation.isWeak("StrongPassword2024"));
        Assertions.assertFalse(Passwordvalidation.isWeak("MySuperSecurePwd1"));
    }
    void test_hasSpecialCharacters() {
        Assertions.assertTrue(Passwordvalidation.hasSpecialCharacters("Hello@123"));
        Assertions.assertTrue(Passwordvalidation.hasSpecialCharacters("Password!"));
        Assertions.assertTrue(Passwordvalidation.hasSpecialCharacters("Java#Rules"));
        Assertions.assertFalse(Passwordvalidation.hasSpecialCharacters("NoSpecials"));
        Assertions.assertFalse(Passwordvalidation.hasSpecialCharacters("JustLetters123"));
    }


}