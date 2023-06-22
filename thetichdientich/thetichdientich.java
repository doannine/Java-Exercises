import java.util.Scanner;

public class thetichdientich {
    public static final float PI = 3.14f;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị của r: ");
        int r = sc.nextInt();

        float thetich = (4/3) * PI * (r*r*r);
        float dientich = 4 * PI * (r*r);

        System.out.println("Thể tích của hình cầu là: " + thetich);
        System.out.println("Diện tích của hình cầu là: " + dientich);
    }
}
