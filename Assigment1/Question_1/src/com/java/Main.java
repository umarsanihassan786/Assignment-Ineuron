package com.java;

public class Main {
    public static void main(String[] args) {
        int n = 7; // Number of rows
        
        // Pattern for 'I'
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == (n / 2) + 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        System.out.println(); // Add an empty line
        
        // Pattern for 'N'
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        System.out.println(); // Add an empty line
        
        // Pattern for 'E'
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || i == (n / 2) + 1 || (i == ((n + 1) / 2) && j <= n / 2 + 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        System.out.println(); // Add an empty line
        
        // Pattern for 'U'
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((j == 1 || j == n) && i != n || i == n && (j > 1 && j < n))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        System.out.println(); // Add an empty line
        
        // Pattern for 'R'
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || i == 1 || i == (n + 1) / 2 && j <= n / 2 + 1 || j == n && i > (n + 1) / 2 || i == j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        System.out.println(); // Add an empty line
        
        // Pattern for 'O'
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == 1 || i == n) && (j > 1 && j < n) || (j == 1 || j == n) && (i > 1 && i < n))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        System.out.println(); // Add an empty line
        
        // Pattern for 'N'
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || j == n - i + 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
