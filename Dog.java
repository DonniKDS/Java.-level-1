public class Dog extends Animal {

    public Dog(String name){
        this.name = name;
        this.maxRun = random.nextInt(101) + 500;
        this.maxJump = random.nextDouble() + 0.5;
        this.maxSwim = random.nextInt(3) + 9;
    }

}
