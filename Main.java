public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Сэм");
        Dog dog1 = new Dog("Жорик");
        Dog dog2 = new Dog("Бобик");

        cat1.run(200);
        cat1.jump(2);
        cat1.swim(1);

        System.out.println();

        cat2.run(500);
        cat2.jump(4);
        cat2.swim(3);

        System.out.println();

        dog1.run(500);
        dog1.jump(0.3);
        dog1.swim(10);

        System.out.println();

        dog2.run(800);
        dog2.jump(3.5);
        dog2.swim(25);
    }
}
