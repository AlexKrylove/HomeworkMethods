import java.time.LocalDate;

public class Methods3 {


    public static void main(String[] args) {
        int deliveryDistance = 15;
        getDeliveryDist(deliveryDistance);
    }

    public static int getDeliveryDist(int deliveryDistance) {
        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставка не возможна");
        }
        return deliveryDistance;
    }
}



