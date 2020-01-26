public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (satiety == false){
            int i = p.getFood();
            p.decreaseFood(appetite);
            if (i == p.getFood()){
                System.out.println("МЯЯЯЯЯУУУУУУУ! **ПРОСИТ ЕДУ**");
            }
            else satiety = true;
        }
        else System.out.println("Кот не голоден");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) { this.name = name; }

    public int getAppetite() {
        return appetite;
    }
    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }
    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
}
