public class Task1 {
    public static void main(String[] args) {
        System.out.println(remainder(1, 3));
        System.out.println(remainder(3, 4));
        System.out.println(remainder(-9, 45));
        System.out.println(remainder(5, 5));
    }
    //Этот метод принимает на вход два числа и возвращает остаток от деления двух чисел при помощи оператора "%"
    public static int remainder(int x1, int x2){
        return x1 % x2;
    }
}