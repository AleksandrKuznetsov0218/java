package lesson7;

public class Plate {

    int quantityFood = 100;

    public Plate() {
        this.quantityFood = quantityFood;
    }

    public void conditionPlatesToConsole() {
        System.out.println("В миске " + quantityFood + " граммов корма.");
    }

    public void getFood(int sA) {
        if (quantityFood >= sA) quantityFood = quantityFood - sA;
    }

    public void addFood() {
        quantityFood = quantityFood + 100;
        System.out.println("В миску добавлено 100 граммов корма.");
    }
}
