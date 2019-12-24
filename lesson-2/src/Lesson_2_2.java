import java.util.Random;

public class Lesson_2_2 {
    public static void main(String[] args) {
        // создал массив на 10 эллементов с рандомными числами от 0 до 9
        Random random = new Random();
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(10);
        }
        // выводим массив в консоль
        for (Integer num : nums){
            System.out.print(num + " ");
        }
        System.out.println(checkBalance(nums));

        // проверка на true
        int[] nums2 = new int[]{2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(nums2));
        // проверка на false
        int[] nums3 = new int[]{0, 2, 3};
        System.out.println(checkBalance(nums3));
    }

    // 6-й пункт задания
    public static boolean checkBalance(int[] nums){
        boolean index = false;
        for (int i = 1; i < nums.length; i++){
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < nums.length - i; j++){
                sum1 += nums[j];
            }
            for (int k = nums.length - i; k < nums.length; k++){
                sum2 += nums[k];
            }
            if (sum1 == sum2) {
                index = true;
                break;
            }
        }
        return index;
    }
}
