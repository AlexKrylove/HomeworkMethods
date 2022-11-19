import java.time.LocalDate;

public class Methods2 {

    public static void main(String[] args) {
        String name = "Android";
        int year = 0;
        int massage = getClientOS(name)+getDeviceYear(year);
        }

    public static int getClientOS(String name) {
        if (name.equals("iOS")) {
            System.out.print("Для " + name);
            return 0;
        } else {
            System.out.print("Для " + name);
            return 1;
        }
    }

    public static int getDeviceYear(int deviceYear) {
        int clientDeviceYear = LocalDate.now().getYear();
        if (clientDeviceYear >= 2015) {
            System.out.println(" установите приложение по ссылке");
        } else {
            System.out.println(" ваша ОС устарела, установите облегченную версию по ссылке");
        }
            return clientDeviceYear;
        }



}
