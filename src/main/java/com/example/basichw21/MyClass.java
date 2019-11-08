package com.example.basichw21;

import java.util.Scanner;

public class MyClass {
    public static void main (String[] args ) {
        Scanner scanner = new Scanner(System.in);
        Servitor servitor = new Servitor();
        servitor.setAllVariable();
        servitor.calc();
    }
}