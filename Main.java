package lesson7;

public class Main {

    public static void main(String[] args) {
        Plate pl = new Plate();
        Cat[] catArray = new Cat[5];
        catArray[0]=new Cat("Леопольд");
        catArray[1]=new Cat("Мурзик");
        catArray[2]=new Cat("Барсик");
        catArray[3]=new Cat("Тимофей");
        catArray[4]=new Cat("Котофей");

        for (int i = 0; i < 5; i++) {
            catArray[i].eat(pl);
            catArray[i].isHungry();
        }
        pl.conditionPlatesToConsole();
        pl.addFood();
        for (int i = 0; i < 5; i++) {
            catArray[i].eat(pl);
            catArray[i].isHungry();
        }
        pl.conditionPlatesToConsole();
    }
}
