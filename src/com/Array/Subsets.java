package com.Array;

public class Subsets {

    // Method to find all subsets of a given string
    public static void findSubsets(String p, String up) {
        // Base condition: If the unprocessed string is empty, print the processed string
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        // Recursive case:
        // Include the first character of the unprocessed string in the processed string
        findSubsets(p + up.charAt(0), up.substring(1));

        // Do not include the first character of the unprocessed string in the processed string
        findSubsets(p, up.substring(1));
    }

    public static void main(String[] args) {
        String input = "abc";
        findSubsets("", input);
    }
}
