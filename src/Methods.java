public class Methods {

    public static int getLeapYear(int leapYear) {
        int year = 2022;
        if (year % 4 == 0 && year % 400 != 0 || year % 400 == 0) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
        return year;
    }

    public static void main(String[] args) {
        int year = 0;
        getLeapYear(year);

    }
}

