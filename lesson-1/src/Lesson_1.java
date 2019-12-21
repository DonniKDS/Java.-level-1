public class Lesson_1 {

    // переменные для проверки методов
    static int a = -5;
    static int b = 5;
    static int c = 10;
    static int d = 20;
    // 1-й пункт задания.
    public static void main(String[] args) {
        System.out.println( task(a, b, c, d));
        System.out.println(verificationSummation(a, b));
        System.out.println(verificationSummation(b, c));
        System.out.println(verificationSummation(c, d));
        positiveOrNegative(a);
        positiveOrNegative(b);
        System.out.println(negativeNumber(a));
        System.out.println(negativeNumber(b));
        hello("Денис");
        leapYear(1901); //невисокосный
        leapYear(1904); //високосный
        leapYear(2000); //вискосный (каждый 400-й)
        leapYear(1900); //невисокосный (каждый 100-й)
    }

    // 2-й пункт задания.
    byte aByte = 1;
    short aShort = 2;
    int aInt = 3;
    long aLong = 4L;
    float aFloat = 3.2f;
    double aDouble = 8.5;
    char aChar = '2';
    boolean aBoolean = false;

    // 3-й пункт задания.
    public static int task(int a, int b, int c, int d){
        return a*(b+(c/d));
    }

    // 4-й пункт задания.
    public static boolean verificationSummation(int a, int b){
        int sum = a + b;
        if (sum > 10 && sum <= 20){
            return true;
        }
        else return false;
    }

    // 5-й пункт задания.
    public static void positiveOrNegative(int a){
        if(a >= 0){
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }

    // 6-й пункт задания.
    public static boolean negativeNumber(int a){
        if (a < 0){
            return true;
        }
        else return false;
    }

    // 7-й пункт задания.
    public static void hello(String name){
        System.out.println("Привет, " + name + "!");
    }

    // 8-й пункт задания.
    public static void leapYear(int year){
        boolean check; //флажок
        if (year%4 == 0){
            if (year%400 == 0){
                check = true;
            }
            else if (year%100 == 0){
                check = false;
            }
            else {
                check = true;
            }
        }
        else {
            check = false;
        }

        if (check){
            System.out.println("Год является високосным.");
        }
        else {
            System.out.println("Год не является високосным.");
        }
    }
}