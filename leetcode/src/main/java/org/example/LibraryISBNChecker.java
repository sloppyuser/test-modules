package org.example;

public class LibraryISBNChecker {
    
    /**
     * Checks if two ISBN numbers are similar.
     * ISBNs are similar if after removing hyphens, they can be made identical
     * by swapping exactly one pair of adjacent digits.
     *
     * @param isbn1 first ISBN string
     * @param isbn2 second ISBN string
     * @return true if ISBNs are similar, false otherwise
     */
    public static boolean areSimilarISBNs(String isbn1, String isbn2) {
        // Remove hyphens from both ISBNs
        String digits1 = isbn1.replace("-", "");
        String digits2 = isbn2.replace("-", "");

        // If the lengths don't match after removing hyphens, they can't be similar
        if (digits1.length() != digits2.length()) {
            return false;
        }

        // If the strings are already equal, they are not similar
        if (digits1.equals(digits2)) {
            return false;
        }

        // Find the indices where the digits differ
        int diffCount = 0;
        int firstDiff = -1, secondDiff = -1;

        for (int i = 0; i < digits1.length(); i++) {
            if (digits1.charAt(i) != digits2.charAt(i)) {
                diffCount++;
                if (diffCount == 1) {
                    firstDiff = i;
                } else if (diffCount == 2) {
                    secondDiff = i;
                } else {
                    // More than 2 differences mean the strings are not similar
                    return false;
                }
            }
        }

        // Check if there are exactly two differences and if swapping fixes it
        return diffCount == 2 &&
                digits1.charAt(firstDiff) == digits2.charAt(secondDiff) &&
                digits1.charAt(secondDiff) == digits2.charAt(firstDiff);
    }

    // Test cases
    public static void main(String[] args) {
        // Test Case 1
        String isbn1 = "123-456-789";
        String isbn2 = "123-465-789";
        System.out.println("Test Case 1: " + (areSimilarISBNs(isbn1, isbn2) ? "PASSED" : "FAILED"));

        // Test Case 2
        isbn1 = "123-456-789";
        isbn2 = "123-456-798";
        System.out.println("Test Case 2: " + (areSimilarISBNs(isbn1, isbn2) ? "PASSED" : "FAILED"));

        // Test Case 3
        isbn1 = "123-456-789";
        isbn2 = "123-546-789";
        // According to the rules THESE ARE SIMILAR. Where as in the example it says otherwise
        System.out.println("Test Case 3: " + (areSimilarISBNs(isbn1, isbn2) ? "FAILED" : "PASSED"));

        // Test Case 4
        isbn1 = "123-456-789";
        isbn2 = "123-456-789";
        System.out.println("Test Case 4: " + (areSimilarISBNs(isbn1, isbn2) ? "FAILED" : "PASSED"));
    }
}