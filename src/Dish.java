public class Dish {

    private String dishName;
    private int dishId;
    private double dishPrice;

    public Dish(int dishId, String dishName, double dishPrice) {
        this.dishName = dishName;
        this.dishId = dishId;
        this.dishPrice = dishPrice;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getDishId() {
        return dishId;
    }

    public void setDishId(int dishId) {
        this.dishId = dishId;
    }

    public double getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(double dishPrice) {
        this.dishPrice = dishPrice;
    }

    @Override
    public String toString() {
        return dishId + ", " + dishName + ", " + dishPrice + "zł";
    }
}
