import java.util.List;

public class Order {

    private List<Dish> dishList;

    public Order(List<Dish> dishList) {
        this.dishList = dishList;
    }

    @Override
    public String toString() {
        double bill = PaymentService.calculateBill(dishList);
        double tipp = PaymentService.calculteTip(bill);
        double totalBill = bill + tipp;
        return String.format("Do zapłaty: %.2f, w tym: \n" +
                "Koszt dań: %.2f \n" +
                "Koszt obsługi %.2f", totalBill,bill,tipp);
    }
}
