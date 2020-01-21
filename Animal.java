import java.util.Random;

public abstract class Animal {

    Random random = new Random();
    protected String name;
    protected int maxRun;
    protected int maxSwim;
    protected int maxJump;

    public void run(int length){
        if (length <= maxRun){
            System.out.println(name + " пробежал " + length + " м.");
        }
        else System.out.println(name + " не может столько пробежать");
    }

    public void swim(int length){
        if (length <= maxSwim){
            System.out.println(name + " проплыл " + length + " м.");
        }
        else System.out.println(name + " не может столько проплыть");
    }

    public void jump(int height){
        if (height <= maxJump){
            System.out.println(name + " прыгнул на высоту " + height + " м.");
        }
        else System.out.println(name + " не может прыгать на такую высоту.");

    }
}
