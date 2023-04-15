import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        task1();
    }

    private static void task1() {
        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));

        int salarySum = 0;

        for (int salary: salaryArray) {
            salarySum += salary;
        }

        System.out.println("Сумма трат за месяц составила " + salarySum + " рублей");
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
