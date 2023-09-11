package us.kvitko.timetableapp.util;

public class TimeTable {

    public static void multiply() {
        for (int j = 1; j <= 10; j++) {
            for (int i = 2; i <= 5; i++) {
                int sum = 0;
                sum += i * j;
                System.out.print(i + " " + "*" + " " + j + " " + "=" + " " + sum + "\t");
            }
            System.out.println();
        }
    }
}

