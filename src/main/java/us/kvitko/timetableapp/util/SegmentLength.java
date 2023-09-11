package us.kvitko.timetableapp.util;

import java.util.Scanner;

public class SegmentLength {

    public static double length() {
        System.out.println("Enter coordinates:");
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextInt();
        double y1 = sc.nextInt();
        double x2 = sc.nextInt();
        double y2 = sc.nextInt();
        double l = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println(l);
        return l;
    }
}

