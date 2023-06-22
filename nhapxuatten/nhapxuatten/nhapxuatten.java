package nhapxuatten;


import java.util.Scanner;

public class nhapxuatten {

    public static void main(String[] args) {
        String ten;
        final String ten2 = "abc"; //vi du hang so: phai co chu final
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào chuỗi: "); // hiển thị dòng thông báo và xuống dòng
        ten = scanner.nextLine();
        // hiển thị chuỗi
        //System.out.println("Chào mừng bạn "  +ten + " đến với Freetuts.net!");
        System.out.println("abc " + ten);
        if (ten.equals("loi")) {
            System.out.println("loi qua dep trai");
        } else {
            System.out.println("chin qua xauu");
        }
    }

}