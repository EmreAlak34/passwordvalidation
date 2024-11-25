package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        }
    public static boolean minLength(String password) {
        return password.length() >= 8;  // Gibt true zurück, wenn die Länge des Passworts >= 8 ist
    }

    public static boolean gotDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                return true;
            }
        }
        return false;
    }
    }
