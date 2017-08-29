import java.util.Scanner;

/**
 * @author Anton Garder
 */
public class Main {
    static void run() {
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        System.out.println(a == b);
        // some changeS
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
