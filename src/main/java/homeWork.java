import java.util.Scanner;
public class homeWork {
    public static void main(String[] args) {
        printThreeWords();
        cheсkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void cheсkSumSign(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        int c = a + b;
        if(c >= 0){
            System.out.println("Сумма положительная.");
        }
        else {
            System.out.println("Сумма отрицательная.");
        }
    }
    public static void printColor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число:");
        int value = scanner.nextInt();
        if(value <= 0){
            System.out.println("Красный");
        }
        else if(value > 0 && value <= 100){
            System.out.println("Желтый");
        }
        else{
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение числа а:");
        int a = scanner.nextInt();
        System.out.println("Введите значение числа b:");
        int b = scanner.nextInt();
        if(a >= b){
            System.out.println("a >=b");
        }
        else{
            System.out.println("a < b");
        }
    }

}
