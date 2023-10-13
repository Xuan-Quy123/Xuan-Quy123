package VTI_Bckend;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Department department1 = new Department();
        System.out.println("Moi nhao ID : ");
        int id = sc.nextInt();
        department1.departmentID = id ;

        Scanner sc1 = new Scanner(System.in);
        String name = sc1.next();
        Department department2 = new Department();
        System.out.println ("Moi ban nhap phong ban : ");
        department1.departmentName = name;

        System.out.println();



//        Department department2 = new Department();
//        department2.departmentID =2;
//        department2.departmentName = "kế toán";
//
//        Postion postion1 = new Postion();
//        postion1.positionID = 1;
//        postion1.positionName = "Giam doc";
//
//        Postion postion2 = new Postion();
//        postion2.positionID = 2;
//        postion2.positionName = "Chuyen vien";
//
//        Account account1 = new Account();
//        account1.accountID = 1;
//        account1.department = department2;
//        account1.position = postion1;
//
//        Account account2 = new Account();
//        account2.accountID = 2;
//        account2.department = department1;
//        account2.position = postion2;
//        if (account2.department.departmentName == null ){
//            System.out.println("Nhân viên này chưa có phòng ban");
//        }
//        else {
//            System.out.println("Phòng ban của nhân viên là : " + account2.department.departmentName);
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Nhập vào 1 tháng trong năm : ");
//        int thang = sc.nextInt();
//
//        switch (thang)
//        {
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                System.out.println("thang "+thang+" co 31 ngay");
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                System.out.println("thang "+thang+" co 30 ngay");
//                break;
//            case 2:
//                System.out.println("thang co 28 hoac 29 ngay");
//                break;
//        }

//        System.out.println(account1.accountID);
//        System.out.println(account1.department.departmentName);
//        System.out.println(account1.position.positionName);
//
//        System.out.println(account2.accountID);
//        System.out.println(account2.department.departmentName);
//        System.out.println(account2.position.positionName);
    }
}
