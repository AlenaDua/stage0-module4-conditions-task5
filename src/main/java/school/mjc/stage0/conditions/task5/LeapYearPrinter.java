package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        //Create a program to check whether a year is a leap year or not(
        // "leap" if true otherwise "not leap").
        int r = ((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0) ? 1 : 0 ;
        switch (r) {
            case (0):
                System.out.printf("not leap\n");
                break;
            case (1):
                System.out.printf("leap\n");
                break;
        }
    }
}
