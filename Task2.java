public class Task2 {
    public static void main(String[] args) {
        System.out.println(triArea(3, 2));
        System.out.println(triArea(7, 4));
        System.out.println(triArea(10, 10));
    }
    //Этот метод получает на вход основание и высоту треугольника и возвращает площадь по формуле S = 0.5ah
    public static double triArea(int a, int h){
        return 0.5 * a * h;
    }
}
