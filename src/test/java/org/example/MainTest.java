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
}