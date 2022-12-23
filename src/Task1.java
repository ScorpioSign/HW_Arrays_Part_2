import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        //Каждый день месяца, включая выходные, компания тратит некую сумму.
        // Суммы записываются в бухгалтерскую книгу по дням. В книге 30 записей разных чисел,
        // которые разнятся от 100 000 до 200 000.
        //Создайте модель бухгалтерской книги — массив из случайных чисел от 100 000 до 200 000.
        // Бухгалтеры попросили посчитать сумму всех выплат за месяц.
        //Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
        // «Сумма трат за месяц составила … рублей».
           task1();
    }
    public static int[] generateRandomArray() {
        Random rnd =new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(100_000,200_000);
            System.out.println(arr[i]);// по условию не нужно, вывела для самоконтроля
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.printf("Сумма трат за месяц составила %d рублей", sum);
    }
}