package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        }
    public static boolean minLength(String password) {
        return password != null && password.length() >= 8;
    }
    }
