package lesson7;

public class Cat {
    private String name;
    private boolean satiety = false;
    private final int saturationAmount = 30;

    public Cat(String nane) {
        this.name = nane;
        this.satiety = satiety;
    }

    public void isHungry() {
        if (satiety) {
            System.out.println("Кот " + name + " сыт.");
        } else {
            System.out.println("Кот " + name + " голоден.");
        }
    }

    public void eat(Plate plate) {
        if (plate.quantityFood >= saturationAmount && !satiety) {
            plate.getFood(saturationAmount);
            satiety = true;
        }
    }
}