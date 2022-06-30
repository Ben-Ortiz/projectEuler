public class multiplesOf3Or5 {
    /*
     * problem 1
     */

    public static int solution(int n) {
        int ans = 0;

        for(int i = 0; i < n; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                ans += i;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(solution(1000));
    }
}