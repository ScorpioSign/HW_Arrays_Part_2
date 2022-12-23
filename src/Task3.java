import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        //Каждый день месяца, включая выходные, компания тратит некую сумму.
        // Суммы записываются в бухгалтерскую книгу по дням. В книге 30 записей разных чисел,
        // которые разнятся от 100 000 до 200 000.
        //Создайте модель бухгалтерской книги — массив из случайных чисел от 100 000 до 200 000.
        // Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
        //Напишите программу, которая посчитает среднее значение трат за месяц
        // (то есть сумму всех трат за месяц поделить на количество дней),
        // и выведите в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
        task3();
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
    public static void task3() {
        int[] arr = generateRandomArray();
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", sum/ arr.length);
    }
}
