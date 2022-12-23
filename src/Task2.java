import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        //Каждый день месяца, включая выходные, компания тратит некую сумму.
        // Суммы записываются в бухгалтерскую книгу по дням. В книге 30 записей разных чисел,
        // которые разнятся от 100 000 до 200 000.
        //Создайте модель бухгалтерской книги — массив из случайных чисел от 100 000 до 200 000.
        // Также бухгалтерия попросила найти минимальную и максимальную трату за день.
        //Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
        // «Минимальная сумма трат за день составила … рублей.
        // Максимальная сумма трат за день составила … рублей».
        task2();
    }
    public static int[] generateRandomArray() {
        Random rnd =new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(100_000,200_000);
            System.out.println(arr[i]);
        }
        return arr;
    }
    public static void task2() {
        int[] arr = generateRandomArray();
        int max = arr[0];//принимаем за максимум первое число массива
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];//сохраняем в максимуме число, соответствующее условию
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.printf("Максимальная сумма трат за день составила %d рублей", max);
        System.out.println();
        System.out.printf("Минимальная сумма трат за день составила %d рублей", min);
    }

}
