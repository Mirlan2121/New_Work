import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] men = new long[n + 1];

        Arrays.fill(men, -1);
        System.out.println(fibNaive(n,  men));
    }
    //навивный, медленным, очевидным
    private static long fibNaive(int n, long[] men){
        if (men[n] != -1)
            return men[n];

        if (n <= 1)
            return n;

        long result = fibNaive(n -1, men) + fibNaive(n - 2, men);
        men[n] = result;
        return result;
    }
}
