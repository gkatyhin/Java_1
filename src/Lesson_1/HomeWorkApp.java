package Lesson_1;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    //    №_2 метод
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //    №_3 метод
    public static void checkSumSign() {
        int a = 13;
        int b = 33;
        int sum = a + b ;
        if (sum >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    //    №_4 метод
    public static void printColor() {
        int value = 0;
        if (value <= 0){
            System.out.println("Красный");
        } else if (value > 0 & value <= 100) {
            System.out.println("Жёлтый");
        }else {
            System.out.println("Зелёный");
        }
    }
    //    №_5 метод
    public static void compareNumbers() {
        int a = 13;
        int b = 33;
        if (a >= b){
            System.out.println("a >= b");
        }else {
            System.out.println("a < b");
        }

    }

}

