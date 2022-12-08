public class Main {
    public static void main(String[] args) {
        task5();
        task6();
        task7();
    }
    public static void task5() {
            System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4)
            System.out.println(i+" год является високосным");
    }
    public static void task6() {
        System.out.println("Задача 6");
        for (int f = 7; f <= 98; f = f + 7)
            System.out.println(f);
    }
    public static void task7() {
        System.out.println("Задача 7");
        for (int a = 1; a <= 512; a = a * 2)
            System.out.println(a);
    }
}