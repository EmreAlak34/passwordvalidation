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
        boolean actual = Main.hasUpperAndLowerCase("HalloleUte32);
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
}