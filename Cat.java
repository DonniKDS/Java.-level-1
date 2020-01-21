public class Cat extends Animal {

    public Cat(String name){
        this.name = name;
        this.maxRun = random.nextInt(101) + 200;
        this.maxJump = random.nextInt(2) + 1;
        this.maxSwim = 0;
    }

    @Override
    public void swim(int length) {
        System.out.println(name + " - котик, а они не умеют плавать");
    }
}
