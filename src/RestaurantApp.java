import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RestaurantApp {

    public void mainMenu() {
        System.out.println("Witaj w naszej restauracji");
        printMenu();
        Order order = takeOrder();
        printSummary(order);
    }

    private void printMenu() {
        System.out.println("Dzisiejsze Menu: ");
        Menu.MENU.forEach(System.out::println);
        System.out.println("Zamów wybrane potrawy, wymieniając ich numery po przecinku:");
    }

    private Order takeOrder() {
        List<Integer> dishesids = getDishesNumbers();
        List<Dish> dishes = Menu.convertIdsToDishes(dishesids);
        return new Order(dishes);
    }

    private void printSummary(Order order) {
        String summary = order.toString();
        System.out.println(summary);
    }

    private List<Integer> getDishesNumbers() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] split = line.replaceAll(" ", "").split(",");
        return Arrays.stream(split)
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }
}
