package trungbinhcong;

import java.util.Scanner;

public class trungbinhcong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n, s=0,x;
        float sum = 0;
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            x = scanner.nextInt();
            sum += x;
        }
        System.out.println(s = sum / n);

    }
}