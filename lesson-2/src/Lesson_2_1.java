import java.util.Random;

public class Lesson_2_1 {

    public static void main(String[] args) {
        // 1-й пункт задания
        int[] nums = new int[] { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                nums[i] = 1;
            }
            else nums[i] = 0;
        }
        // проверка
//        for(Integer num : nums){
//            System.out.print(num + ", ");
//        }

        // 2-й пункт задания
        int[] nums2 = new int[10];
        for (int i = 0; i < nums2.length; i++){
            nums2[i] = i*3;
        }
        // проверка
//        for(Integer num : nums2){
//            System.out.print(num + ", ");
//        }

        // 3-й пункт задания
        int[] nums3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < nums3.length; i++){
            if (nums3[i] < 6){
                nums3[i] *= 2;
            }
        }
        // проверка
//        for(Integer num : nums3){
//            System.out.print(num + ", ");
//        }

        // 4-й пункт задания
        int[][] diagonal = new int[10][10];
        for(int i = 0; i < diagonal.length; i++){
            for(int j = 0; j < diagonal.length; j++){
                if (i == j){
                    diagonal[i][j] = 1;
                }
            }
        }
        // проверка
//        for(int i = 0; i < diagonal.length; i++){
//            for(int j = 0; j < diagonal.length; j++){
//                System.out.print(diagonal[i][j] + " ");
//            }
//            System.out.println("");
//        }

        // 5-й пункт задания
        int[] nums5 = new int[10];
        // создал массив рандомных чисел
        Random random = new Random();
        for (int i = 0; i < nums5.length; i++){
            nums5[i] = random.nextInt(100);
        }
        // продолжил задание
        int max = nums5[0];
        int indexMax = 0;
        int min = nums5[0];
        int indexMin = 0;
        for (int i = 0; i < nums5.length; i++){
            if (max < nums5[i]){
                max = nums5[i];
                indexMax = i;
            }
            if (min > nums5[i]){
                min = nums5[i];
                indexMax = i;
            }
        }
        // закомментирую вывод, чтобы не мешал проверке остальных пунктов
//        System.out.println("Максимальное число = " + max + ". Его индекс - " + indexMax + ".");
//        System.out.println("Минимальное число = " + min + ". Его индекс - " + indexMin + ".");

        // сам массив, для наглядности
//        for(Integer num : nums5){
//            System.out.print(num + ", ");
//        }
        // 6-й и 7-й пункты будут в отдельном классе
    }
}
