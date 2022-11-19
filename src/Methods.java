public class Methods {

    public static int getLeapYear(int year) {
        if (year % 4 == 0 && year % 400 != 0 || year % 400 == 0) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
        return year;
    }

    public static void main(String[] args) {
        int year = 2002;
        getLeapYear(year);

    }
}

