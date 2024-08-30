package learnCode.Recursion;

public class palindromeChecker {
    public static boolean isPalindrome(String str) {
            if (str.length() <= 1) {
                return true;
            }
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            if (firstChar != lastChar) {
                return false;
            }
            String remainingSubstring = str.substring(1, str.length() - 1);
            return isPalindrome(remainingSubstring);
        }

        public static void main(String[] args) {
            String palindrome1 = "madam";
            boolean isPalindrome1 = isPalindrome(palindrome1);
            System.out.println(palindrome1 + " is a palindrome: " + isPalindrome1);

            String palindrome2 = "Help";
            boolean isPalindrome2 = isPalindrome(palindrome2);
            System.out.println(palindrome2 + " is a palindrome: " + isPalindrome2);

            String Palindrome3 = "";
            boolean isPalindrome3 = isPalindrome(Palindrome3);
            System.out.println(Palindrome3 + " is a palindrome: " + isPalindrome3);
        }
    }
