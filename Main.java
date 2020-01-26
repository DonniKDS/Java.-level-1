public class Main {

    public static void main(String[] args) {
        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Barsik", 5);
        cat[1] = new Cat("Vasia", 8);
        cat[2] = new Cat("Objora", 15);
        cat[3] = new Cat("Sem", 4);
        cat[4] = new Cat("Gosha", 7);
        Plate plate = new Plate(35);
        plate.info();
        cat[0].eat(plate);
        plate.info();
        cat[1].eat(plate);
        plate.info();
        cat[2].eat(plate);
        plate.info();
        cat[3].eat(plate);
        plate.info();
        cat[4].eat(plate);
        plate.info();
        plate.addFood(4);
        plate.info();
        cat[4].eat(plate);
        plate.info();
    }

}
