public class Dog extends Animal {

    private double maxJump;

    public Dog(String name){
        this.name = name;
        this.maxRun = random.nextInt(101) + 500;
        this.maxJump = random.nextDouble()*0.2 + 0.4;
        this.maxSwim = random.nextInt(3) + 9;
    }

    public void jump(double height){
        if (height <= maxJump){
            System.out.println(name + " прыгнул на высоту " + height + " м.");
        }
        else System.out.println(name + " не может прыгать на такую высоту.");

    }

}
