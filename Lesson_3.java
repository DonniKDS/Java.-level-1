import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson_3 {

    public static void main(String[] args) {
        //GuessNumberGame();
        GuessWordGame();
    }

    // 1-й пункт задания
    public static void GuessNumberGame() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = (int) (Math.random() * 10);                                                                           // первичное рандомное число
        int playerNum;
        int i = 2;

        try {
            System.out.println("Угадайте число от 0 до 9. У вас есть 3 попытки!");
            while (i >= 0) {
                playerNum = Integer.parseInt(reader.readLine());
                if (i == 0) {
                    System.out.println("Вы проиграли.");
                    System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                    int over = Integer.parseInt(reader.readLine());
                    if (over == 1) {
                        num = (int) (Math.random() * 10);                                                               // новое рандомное число, если игра начинается заново
                        System.out.println("Угадайте число от 0 до 9. У вас есть 3 попытки!");
                        i = 2;
                        playerNum = Integer.parseInt(reader.readLine());
                    } else break;
                }
                if (num > playerNum) {
                    System.out.println("Загадоное число больше. У вас осталось попыток: " + i);
                    i--;
                } else if (num < playerNum) {
                    System.out.println("Загаданое число меньше. У вас осталось попыток: " + i);
                    i--;
                } else {                                                                                                // если игрок угадал, начинается этот блок
                    System.out.println("Вы угадали!");
                    System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                    int over = Integer.parseInt(reader.readLine());
                    if (over == 1) {
                        num = (int) (Math.random() * 10);                                                               // новое рандомное число, если игра начинается заново
                        System.out.println("Угадайте число от 0 до 9. У вас есть 3 попытки!");
                        i = 2;
                    } else break;
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Простите, что-то пошло не так :( ");
            e.printStackTrace();
        }
        catch (NumberFormatException e){
            System.out.println("Число введено некорректно!");
        }
    }

    // 2-й пункт задания
    public static void GuessWordGame(){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};
        String randomWord = words[(int)(Math.random() * words.length)];                                                 // загадали рандомное слово из масива
        String playerWord;

        try {
            System.out.println("Добро пожаловать в игру \"Угадай слово\"! Правила просты, вам нужно угадать слово! :)");
            playerWord = reader.readLine();
            while (true){
                if (randomWord.equalsIgnoreCase(playerWord)) {
                    System.out.println("Вы победили! Хотите сыграть еще? Тогда введите \"Yes\"");
                    playerWord = reader.readLine();
                    if(playerWord.equalsIgnoreCase("yes")){
                        randomWord = words[(int)(Math.random() * words.length)];
                        System.out.println("Тогда вперед, угадывать! :)");
                    }
                    else break;
                }
                else{
                    String answer = "";
                    String smallerWord;
                    if (playerWord.length() < randomWord.length()) smallerWord = playerWord;
                    else smallerWord = randomWord;
                    for (int i = 0; i < smallerWord.length(); i++){
                        if (playerWord.charAt(i) == randomWord.charAt(i)){
                            answer = answer + playerWord.charAt(i);
                        }
                        else answer = answer + "#";
                    }
                    String s = "";
                    for (int j = 0; j < 15-answer.length(); j++){
                        s += '#';
                    }
                    System.out.println(answer + s);
                }
                playerWord = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Простите, что-то пошло не так :( ");
            e.printStackTrace();
        }

    }
}
