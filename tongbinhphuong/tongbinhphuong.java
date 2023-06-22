package vong_lap_while;
import java.util.Scanner;
public class tongbinhphuong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, temp = 1;
        long sum = 0;
        n = scanner.nextInt();
        while (temp <= n) {
            sum += temp * temp;
            temp++;
        }
        System.out.println(sum);
    }
}

