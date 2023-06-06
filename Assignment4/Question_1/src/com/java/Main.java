package com.java;

public class Main {
    public static void main(String[] args) {
        String inputString = "abbacddee";
        
        System.out.println("Original String: " + inputString);
        
        String resultString = removeDuplicates(inputString);
        
        System.out.println("String after removing duplicates: " + resultString);
    }
    
    public static String removeDuplicates(String inputString) {
        StringBuilder sb = new StringBuilder();
        int length = inputString.length();
        
        for (int i = 0; i < length; i++) {
            char currentChar = inputString.charAt(i);
            
            // Check if the current character is already present in the result string
            if (sb.indexOf(String.valueOf(currentChar)) == -1) {
                sb.append(currentChar);
            }
        }
        
        return sb.toString();
    }
}
