package entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import java.util.zip.DataFormatException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
        int tong = 0;
        for (int j = 1; j <= 100; j++) {
            if (j % 2 == 0) {
                tong += j;
            }

        }


        System.out.println(tong);

        //Scanner

       /* Scanner scanner= new Scanner(System.in);
        System.out.println("Moi nhap vao mot so nguyen bat ki:");

        int k= scanner.nextInt();// 1 Enter
        scanner.nextLine();// Chong troi lenh(n eu k co dong nay thi
        System.out.println(" Nhap vao mot chu cai");
        String a = scanner.nextLine();
        System.out.println(" Nhap tiep vao 1 chu cai nua");
        String b= scanner.nextLine();
        System.out.println(" Nhap lai 1 so nguyen bat ki:");
        int m=scanner.nextInt();

        */

// Tinh tong cac so nguyen lien tiep voi so nguyen bat ki nhap tu ban phim

        Scanner input = new Scanner(System.in);
        System.out.println("Moi nhap vao mot so nguyen bat ki:");
        int n = input.nextInt();

        int sum = 0;
        int x = 1;
        for (x = 1; x <= n; x++) {
            sum = sum + x;
        }
        System.out.println(sum);


        // 1. in ra dong chu: Chao mung ban den voi chuong trinh cua <ten cua ban>
        // 2. in ra dong chu: Moi ban chon chuc nang:
        // Cac chuc nang:
        // 1. In ra ngay thang nam hom nay
        // 2. In ra con so may man hom nay (tu 1 den 20) -- in ra ngau nhien 1 so tu 1 den 20
        // 3. Kiem tra xem ban phai la nguoi may may hay khong? (
        // 3.1 Moi ban nhap vao 1 so tu nhien bat ky tu 1 den 20)
        // 3.2 Su dung function 2, so sanh voi so nguoi dung nhap vao
        // if neu trung nhau thi la may man
        // else thi la chuc ban may man vao ngay mai


        Scanner chuongTrinh = new Scanner(System.in);
        System.out.println("Moi ban nhap vao ten cua minh");
        String name = chuongTrinh.next();
        System.out.println("Chao mung ban " + name + " den voi chuong trinh cua VTI");
        System.out.println("Moi ban chon chuc nang:");
        boolean isOK = true;
        while (isOK) {
            System.out.println("--------------MENU-----------------");
            System.out.println("1. In ra ngay thang nam hom nay.");
            System.out.println("2. In ra con so may man hom nay (tu 0 den 99) -- in ra ngau nhien 1 so tu 0 den 99");
            System.out.println("3. Kiem tra xem ban phai la nguoi may may hay khong?");

            int k = chuongTrinh.nextInt();
            switch (k) {
                case 1:
                    System.out.println(LocalDate.now());
                    break;
                case 2:
                    int min = 0;
                    int max = 99;
                    System.out.println("Hien thi mot so ngau nhien ");
                    int l = (int) (Math.random() * (max - min + 1) + min);
                    System.out.println(l);
                    break;
                case 3:
                    System.out.println("Nhap vao con so ban nghi la may man( tu 0- 99):");
                    int m = chuongTrinh.nextInt();
                    if (m >= 100) {
                        System.out.println("Ban phai nhap so ngau nhien trong khoang 0-99");
                        int q = chuongTrinh.nextInt();
                        int min1 = 0;
                        int max1 = 99;
                        int u = (int) (Math.random() * (max1 - min1 + 1) + min1);
                        if (q == u) {
                            System.out.println("Ban la nguoi may man!");
                        } else {
                            System.out.println(" Chuc ban may man lan sau!");
                            System.out.println("Con so may man cua ngay hom nay la: " + u);
                        }
                    } else {
                        int mn = 0;
                        int mx = 99;
                        int p = (int) (Math.random() * (mx - mn + 1) + mn);
                        if (m == p) {
                            System.out.println("Ban la nguoi may man!");
                        } else {
                            System.out.println(" Chuc ban may man lan sau!");
                            System.out.println("Con so may man cua ngay hom nay la: " + p);
                        }


                    }
            }
            System.out.println("Neu ban muon tiep tuc an Y= Yes");
            System.out.println("Neu ban muon dung lai an chu bat ki(Ngoai Y) tu ban phim");

            chuongTrinh.nextLine();
            String y = chuongTrinh.nextLine();

            isOK = "Y".equalsIgnoreCase(y);


        }

    }

}