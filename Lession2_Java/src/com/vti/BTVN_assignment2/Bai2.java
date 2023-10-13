package com.vti.BTVN_assignment2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số giây từ người dùng
        System.out.print("Nhập số giây từ 0 đến 68399: ");
        int totalSeconds = scanner.nextInt();

        // Kiểm tra xem số giây nằm trong khoảng từ 0 đến 68399 hay không
        if (totalSeconds < 0 || totalSeconds > 68399) {
            System.out.println("Số giây không hợp lệ. Vui lòng nhập số giây từ 0 đến 68399.");
        } else {
            // Tính giờ, phút và giây
            int hours = totalSeconds / 3600;
            int remainingSeconds = totalSeconds % 3600;
            int minutes = remainingSeconds / 60;
            int seconds = remainingSeconds % 60;

            // In ra kết quả với định dạng [giờ:phút:giây]
            System.out.printf("[%02d:%02d:%02d]\n", hours, minutes, seconds);
        }

        // Đóng đối tượng Scanner
        scanner.close();
    }
}
