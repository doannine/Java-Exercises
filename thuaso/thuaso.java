package vong_lap_while;

import java.util.Scanner;

public class thuaso {

    public static void main(String[] args) {
        int n, so = 1;
        long giaithua = 1;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        while (so <= n) {
            giaithua *= so;
            so++;
        }
        System.out.println(giaithua);
    }

}