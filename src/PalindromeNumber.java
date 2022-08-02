

public class PalindromeNumber {

    /*
    Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
    Example 1:
    Input: 121
    Output: true
    Example 2:

    Input: -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
    Example 3:

    Input: 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
    Follow up:

    Coud you solve it without converting the integer to a string?
     */
    public static boolean isPalindrome(int x) {
        // Special cases:
        // As discussed above, when x < 0, x is not a palindrome.
        // Also if the last digit of the number is 0, in order to be a palindrome,
        // the first digit of the number also needs to be 0.
        // Only 0 satisfy this property.
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        if (x == 0) return true;
        int revertedNumber = 0; //số từ đuôi viết theo thứ tự ngược lại
        while (x > revertedNumber) {
            revertedNumber = x % 10 + revertedNumber * 10;
            x = x / 10;
        }
        // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
        // For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123,
        // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
        return x == revertedNumber || x == revertedNumber / 10;
    }
    /*
    Runtime: 6 ms, faster than 100.00% of Java online submissions for Palindrome Number.
    Memory Usage: 40.7 MB, less than 5.02% of Java online submissions for Palindrome Number.
     */

    public static void main(String[] args) {
        isPalindrome(10);
    }
}
