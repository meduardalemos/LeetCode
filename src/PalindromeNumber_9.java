public class PalindromeNumber_9 {

    // Given an integer x, return true if x is a palindrome, and false otherwise

    public boolean solution01(int x) {
        int number = x;
        int reversed = 0;

        while (x > 0) {
            int digit = x % 10;
            reversed = (reversed * 10) + digit;
            x /= 10;
        }

        return number == reversed;
    }

    public boolean solution02(int x) {
        String original = Integer.toString(x);
        StringBuilder number = new StringBuilder(original);
        String reversed = number.reverse().toString();

        return original.equals(reversed);
    }
}

