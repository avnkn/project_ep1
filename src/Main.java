import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int initialSizeArray = 5;
        int[] nums = setArrayInput(initialSizeArray);

        System.out.println("Получившейся массив:");
        printArray(nums);

        System.out.println("Какое число вы хотите удалить в данном массиве?");
        int m = setIntInput();

        int[] newNums = delElementIsArray(nums, m);

        System.out.println("Получившейся массив:");
        printArray(newNums);
    }

    public static int[] setArrayInput (int size) {
        int[] nums = new int[size];
        Scanner in = new Scanner(System.in);
        System.out.println("Введите произвольное количество чисел (для остановки введите строку)");
        for(int i=0; true; i++){
            if (in.hasNextInt()) {
                if (i >= nums.length) {
                    nums = Arrays.copyOf(nums, nums.length * 2);
                }
                nums[i]= in.nextInt();
                System.out.println("Число " + nums[i] + " записано ");
                printArray(nums);

            } else {
                in.next();
                System.out.println("Ввод данных закончен");
                break;
            }
        }
        return nums;
    }

    public static int setIntInput() {
        int m;
        Scanner in = new Scanner(System.in);
        for (int i=0; true; i++) {
            if (in.hasNextInt()) {
                m = in.nextInt();
                break;
            } else {
                in.next();
                System.out.println("Ошибка, введите число");
            }
        }
        return m;
    }

    public static int[] delElementIsArray(int[] nums, int value) {
        for (int i=0; i < nums.length; i++) {
            if (nums[i] == value) {
                nums[i] = 0;
            }
        }
        return nums;
    }

    public static void printArray(int[] args) {
        String intArrayString = Arrays.toString(args);
        System.out.println(intArrayString);
    }
}
