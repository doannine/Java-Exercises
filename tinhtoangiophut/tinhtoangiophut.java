import java.util.Scanner;

public class tinhtoangiophut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giờ: ");
        int gio = scanner.nextInt();

        System.out.print("Nhập phút: ");
        int phut = scanner.nextInt();
        System.out.println("Chọn loại giờ:");
        System.out.println("1. 12 giờ");
        System.out.println("2. 24 giờ");
        int loaiGio = scanner.nextInt();
        while (loaiGio > 2){
            System.out.println(" Vui lòng chọn lại : ");
            loaiGio = scanner.nextInt();
        }

        String amPm;
        if (loaiGio == 1) {
            if (gio >= 12) {
                amPm = "PM";
                if (gio > 12) {
                    gio -= 12;
                }
            } else {
                amPm = "AM";
            }
        } else {
            amPm = "";
        }
        System.out.print(" Giờ cần bù : ");
        int bugio = scanner.nextInt();
        int gioduocbu = bugio + gio ;
        System.out.print("Phút cần bù : ");
        int buphut = scanner.nextInt();
        int phutduocbu = buphut + phut;
        String gioPhut = String.format("%02d:%02d %s", gio, phut, amPm);
        System.out.println("Thời gian là: " + gioPhut);
        System.out.println("Thời gian sau khi bù  "+ gioduocbu +":"+ phutduocbu +" " + amPm);



    }
}
