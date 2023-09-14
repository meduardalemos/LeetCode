public class PalindromeNumber_9 {

    // Given an integer x, return true if x is a palindrome, and false otherwise

    public static void main(String[] args) {
        int x = 12021;
        Boolean result = solution02(x);
        System.out.println(result);
    }
    public static boolean solution01(int x) {
        int number = x;
        int reversed = 0;

        while (x > 0) {
            int digit = x % 10;
            reversed = (reversed * 10) + digit;
            x /= 10;
        }

        return number == reversed;
    }

    public static boolean solution02(int x) {
        String original = Integer.toString(x);
        StringBuilder number = new StringBuilder(original);
        String reversed = number.reverse().toString();

        return original.equals(reversed);
    }
}

