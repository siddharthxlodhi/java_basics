package ANKIT;

public class FACTORIAL {

    public static void main(String[] args) {
        System.out.println(printFactorial(10));

    }
    public static long Factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }

    public static String printFactorial(int n) {
        StringBuilder expression = new StringBuilder();
        for (int i = 1; i <= n+1; i++) {
            if (i<=n) {
                expression.append(i);
            }
            if (i < n) {
                expression.append(" × ");
            }
            if (i > n) {
                expression.append("="+Factorial(n));

            }
        }
        return expression.toString();
    }

}
