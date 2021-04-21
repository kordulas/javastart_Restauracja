import java.util.List;

public class PaymentService {

    private static final double TIP_MARGIN = 100;
    private static final double LOWER_TIP = 0.1;
    private static final double HIGHER_TIP = 0.15;

    public static double calculteTip(double price){
        if(price < TIP_MARGIN)
            return price * HIGHER_TIP;
        else
            return price * LOWER_TIP;
    }

    public static double calculateBill(List<Dish> dishList){
        return dishList.stream().mapToDouble(Dish::getDishPrice).sum();
    }
}
