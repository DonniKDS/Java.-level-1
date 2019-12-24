import java.util.Random;

public class Lesson_2_3 {
    // Написать метод, которому на вход подается одномерный
    // массив и число n (может быть положительным, или отрицательным),
    // при этом метод должен сместить все элементы массива на n
    // позиций. Для усложнения задачи нельзя пользоваться
    // вспомогательными массивами.
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[10];
//        for (int i = 0; i < nums.length; i++){
//            nums[i] = random.nextInt(10);
//        }
        for (int i = 0; i < nums.length; i++){
            nums[i]=i;
        }
        for (int num : nums){
            System.out.print(num + " ");
        }
        System.out.println();

        int[]nums2 = new int[nums.length-1];
        nums2 = displacement(nums, -3);
        for (int num : nums2){
            System.out.print(num + " ");
        }

    }

    public static int[] displacement(int[]nums, int n){
        int a;
        if (n > 0){
            while (n > 0){
                for (int i = 0; i < nums.length - 1; i++){
                    a = nums[i + 1];
                    nums[i + 1] = nums[i];
                    nums[i] = a;
                }
                n--;
            }
        }
        else if (n < 0){
            while (n < 0){
                for (int i = nums.length-1; i > 0; i--){
                    a = nums[i - 1];
                    nums[i - 1] = nums[i];
                    nums[i] = a;
                }
                n++;
            }
        }
        else {
            System.out.println("Какой-такой сдвиг на 0?");
        }
        return nums;
    }

}
