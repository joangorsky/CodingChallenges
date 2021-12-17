import java.util.Scanner;

public class StairsChallenge {

    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    // Returns number of ways to reach s'th stair
    static int countWays(int s)
    {
        return fib(s + 1);
    }


    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer for the number of steps: ");

              int s = in.nextInt();
        System.out.println("Number of ways = " + countWays(s));
    }


}
