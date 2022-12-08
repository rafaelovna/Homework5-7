public class Main {
    public static void main(String[] args) {
        task5();
        task6();
        task7();
    }
    public static void task5() {
        System.out.println("Задача 5");
        for (int year = 1904; year <= 2096; year = year + 4) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            }
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        for (int f = 7; f <= 98; f = f + 7) {
            System.out.print(f + " ");
        }
        System.out.println();
    }
    public static void task7() {
        System.out.println("Задача 7");
        for (int a = 1; a <= 512; a = a * 2) {
            System.out.print(a + " ");
        }
    }
}