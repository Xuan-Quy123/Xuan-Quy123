package com.vti.BTVN_assignment2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào 4 số nguyên
        System.out.print("Nhập số thứ nhất: ");
        int num1 = scanner.nextInt();

        System.out.print("Nhập số thứ hai: ");
        int num2 = scanner.nextInt();

        System.out.print("Nhập số thứ ba: ");
        int num3 = scanner.nextInt();

        System.out.print("Nhập số thứ tư: ");
        int num4 = scanner.nextInt();

        // Tìm số lớn nhất và số nhỏ nhất
        int max = Math.max(Math.max(num1, num2), Math.max(num3, num4));
        int min = Math.min(Math.min(num1, num2), Math.min(num3, num4));

        // Hiển thị kết quả
        System.out.println("Số lớn nhất là: " + max);
        System.out.println("Số nhỏ nhất là: " + min);

        // Đóng đối tượng Scanner
        scanner.close();
    }
}
