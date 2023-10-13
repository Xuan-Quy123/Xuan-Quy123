package com.vti.frontend;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
//        String[] listName = {"Nguyễn văn A","Nguyễn văn B ", "Nguyễn Văn C"};
//
//        for(String name: listName){
//            System.out.println(name);
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số centimet: ");
        double centimeters = scanner.nextDouble();
        scanner.close();

        // Bước 2: Chuyển đổi centimet thành inches và feet
        // 1 inch = 2.54 cm
        // 1 foot = 12 i2nches

        // Chuyển centimet thành inches
        double inches = centimeters / 2.54;

        // Chuyển inches thành feet và phần thập phân của feet
        double feet = inches / 12;
        double remainingInches = inches % 12;

        // Bước 3: In ra kết quả
        System.out.println(centimeters + " centimet tương đương với:");
        System.out.println((int) feet + " feet và " + remainingInches + " inches.");
    }

}
