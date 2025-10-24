import java.util.*;

public class champernownecount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        int divisor = in.nextInt();
        int divisible = 0;

        String champernowne = "";
        long curr = 0;
        for (int i = 1; i <= count; i++ )  {
            champernowne += Long.toString(i);
            curr = Long.parseLong(champernowne);
            curr = curr % divisor;
            if (curr == 0) divisible++;
            champernowne = Long.toString(curr);
        }
        System.out.println(divisible);
    }
}