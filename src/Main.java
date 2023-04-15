import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        task1();
    }

    private static void task1() {
        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));

        int salarySum = 0;

        for (int salary : salaryArray) {
            salarySum += salary;}
           System.out.println("Сумма трат за месяц составила " + salarySum + " рублей");
        //task 2;
        Arrays.sort(salaryArray);
        System.out.println("Минимальная выплата " + salaryArray[0] + ", максимальная выплата " + salaryArray[29]);
//task 3;
        double salaryAverage = 0;
        for (int salary : salaryArray) {
            salaryAverage += salary/30;}
        System.out.println("Средняя сумма трат за месяц составила " + salaryAverage + " рублей.");

//task 4;
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int n = reverseFullName.length - 1; n >=0; n--)
            System.out.print(reverseFullName[n]);
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



