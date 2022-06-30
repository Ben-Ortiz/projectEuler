public class evenFibonacciNumbers {

    public static long solution(long n) {
        long ans = 0;
        for(long i = 2; i < n+2; i++) {
            long temp = fib(i);
            if(temp % 2 == 0) {
                // System.out.println(temp);
                ans += temp;
            }
        }
        return ans;
    }

    public static long fib(long n) {
        long a = 0;
        long b = 1;

        for(long i = 0; i < n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }

        return a;
    }
    public static void main(String[] args) {
        long num = 33;
        System.out.println(solution(num));
}