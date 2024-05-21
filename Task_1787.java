import java.util.Scanner;

public class Task_1787 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k, n, s = 0, t;
        k = scanner.nextInt();
        n = scanner.nextInt();

        for (int i = 0; i < n; ++i) {
            t = scanner.nextInt();
            s += t;
            if (k > s)
                s = 0;
            else
                s -= k;
        }

        System.out.println(s);
    }
}