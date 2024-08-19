//Anaga Raghavan
import java.util.Scanner;

class sumofN {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += s.nextInt();
        }

        s.close();
        System.out.println(sum);
    }
}
