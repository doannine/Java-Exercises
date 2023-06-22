import java.util.Scanner;

public class nhapxemthoatfor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("1. Nhập");
            System.out.println("2. Xem");
            System.out.println("3. Thoát");
            int n = scanner.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Bạn chọn chức năng nhập!");
                    break;
                case 2:
                    System.out.println("Bạn chọn chức năng xem!");
                    break;
                case 3:
                    System.out.println("Bạn chọn chức năng thoát! Bye nha fen!");
                    isRunning = false;
                    break;
                default:
                    System.out.println(" vui lòng chọn lại nha !");
                    break;
            }
        }
    }
}
